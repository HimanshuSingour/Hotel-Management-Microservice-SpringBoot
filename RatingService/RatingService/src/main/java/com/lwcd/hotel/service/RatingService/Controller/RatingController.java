package com.lwcd.hotel.service.RatingService.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lwcd.hotel.service.RatingService.DTO.RatingDTO;
import com.lwcd.hotel.service.RatingService.Service.RatingService;

@RestController
@RequestMapping("/rating")
public class RatingController {
	
	@Autowired
	private RatingService ratingservice;
	
	@PostMapping("/save")
	ResponseEntity<RatingDTO> save(@RequestBody RatingDTO ratingdto){
		RatingDTO dtos = ratingservice.create(ratingdto);
		return new ResponseEntity<RatingDTO>(dtos, HttpStatus.CREATED);
	}
	
	@GetMapping("/all")
	ResponseEntity<List<RatingDTO>> getALLRatings(){
		List<RatingDTO> dtos = ratingservice.getAll();
		return new ResponseEntity<List<RatingDTO>>(dtos, HttpStatus.OK);
	}
	
	@GetMapping("/users/{userId}")
	ResponseEntity<List<RatingDTO>> getRatingByUser(@PathVariable String userId){
		List<RatingDTO> dtos = ratingservice.getRatingByUser(userId);
		return new ResponseEntity<List<RatingDTO>>(dtos, HttpStatus.OK);
	}
	
	@GetMapping("/hotels/{hotelId}")
	ResponseEntity<List<RatingDTO>> getRatingByHotel(@PathVariable String hotelId){
		List<RatingDTO> dtos = ratingservice.getRatingByHotel(hotelId);
		return new ResponseEntity<List<RatingDTO>>(dtos, HttpStatus.OK);
	}
	
	
	
     
     
	
	
}
