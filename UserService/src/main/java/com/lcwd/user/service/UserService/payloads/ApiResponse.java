package com.lcwd.user.service.UserService.payloads;

import org.springframework.http.HttpStatus;


public class ApiResponse {
	
	private String message;
	private boolean String;
	private HttpStatus https;

	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isString() {
		return String;
	}
	public void setString(boolean string) {
		String = string;
	}
	public HttpStatus getHttps() {
		return https;
	}
	public void setHttps(HttpStatus https) {
		this.https = https;
	}
	
	@Override
	public String toString() {
		return "ApiResponse [message=" + message + ", String=" + String + ", https=" + https + ", getMessage()="
				+ getMessage() + ", isString()=" + isString() + ", getHttps()=" + getHttps() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	public ApiResponse(java.lang.String message, boolean string, HttpStatus https) {
		super();
		this.message = message;
		String = string;
		this.https = https;
	}
	
	public ApiResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
