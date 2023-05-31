package com.lcwd.user.service.UserService.UserServiceImple;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.lcwd.user.service.UserService.DTO.UserDTO;
import com.lcwd.user.service.UserService.ExpectionHandling.ResourceNotFoundException;
import com.lcwd.user.service.UserService.FeignClientService.FeignClientService;
import com.lcwd.user.service.UserService.Repository.UserRepository;
import com.lcwd.user.service.UserService.Service.UserService;
import com.lcwd.user.service.UserService.entities.HotelEntities;
import com.lcwd.user.service.UserService.entities.RatingEntities;
import com.lcwd.user.service.UserService.entities.UserEntities;


@Service
public class UserServiceImple implements UserService {
	
	@Autowired
	private UserRepository userrepository;
	
	@Autowired
	private RestTemplate resttemplet;
	
	@Autowired
	private FeignClientService feignclientservice;
	
	@Override
	public UserDTO createUser(UserDTO userdto) {
		
		UserEntities user = dtoToUser(userdto);
		
		String randomUserId = UUID.randomUUID().toString();
		user.setUserId(randomUserId);
		
		UserEntities saveuser = userrepository.save(user);
		UserDTO convert = userToDTO(saveuser);
		
		convert.setUserId(randomUserId);
		
		return convert;
	}

	@Override
	public UserDTO updateUser(UserDTO userdto, String userId) {
		
		UserEntities user = userrepository.findById(userId)
				.orElseThrow(() -> new ResourceNotFoundException("User" , "id" , userId));
		
		user.setFirstName(userdto.getFirstName());
		user.setLastName(userdto.getLastName());
		user.setEmail(userdto.getEmail());
		user.setLocation(userdto.getLocation());
		user.setWorking(userdto.getWorking());
		
		UserEntities updatedone = userrepository.save(user);
		UserDTO convert = userToDTO(updatedone);
		return convert;
	}

	@Override
	public void deletUser(String userId) {
	    
		UserEntities user = userrepository.findById(userId)
				.orElseThrow(() -> new ResourceNotFoundException("User" , "id" , userId));;
		userrepository.delete(user);
	}
	
	@Override
	public UserDTO getSingleUser(String userId) {
		
		UserEntities user = userrepository.findById(userId)
				.orElseThrow(() -> new ResourceNotFoundException("User" , "id" , userId));
		
		// get rating of the above user from RATING SERVICE
		//http://localhost:8082/rating/users/130ded06-5cfc-4e6a-9987-c09dbc02c42a
		
		RatingEntities[] ratingOfUsers = resttemplet
				 .getForObject("http://localhost:8082/rating/users/" + user.getUserId(), RatingEntities[].class);

		List<RatingEntities> ratings = Arrays.stream(ratingOfUsers).toList();
		        
		ratings.stream().map(rating -> {
			
//		ResponseEntity<HotelEntities> forentity = resttemplet
//				.getForEntity("http://localhost:8081/hotel/get/" + rating.getHotelId() , HotelEntities.class);
			
//			HotelEntities hotel = forentity.getBody();
			HotelEntities hotel = feignclientservice.getHotel(rating.getHotelId());
			
			rating.setHotel(hotel);
			return rating;
			
		}).collect(Collectors.toList());
		
		UserDTO convert = userToDTO(user);
		convert.setRatings(ratings);
	
		return convert;
	}

	@Override
	public List<UserDTO> getAllUser() {
		
		List<UserEntities> user = userrepository.findAll();
		List<UserDTO> convert = user.stream().map(e -> userToDTO(e)).collect(Collectors.toList());
		return convert;
	}
	
	// conversion
	public UserDTO userToDTO(UserEntities user) {
		
		UserDTO u = new UserDTO();
		u.setFirstName(user.getFirstName());
		u.setLastName(user.getLastName());
		u.setEmail(user.getEmail());
		u.setLocation(user.getLocation());
		u.setWorking(user.getWorking());
		return u;
	}
	
	public UserEntities dtoToUser(UserDTO userdto) {
		
		UserEntities u = new UserEntities();
		u.setFirstName(userdto.getFirstName());
		u.setLastName(userdto.getLastName());
		u.setEmail(userdto.getEmail());
		u.setLocation(userdto.getLocation());
		u.setWorking(userdto.getWorking());
		return u;
	}
}
