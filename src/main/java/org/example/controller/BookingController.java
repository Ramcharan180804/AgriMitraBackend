package org.example.controller;

import org.example.entity.Booking;
import org.example.service.BookingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {

    private final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping
    public Booking createBooking(@RequestBody Booking booking) {
        return bookingService.createBooking(booking);
    }

    @GetMapping("/farm/{farmId}")
    public List<Booking> getBookingsByFarm(
            @PathVariable Integer farmId) {

        return bookingService.getBookingsByFarm(farmId);
    }
}