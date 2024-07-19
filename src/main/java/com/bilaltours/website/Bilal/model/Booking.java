package com.bilaltours.website.Bilal.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String phoneNumber;
    private int numberOfTravelers;
    private String pickupLocation;
    private String pickupTime;
    private String email;
    private String tourdetails;

    // Getters and Setters

    public Booking(Long id, String name, String phoneNumber, int numberOfTravelers, String pickupLocation,
			String pickupTime, String email , String tourdetails) {
		super();
		this.id = id;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.numberOfTravelers = numberOfTravelers;
		this.pickupLocation = pickupLocation;
		this.pickupTime = pickupTime;
		this.email = email;
		this.tourdetails = tourdetails;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getNumberOfTravelers() {
        return numberOfTravelers;
    }

    public void setNumberOfTravelers(Integer numberOfTravelers) {
        this.numberOfTravelers = numberOfTravelers;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }

    public void setPickupLocation(String pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public String getPickupTime() {
        return pickupTime;
    }

    public void setPickupTime(String pickupTime) {
        this.pickupTime = pickupTime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

	public String getTourdetails() {
		return tourdetails;
	}

	public void setTourdetails(String tourdetails) {
		this.tourdetails = tourdetails;
	}
}

