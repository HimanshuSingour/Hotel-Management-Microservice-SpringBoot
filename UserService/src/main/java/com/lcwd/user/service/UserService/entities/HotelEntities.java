package com.lcwd.user.service.UserService.entities;

public class HotelEntities {

	private String HotelId;

    private String hotelName;

	private String hotelLocation;

	private String HotelAbout;

	public String getHotelId() {
		return HotelId;
	}

	public void setHotelId(String hotelId) {
		HotelId = hotelId;
	}

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
		return "HotelEntities [HotelId=" + HotelId + ", hotelName=" + hotelName + ", hotelLocation=" + hotelLocation
				+ ", HotelAbout=" + HotelAbout + ", getHotelId()=" + getHotelId() + ", getHotelName()=" + getHotelName()
				+ ", getHotelLocation()=" + getHotelLocation() + ", getHotelAbout()=" + getHotelAbout()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public HotelEntities(String hotelId, String hotelName, String hotelLocation, String hotelAbout) {
		super();
		HotelId = hotelId;
		this.hotelName = hotelName;
		this.hotelLocation = hotelLocation;
		HotelAbout = hotelAbout;
	}

	public HotelEntities() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
