package com.lwcd.hotel.service.RatingService.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lwcd.hotel.service.RatingService.Entities.RatingEntities;

public interface RatingRepositories extends JpaRepository<RatingEntities, String>{
	
	List<RatingEntities> findByUserId(String userId);
	List<RatingEntities> findByHotelId(String hotelId);

}
