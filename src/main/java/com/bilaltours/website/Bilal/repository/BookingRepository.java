package com.bilaltours.website.Bilal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bilaltours.website.Bilal.model.AirportBooking;

@Repository
public interface BookingRepository extends JpaRepository<AirportBooking , Long>{

}
