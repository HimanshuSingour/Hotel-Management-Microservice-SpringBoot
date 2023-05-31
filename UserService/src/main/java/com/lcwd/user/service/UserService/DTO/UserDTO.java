package com.lcwd.user.service.UserService.DTO;

import java.util.ArrayList;
import java.util.List;

import com.lcwd.user.service.UserService.entities.RatingEntities;

import jakarta.persistence.Transient;

public class UserDTO {
	
	private String userId;
	
	private String firstName;
	
	private String lastName;
	
	private String email;
	
	private String location;
	
	private String working;
	
	@Transient
    private List<RatingEntities> ratings=new ArrayList<>();

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getWorking() {
		return working;
	}

	public void setWorking(String working) {
		this.working = working;
	}

	public List<RatingEntities> getRatings() {
		return ratings;
	}

	public void setRatings(List<RatingEntities> ratings) {
		this.ratings = ratings;
	}

	@Override
	public String toString() {
		return "UserDTO [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", location=" + location + ", working=" + working + ", ratings=" + ratings + ", getUserId()="
				+ getUserId() + ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName()
				+ ", getEmail()=" + getEmail() + ", getLocation()=" + getLocation() + ", getWorking()=" + getWorking()
				+ ", getRatings()=" + getRatings() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public UserDTO(String userId, String firstName, String lastName, String email, String location, String working,
			List<RatingEntities> ratings) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.location = location;
		this.working = working;
		this.ratings = ratings;
	}

	public UserDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
