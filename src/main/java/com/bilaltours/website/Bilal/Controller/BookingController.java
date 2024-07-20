package com.bilaltours.website.Bilal.Controller;

import com.bilaltours.website.Bilal.EmailService.EmailService;
import com.bilaltours.website.Bilal.model.AirportBooking;
import com.bilaltours.website.Bilal.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/bookings")
@CrossOrigin
public class BookingController {

    @Autowired
    private BookingService bookingService;
    
    @Autowired
    private EmailService emailService;

    @GetMapping("/get")
    public List<AirportBooking> getAllBookings() {
        return bookingService.getAllBookings();
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<AirportBooking> getBookingById(@PathVariable Long id) {
        Optional<AirportBooking> booking = bookingService.getBookingById(id);
        return booking.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @CrossOrigin(origins = "https://bilal-tours.vercel.app")
    @PostMapping("/create")
    public AirportBooking createBooking(@RequestBody AirportBooking booking) {
        AirportBooking newBooking = bookingService.createBooking(booking);
        
        System.out.println("Received booking: " +newBooking.toString());
        // Construct the email message
        String emailMessage = "Your booking has been successfully created. Details:\n" +
                              "Booking ID: " + newBooking.getBookingId() + "\n" +
                              "Customer Name: " + newBooking.getCustomerName() + "\n" +
                              "Email: " + newBooking.getEmail() + "\n" +
                              "Phone Number: " + newBooking.getPhoneNumber() + "\n" +
                              "Roundtrip: " + newBooking.getRoundTrip() + "\n" +
                              "Arrival Date: " + newBooking.getAriivalDate() + "\n" +
                              "Departure Date: " + newBooking.getDepartureDate() + "\n" +
                              "Arrival Time: " + newBooking.getArrivalTime() + "\n" +
                              "Departure Time: " + newBooking.getDepartureTime() + "\n" +
                              "Number of Travelers: " + newBooking.getNumberOfTravelers() + "\n" +
                              "Total Cost: $" + newBooking.getTotalCost() + "\n" +
                              "Special Requests: " + newBooking.getSpecialRequests() + "\n" +
                              "Landing Airport: " + newBooking.getLandingAirport() + "\n" +
                              "Accommodation: " + newBooking.getAccommodation() + "\n" +
                              "Hotel Location: " + newBooking.getHotelLocation();

        // Send the email
        emailService.sendSimpleMessage(newBooking.getEmail(), "Booking Confirmation", emailMessage);
        emailService.sendSimpleMessage("bilaltoursjamaica74@gmail.com", "Booking Confirmation", emailMessage);
        return newBooking;
    }


}

