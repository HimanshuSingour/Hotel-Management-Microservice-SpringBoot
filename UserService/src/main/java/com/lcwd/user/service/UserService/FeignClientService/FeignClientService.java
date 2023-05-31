package com.lcwd.user.service.UserService.FeignClientService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.lcwd.user.service.UserService.entities.HotelEntities;

@FeignClient("HOTEL-SERVICE")
public interface FeignClientService {
	
	@GetMapping("hotel/get/{hotelId}")
	public HotelEntities getHotel(@PathVariable("hotelId") String hotelId);

}
