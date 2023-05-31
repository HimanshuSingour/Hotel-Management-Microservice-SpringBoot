
package com.lwcd.hotel.service.RatingService.ServiceImple;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lwcd.hotel.service.RatingService.DTO.RatingDTO;
import com.lwcd.hotel.service.RatingService.Entities.RatingEntities;
import com.lwcd.hotel.service.RatingService.Repositories.RatingRepositories;
import com.lwcd.hotel.service.RatingService.Service.RatingService;

@Service
public class RatingServiceImple implements RatingService {
	
	@Autowired
	private RatingRepositories ratingrepositories;

	@Override
	public RatingDTO create(RatingDTO ratingdto) {
		
		RatingEntities rating = dtoTorating(ratingdto);
		String rando = UUID.randomUUID().toString();
		rating.setRatingId(rando);
		
		RatingEntities newsone = ratingrepositories.save(rating);
		
		RatingDTO dtos = ratingToDto(newsone);
		
		dtos.setRatingId(rando);
		
		return dtos;
		
	}

	@Override
	public List<RatingDTO> getAll() {
		
		List<RatingEntities> news = ratingrepositories.findAll();
		List<RatingDTO> newdtos = news.stream().map((e) -> ratingToDto(e)).collect(Collectors.toList());
		return newdtos;
	}

	@Override
	public List<RatingDTO> getRatingByUser(String userId) {
		
		List<RatingEntities> ratings = ratingrepositories.findByUserId(userId);
		List<RatingDTO> newdtos = ratings.stream().map((e) -> ratingToDto(e)).collect(Collectors.toList());
		return newdtos;
		
	
	}

	@Override
	public List<RatingDTO> getRatingByHotel(String hotelId) {
		List<RatingEntities> ratings = ratingrepositories.findByHotelId(hotelId);
		List<RatingDTO> newdtos = ratings.stream().map((e) -> ratingToDto(e)).collect(Collectors.toList());
		return newdtos;
		
	}
	
	//conversion
	public RatingDTO ratingToDto(RatingEntities rating) {
		
		RatingDTO r = new RatingDTO();
		r.setUserId(rating.getUserId());
		r.setFeedback(rating.getFeedback());
		r.setHotelId(rating.getHotelId());
		r.setRating(rating.getRating());
		return r;
		
		
	}
	
	public RatingEntities dtoTorating(RatingDTO dtos) {
		
		RatingEntities r = new RatingEntities();
		r.setUserId(dtos.getUserId());
		r.setFeedback(dtos.getFeedback());
		r.setHotelId(dtos.getHotelId());
		r.setRating(dtos.getRating());
		return r;
		
	}

}
