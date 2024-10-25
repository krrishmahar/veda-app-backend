package com.backend.vedaApp.service;

import com.backend.vedaApp.model.BanquetHall;
import com.backend.vedaApp.repo.HallRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HallService {

    private final HallRepo hallRepo;


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


    public void deleteHall(int id) {
        hallRepo.deleteById(id);
    }
}
