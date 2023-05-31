package com.lwcd.hotel.service.RatingService.Service;

import java.util.List;

import com.lwcd.hotel.service.RatingService.DTO.RatingDTO;

public interface RatingService {
	
	//create
	RatingDTO create(RatingDTO ratingdto);
    
	//get all rating
	List<RatingDTO> getAll();
	
	//get all by users
	List<RatingDTO> getRatingByUser(String userId);
	
	//get all by hotel
	List<RatingDTO> getRatingByHotel(String hotelId);
}
