package org.example.service;

import com.agrimitra.entity.Booking;
import com.agrimitra.repository.BookingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {

    private final BookingRepository bookingRepository;

    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    public Booking createBooking(Booking booking) {
        return bookingRepository.save(booking);
    }

    public List<Booking> getBookingsByFarm(Integer farmId) {
        return bookingRepository.findByFarmId(farmId);
    }
}