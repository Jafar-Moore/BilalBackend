package com.bilaltours.website.Bilal.Controller;

import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

import com.bilaltours.website.Bilal.EmailService.EmailService;
import com.bilaltours.website.Bilal.model.Booking;
import com.bilaltours.website.Bilal.service.TourBookingService;


import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.List;

@RestController
@RequestMapping("/bookings")
@CrossOrigin(origins = "http://127.0.0.1:5501")
public class TourBookingController {
    

    @Autowired
    private TourBookingService bookingService;
    
    @Autowired
    private EmailService emailService;


    @GetMapping
    public List<Booking> getAllBookings() {
        return bookingService.getAllBookings();
    }

    @GetMapping("/{id}")
    public Booking getBookingById(@PathVariable Long id) {
        return bookingService.getBookingById(id);
    }

    @PutMapping("/{id}")
    public Booking updateBooking(@PathVariable Long id, @RequestBody Booking bookingDetails) {
        return bookingService.updateBooking(id, bookingDetails);
    }
    
    @PostMapping("/createtour")
    public Booking createBooking(@RequestBody Booking booking) {
        Booking newBooking = bookingService.createBooking(booking);

        // Construct the email message
        String emailMessage = "Your booking has been successfully created. Details:\n" +
                              "Name: " + newBooking.getName() + "\n" +
                              "Phone Number: " + newBooking.getPhoneNumber() + "\n" +
                              "Number of Travelers: " + newBooking.getNumberOfTravelers() + "\n" +
                              "Pickup Location: " + newBooking.getPickupLocation() + "\n" +
                              "Pickup Time: " + newBooking.getPickupTime() + "\n" +
                              "Email: " + newBooking.getEmail()+ "\n" +
                              "Tour details :" + newBooking.getTourdetails();

        // Send the email
        emailService.sendSimpleMessage(newBooking.getEmail(), "Booking Confirmation", emailMessage);
        emailService.sendSimpleMessage("bilaltoursjamaica74@gmail.com", "Booking Confirmation", emailMessage);

        return newBooking;
    }

    @DeleteMapping("/{id}")
    public void deleteBooking(@PathVariable Long id) {
        bookingService.deleteBooking(id);
    }
}
