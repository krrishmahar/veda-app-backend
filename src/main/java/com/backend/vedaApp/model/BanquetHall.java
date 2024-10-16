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
public class BanquetHall {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "hall_name")
    private String name;
    private BigDecimal price;

    @Column(name = "hall_capacity")
    private int hallCapacity;

    @Column(name = "image_url")
    private String imageUrl;
    private boolean availability;

    private boolean wifi;
    private boolean food;
}
