package com.backend.vedaApp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HotelRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "room_name")
    private String name;
    private BigDecimal price;

    @Column(name = "room_capacity")
    private int roomCapacity;
    private int beds;

    @Column(name = "image_url")
    private String imageUrl;
    private boolean availability;

    private boolean wifi;
    private boolean bath;
    private boolean tv;
    private boolean drinks;
    private boolean food;
}
