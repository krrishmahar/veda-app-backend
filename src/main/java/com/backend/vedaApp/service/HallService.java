package com.backend.vedaApp.service;

import com.backend.vedaApp.model.BanquetHall;
import com.backend.vedaApp.repo.HallRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HallService {

    private HallRepo hallRepo;

    @Autowired
    public HallService(HallRepo hallRepo) {
        this.hallRepo = hallRepo;
    }

    public List<BanquetHall> getAllHalls() {
        return hallRepo.findAll();
    }

    public BanquetHall getHallById(int id) {
        return hallRepo.findById(id).orElse(new BanquetHall());
    }

    public BanquetHall addHall(BanquetHall banquetHall) {
        return hallRepo.save(banquetHall);
    }

    public BanquetHall updateHall(int id, BanquetHall updatedHall) {
        BanquetHall existingHall = hallRepo.findById(id).orElse(null);
        if (existingHall != null) {
            existingHall.setHallName(updatedHall.getHallName());
            existingHall.setPrice(updatedHall.getPrice());
            existingHall.setHallCapacity(updatedHall.getHallCapacity());
            existingHall.setImageUrl(updatedHall.getImageUrl());
            existingHall.setAvailability(updatedHall.isAvailability());
            existingHall.setWifi(updatedHall.isWifi());
            existingHall.setFood(updatedHall.isFood());
            return hallRepo.save(existingHall);
        }
        return null;
    }

    public void deleteHall(int id) {
        hallRepo.deleteById(id);
    }
}
