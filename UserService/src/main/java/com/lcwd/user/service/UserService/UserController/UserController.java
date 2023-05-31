package com.lcwd.user.service.UserService.UserController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lcwd.user.service.UserService.DTO.UserDTO;
import com.lcwd.user.service.UserService.Service.UserService;
import com.lcwd.user.service.UserService.entities.UserEntities;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
    private UserService userservice;
	
	
	@PostMapping("/create")
	ResponseEntity<UserDTO> create(@RequestBody UserDTO userdto){
		UserDTO userd = userservice.createUser(userdto);
		return new ResponseEntity<UserDTO>(userd , HttpStatus.CREATED);
	}
	
	@PutMapping("/update/{userId}")
	ResponseEntity<UserDTO> update(@RequestBody UserDTO userdto , @PathVariable String userId){
		UserDTO userd = userservice.updateUser(userdto, userId);
		return new ResponseEntity<UserDTO>(userd , HttpStatus.OK);
	}
	
	@DeleteMapping("/delet/{userId}")
	ResponseEntity<UserDTO> delet(@PathVariable String userId){
		
		userservice.deletUser(userId);
		return new ResponseEntity<UserDTO>(HttpStatus.OK);	
	}
	

	@GetMapping("/get/{userId}")
//	@CircuitBreaker(name = "ratingHotelBreaker" , fallbackMethod = "ratingHotelFallBack") // for backup output
//	@Retry(name = "retryingHotelRating" , fallbackMethod = "ratingfallback")
	ResponseEntity<UserDTO> getSingle(@PathVariable String userId){
		UserDTO userdto = userservice.getSingleUser(userId);
		return ResponseEntity.ok(userdto);	
	}
	
	//creating fallback method for circuitBreaker or Retryable Modules
	public ResponseEntity<UserDTO> ratingHotelFallBack(String userId , Exception ex){
		
	    UserDTO user = new UserDTO();
		user.setWorking("Both ( RATING_SERVICE OR HOTEL_SERVICE )"
				+ " OR one of the service is Down. Right now these services are in mantainance...");
		return new ResponseEntity<UserDTO>(user , HttpStatus.OK);
			
	}
	
	
	@GetMapping("/all")
	ResponseEntity<List<UserDTO>> getall(){
		List<UserDTO> userdto = userservice.getAllUser();
		return new ResponseEntity<List<UserDTO>>(userdto , HttpStatus.OK);	
	}
	
}
