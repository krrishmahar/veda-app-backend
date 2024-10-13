package com.backend.vedaApp.service;

import com.backend.vedaApp.model.HotelRoom;
import com.backend.vedaApp.repo.RoomRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {

    private RoomRepo roomRepo;

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

    public HotelRoom updateRoom(int id, HotelRoom updatedRoom) {
        HotelRoom existingRoom = roomRepo.findById(id).orElse(null);
        if (existingRoom != null) {
            existingRoom.setRoomName(updatedRoom.getRoomName());
            existingRoom.setPrice(updatedRoom.getPrice());
            existingRoom.setRoomCapacity(updatedRoom.getRoomCapacity());
            existingRoom.setBeds(updatedRoom.getBeds());
            existingRoom.setImageUrl(updatedRoom.getImageUrl());
            existingRoom.setAvailability(updatedRoom.isAvailability());
            existingRoom.setWifi(updatedRoom.isWifi());
            existingRoom.setBath(updatedRoom.isBath());
            existingRoom.setTv(updatedRoom.isTv());
            existingRoom.setDrinks(updatedRoom.isDrinks());
            existingRoom.setFood(updatedRoom.isFood());
            return roomRepo.save(existingRoom);
        }
        return null;
    }

    public void deleteRoom(int id) {
        roomRepo.deleteById(id);
    }
}

