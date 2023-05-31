package com.example.rating.service.DTO;

public class HotelDTO {
	
    private String hotelName;
		
	private String hotelLocation;
		
	private String HotelAbout;

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getHotelLocation() {
		return hotelLocation;
	}

	public void setHotelLocation(String hotelLocation) {
		this.hotelLocation = hotelLocation;
	}

	public String getHotelAbout() {
		return HotelAbout;
	}

	public void setHotelAbout(String hotelAbout) {
		HotelAbout = hotelAbout;
	}

	@Override
	public String toString() {
		return "HotelDTO [hotelName=" + hotelName + ", hotelLocation=" + hotelLocation + ", HotelAbout=" + HotelAbout
				+ ", getHotelName()=" + getHotelName() + ", getHotelLocation()=" + getHotelLocation()
				+ ", getHotelAbout()=" + getHotelAbout() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public HotelDTO(String hotelName, String hotelLocation, String hotelAbout) {
		super();
		this.hotelName = hotelName;
		this.hotelLocation = hotelLocation;
		HotelAbout = hotelAbout;
	}

	public HotelDTO() {
		super();
		// TODO Auto-generated constructor stub
	}



}
