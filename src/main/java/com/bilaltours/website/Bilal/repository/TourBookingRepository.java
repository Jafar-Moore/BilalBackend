package com.bilaltours.website.Bilal.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.bilaltours.website.Bilal.model.Booking;

public interface TourBookingRepository extends JpaRepository<Booking, Long> {
}

