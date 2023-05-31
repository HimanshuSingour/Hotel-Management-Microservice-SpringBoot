package com.example.rating.service.Controller;

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

import com.example.rating.service.DTO.HotelDTO;
import com.example.rating.service.Service.HotelService;

@RestController
@RequestMapping("/hotel")
public class HotelController {
      
	@Autowired
	private HotelService hotelservice;
	
	@PostMapping("/save")
	ResponseEntity<HotelDTO> savehotel(@RequestBody HotelDTO hoteldto){
		HotelDTO newhotel = hotelservice.saveHotel(hoteldto);
		return new ResponseEntity<HotelDTO>(newhotel , HttpStatus.CREATED);
	}
	
	@GetMapping("/all")
	ResponseEntity<List<HotelDTO>> getAll(){
		List<HotelDTO> newhotel = hotelservice.getAll();
		return new ResponseEntity<List<HotelDTO>>(newhotel , HttpStatus.OK);
	}
	
	@GetMapping("/get/{hotelId}")
	ResponseEntity<HotelDTO> getHotelById(@PathVariable String hotelId){
		HotelDTO dtos = hotelservice.getHotelById(hotelId);
		return new ResponseEntity<HotelDTO>(dtos , HttpStatus.OK);
		
	}

}
