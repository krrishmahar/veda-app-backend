package com.backend.vedaApp.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "bookings")
public class Booking {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hotel_room_id")
    private HotelRoom hotelRoom;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "banquet_hall_id")
    private BanquetHall banquetHall;

    @Column(name = "booking_ref_no", nullable = false, length = 50)
    private String bookingRefNo;

    @Column(name = "number_of_guests", nullable = false)
    private Integer numberOfGuests;

    @Column(name = "check_in", nullable = false)
    private Instant checkIn;

    @Column(name = "check_out", nullable = false)
    private Instant checkOut;

    @Lob
    @Column(name = "special_request")
    private String specialRequest;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "booked_at")
    private Instant bookedAt;

}