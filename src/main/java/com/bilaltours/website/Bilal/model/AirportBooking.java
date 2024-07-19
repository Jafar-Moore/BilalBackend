package com.bilaltours.website.Bilal.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class AirportBooking {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long bookingId;
	    
	    private String customerName;
	    private String email;
	    private String phoneNumber;
	    private String roundTrip;
	    private String ArivalDate;
	    private String DepartureDate;
	    private String ArrivalTime;
	    private String DepartureTime;
	    private int numberOfTravelers;
	    private Double totalCost;
	    private String specialRequests;
	    private String landingAirport;
	    private String accommodation;
	    private String HotelLocation; 
	    
	    public AirportBooking() {
	        // Default constructor
	    }
	    
		public AirportBooking(Long bookingId, String customerName, String email, String phoneNumber, String roundtrip,
				String ariivalDate, String departureDate, String arrivalTime, String departureTime,
				int numberOfTravelers, Double totalCost, String specialRequests, String landingAirport,
				String accommodation, String hotelLocation ) {
			super();
			this.bookingId = bookingId;
			this.customerName = customerName;
			this.email = email;
			this.phoneNumber = phoneNumber;
			this.roundTrip = roundtrip;
			ArivalDate = ariivalDate;
			DepartureDate = departureDate;
			ArrivalTime = arrivalTime;
			DepartureTime = departureTime;
			this.numberOfTravelers = numberOfTravelers;
			this.totalCost = totalCost;
			this.specialRequests = specialRequests;
			this.landingAirport = landingAirport;
			this.accommodation = accommodation;
			HotelLocation = hotelLocation;
		}
		public Long getBookingId() {
			return bookingId;
		}
		public void setBookingId(Long bookingId) {
			this.bookingId = bookingId;
		}
		public String getCustomerName() {
			return customerName;
		}
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		public String getRoundTrip() {
			return roundTrip;
		}
		public void setRound(String roundtrip) {
			this.roundTrip = roundtrip;
		}
		public String getAriivalDate() {
			return ArivalDate;
		}
		public void setAriivalDate(String arivalDate) {
			ArivalDate = arivalDate;
		}
		public String getDepartureDate() {
			return DepartureDate;
		}
		public void setDepartureDate(String departureDate) {
			DepartureDate = departureDate;
		}
		public String getArrivalTime() {
			return ArrivalTime;
		}
		public void setArrivalTime(String arrivalTime) {
			ArrivalTime = arrivalTime;
		}
		public String getDepartureTime() {
			return DepartureTime;
		}
		public void setDepartureTime(String departureTime) {
			DepartureTime = departureTime;
		}
		public Integer getNumberOfTravelers() {
			return numberOfTravelers;
		}
		public void setNumberOfTravelers(Integer numberOfTravelers) {
			this.numberOfTravelers = numberOfTravelers;
		}
		public Double getTotalCost() {
			return totalCost;
		}
		public void setTotalCost(Double totalCost) {
			this.totalCost = totalCost;
		}
		public String getSpecialRequests() {
			return specialRequests;
		}
		public void setSpecialRequests(String specialRequests) {
			this.specialRequests = specialRequests;
		}
		public String getLandingAirport() {
			return landingAirport;
		}
		public void setLandingAirport(String landingAirport) {
			this.landingAirport = landingAirport;
		}
		public String getAccommodation() {
			return accommodation;
		}
		public void setAccommodation(String accommodation) {
			this.accommodation = accommodation;
		}
		public String getHotelLocation() {
			return HotelLocation;
		}
		public void setHotelLocation(String hotelLocation) {
			HotelLocation = hotelLocation;
		}

		@Override
		public String toString() {
			return "AirportBooking [bookingId=" + bookingId + ", customerName=" + customerName + ", email=" + email
					+ ", phoneNumber=" + phoneNumber + ", round=" + roundTrip + ", AriivalDate=" + ArivalDate
					+ ", DepartureDate=" + DepartureDate + ", ArrivalTime=" + ArrivalTime + ", DepartureTime="
					+ DepartureTime + ", numoftravelers=" + numberOfTravelers + ", totalCost=" + totalCost
					+ ", specialRequests=" + specialRequests + ", landingAirport=" + landingAirport + ", accommodation="
					+ accommodation + ", HotelLocation=" + HotelLocation + "]";
		}
	    
	    
		
	    

}// END OF BOOKING CLASS
