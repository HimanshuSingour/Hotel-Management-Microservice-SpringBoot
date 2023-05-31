package com.example.rating.service.ExceptionHandling;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandling {

	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<Map<String, Object>> ResourceNotFoundExceptionHandler(ResourceNotFoundException ex){
		
		Map map = new HashMap<>();
		
		map.put("message" , ex.getMessage());
		map.put("success" , false);
		map.put("status" , HttpStatus.NOT_FOUND);
		
		
		return new ResponseEntity<Map<String, Object>>(HttpStatus.NOT_FOUND);
		
	}
	
}
