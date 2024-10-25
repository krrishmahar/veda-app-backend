package com.backend.vedaApp.service;

import com.backend.vedaApp.model.Booking;
import com.backend.vedaApp.repo.BookingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {

    private final BookingRepo bookingRepo;


    @Autowired
    public BookingService(BookingRepo bookingRepo) {
        this.bookingRepo = bookingRepo;
    }


    public Booking getBookingById(int id) {
        return bookingRepo.findById(id).get();
    }

    public List<Booking> getAllBookings() {
        return bookingRepo.findAll();
    }

    public Booking addBooking(Booking booking) {
        return bookingRepo.save(booking);
    }

}
