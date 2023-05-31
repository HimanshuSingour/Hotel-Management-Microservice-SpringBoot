package com.lwcd.hotel.service.RatingService.Entities;

import org.hibernate.annotations.NotFound;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "rating_table")
public class RatingEntities {
	
	@Id
	@Column(name = "Id")
	private String ratingId;
	
	@Column(name = "user_Id")
	private String userId;
	
	@Column(name = "Hotel_Id")
	private String hotelId;
	
	@Column(name = "ratings")
	private int rating;
	
	@Column(name = "feedback")
	private String feedback;
	
	

	public String getRatingId() {
		return ratingId;
	}

	public void setRatingId(String ratingId) {
		this.ratingId = ratingId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getHotelId() {
		return hotelId;
	}

	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	
	@Override
	public String toString() {
		return "RatingEntities [ratingId=" + ratingId + ", userId=" + userId + ", hotelId=" + hotelId + ", rating="
				+ rating + ", feedback=" + feedback + ", getRatingId()=" + getRatingId() + ", getUserId()="
				+ getUserId() + ", getHotelId()=" + getHotelId() + ", getRating()=" + getRating() + ", getFeedback()="
				+ getFeedback() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	

	public RatingEntities(String ratingId, String userId, String hotelId, int rating, String feedback) {
		super();
		this.ratingId = ratingId;
		this.userId = userId;
		this.hotelId = hotelId;
		this.rating = rating;
		this.feedback = feedback;
	}
	

	public RatingEntities() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
