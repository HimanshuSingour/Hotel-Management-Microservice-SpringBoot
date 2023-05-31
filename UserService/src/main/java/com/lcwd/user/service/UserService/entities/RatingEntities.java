package com.lcwd.user.service.UserService.entities;

public class RatingEntities {
	
    private String ratingId;
    private String userId;
    private String hotelId;
    private  int rating;
    private  String feedback;
    
    private HotelEntities hotel;
    
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
	public HotelEntities getHotel() {
		return hotel;
	}
	public void setHotel(HotelEntities hotel) {
		this.hotel = hotel;
	}
	@Override
	public String toString() {
		return "RatingEntities [ratingId=" + ratingId + ", userId=" + userId + ", hotelId=" + hotelId + ", rating="
				+ rating + ", feedback=" + feedback + ", hotel=" + hotel + ", getRatingId()=" + getRatingId()
				+ ", getUserId()=" + getUserId() + ", getHotelId()=" + getHotelId() + ", getRating()=" + getRating()
				+ ", getFeedback()=" + getFeedback() + ", getHotel()=" + getHotel() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public RatingEntities(String ratingId, String userId, String hotelId, int rating, String feedback,
			HotelEntities hotel) {
		super();
		this.ratingId = ratingId;
		this.userId = userId;
		this.hotelId = hotelId;
		this.rating = rating;
		this.feedback = feedback;
		this.hotel = hotel;
	}
	public RatingEntities() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    

	
}
