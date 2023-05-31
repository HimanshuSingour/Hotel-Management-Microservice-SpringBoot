package com.lcwd.user.service.UserService.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;


@Entity
@Table(name = "user_table")
public class UserEntities {

	@Id
	@Column(name = "Id")
	private String userId;
	
	@Column(name = "FirstName")
	private String firstName;
	
	@Column(name = "LastName")
	private String lastName;
	
	@Column(name = "Email")
	private String email;
	
	@Column(name = "Location")
	private String location;
	
	@Column(name = "Working")
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

	public UserEntities(String userId, String firstName, String lastName, String email, String location, String working,
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

	@Override
	public String toString() {
		return "UserEntities [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", location=" + location + ", working=" + working + ", ratings=" + ratings + ", getUserId()="
				+ getUserId() + ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName()
				+ ", getEmail()=" + getEmail() + ", getLocation()=" + getLocation() + ", getWorking()=" + getWorking()
				+ ", getRatings()=" + getRatings() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public UserEntities() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
