package com.bilaltours.website.Bilal.service;

import com.bilaltours.website.Bilal.model.AirportBooking;
import com.bilaltours.website.Bilal.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    public List<AirportBooking> getAllBookings() {
        return bookingRepository.findAll();
    }

    public Optional<AirportBooking> getBookingById(Long id) {
        return bookingRepository.findById(id);
    }

    public AirportBooking createBooking(AirportBooking booking) {
        return bookingRepository.save(booking);
    }
}
