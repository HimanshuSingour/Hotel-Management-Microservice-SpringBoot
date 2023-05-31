package com.example.rating.service.Service;

import java.util.List;

import com.example.rating.service.DTO.HotelDTO;

public interface HotelService {
	
	//create
	HotelDTO saveHotel(HotelDTO hoteldto);
	
	//getAll
	List<HotelDTO> getAll();
	
	//getHotelById
	HotelDTO getHotelById(String hotelId);
	
	
    
}
