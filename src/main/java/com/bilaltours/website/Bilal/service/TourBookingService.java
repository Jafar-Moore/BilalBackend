package com.bilaltours.website.Bilal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bilaltours.website.Bilal.model.Booking;
import com.bilaltours.website.Bilal.repository.TourBookingRepository;

import java.util.List;

@Service
public class TourBookingService {

    @Autowired
    private TourBookingRepository bookingRepository;

    public Booking createBooking(Booking booking) {
        return bookingRepository.save(booking);
    }

    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    public Booking getBookingById(Long id) {
        return bookingRepository.findById(id).orElse(null);
    }

    public Booking updateBooking(Long id, Booking bookingDetails) {
        Booking booking = bookingRepository.findById(id).orElse(null);
        if (booking != null) {
            booking.setName(bookingDetails.getName());
            booking.setPhoneNumber(bookingDetails.getPhoneNumber());
            booking.setNumberOfTravelers(bookingDetails.getNumberOfTravelers());
            booking.setPickupLocation(bookingDetails.getPickupLocation());
            booking.setPickupTime(bookingDetails.getPickupTime());
            booking.setEmail(bookingDetails.getEmail());
            return bookingRepository.save(booking);
        } else {
            return null;
        }
    }

    public void deleteBooking(Long id) {
        bookingRepository.deleteById(id);
    }
}


