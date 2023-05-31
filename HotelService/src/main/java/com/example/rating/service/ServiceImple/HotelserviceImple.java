package com.example.rating.service.ServiceImple;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rating.service.DTO.HotelDTO;
import com.example.rating.service.Entities.HotelEntities;
import com.example.rating.service.ExceptionHandling.ResourceNotFoundException;
import com.example.rating.service.Repositories.HotelRepositories;
import com.example.rating.service.Service.HotelService;

@Service
public class HotelserviceImple implements HotelService {

	@Autowired
	private HotelRepositories hotelrepositoreis;
	 
	@Override
	public HotelDTO saveHotel(HotelDTO hoteldto) {
		
		HotelEntities hotel = dtoToUser(hoteldto);
		String randomUserId = UUID.randomUUID().toString();
		hotel.setHotelId(randomUserId);
		HotelEntities saveuser = hotelrepositoreis.save(hotel);
		HotelDTO convert = hoteltoDTO(saveuser);
		return convert;
		
	}
	
	@Override
	public List<HotelDTO> getAll() {
		
		List<HotelEntities> hotels = hotelrepositoreis.findAll();
		List<HotelDTO> dtos = hotels.stream().map((e) -> hoteltoDTO(e)).collect(Collectors.toList());
		return dtos;
	}
	
	public HotelDTO getHotelById(String hotelId) {
		
		HotelEntities findone = hotelrepositoreis.findById(hotelId)
				.orElseThrow(() -> new ResourceNotFoundException("Hotel With Give Id Is Not Found"));
		HotelDTO dtos = hoteltoDTO(findone);
		return dtos;
		
	}

	
   public HotelDTO hoteltoDTO(HotelEntities hotel) {
		
	    HotelDTO u = new HotelDTO();
	    u.setHotelName(hotel.getHotelName());
	    u.setHotelLocation(hotel.getHotelLocation());
	    u.setHotelAbout(hotel.getHotelAbout());
		return u;
		
	}
	
	public HotelEntities dtoToUser(HotelDTO hoteldto) {
		
		HotelEntities u = new HotelEntities();
		 u.setHotelName(hoteldto.getHotelName());
		 u.setHotelLocation(hoteldto.getHotelLocation());
		 u.setHotelAbout(hoteldto.getHotelAbout());
		
		return u;
		
		
	}

	

}
