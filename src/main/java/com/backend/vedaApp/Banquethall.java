package com.backend.vedaApp;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "banquethall")
public class Banquethall {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "hall_name", length = 100)
    private String hallName;

    @Column(name = "price", precision = 10, scale = 2)
    private BigDecimal price;

    @Column(name = "hall_capacity")
    private Integer hallCapacity;

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

}