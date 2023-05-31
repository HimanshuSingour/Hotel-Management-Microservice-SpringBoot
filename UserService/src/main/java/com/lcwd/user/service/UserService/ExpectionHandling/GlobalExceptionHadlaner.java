package com.lcwd.user.service.UserService.ExpectionHandling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.lcwd.user.service.UserService.payloads.ApiResponse;

@ControllerAdvice
public class GlobalExceptionHadlaner {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ApiResponse> handleResourceNotFoundException(ResourceNotFoundException ex){
		
		String message = ex.getMessage();
		ApiResponse api = new ApiResponse(message , false , HttpStatus.NOT_FOUND);
		return new ResponseEntity<ApiResponse>(api , HttpStatus.NOT_FOUND);
		
	}
}
