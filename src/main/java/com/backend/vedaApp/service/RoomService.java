package com.backend.vedaApp.service;

import com.backend.vedaApp.model.HotelRoom;
import com.backend.vedaApp.repo.RoomRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {

    private final RoomRepo roomRepo;

    @Autowired
    public RoomService(RoomRepo roomRepo) {
        this.roomRepo = roomRepo;
    }

    public List<HotelRoom> getAllRooms() {
        return roomRepo.findAll();
    }

    public HotelRoom getRoomById(int id) {
        return roomRepo.findById(id).orElse(new HotelRoom());
    }

    public HotelRoom addRoom(HotelRoom hotelRoom) {
        return roomRepo.save(hotelRoom);
    }


    public void deleteRoom(int id) {
        roomRepo.deleteById(id);
    }
}

