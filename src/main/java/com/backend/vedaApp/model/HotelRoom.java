package com.backend.vedaApp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "hotelroom")
public class HotelRoom {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "room_name", nullable = false, length = 100)
    private String roomName;

    @Column(name = "meta_data")
    private String metaData;

    @Column(name = "price", nullable = false, precision = 10, scale = 2)
    private BigDecimal price;

    @Column(name = "room_capacity", nullable = false)
    private Integer roomCapacity;

    @Column(name = "beds")
    private Integer beds;

    @Column(name = "image_url")
    private String imageUrl;

    @ColumnDefault("1")
    @Column(name = "availability")
    private Boolean availability;

    @ColumnDefault("0")
    @Column(name = "wifi")
    private Boolean wifi;

    @ColumnDefault("0")
    @Column(name = "food")
    private Boolean food;

    @ColumnDefault("0")
    @Column(name = "bath")
    private Boolean bath;

    @ColumnDefault("0")
    @Column(name = "tv")
    private Boolean tv;

    @ColumnDefault("0")
    @Column(name = "ac")
    private Boolean ac;

}