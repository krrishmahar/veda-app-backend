package com.backend.vedaApp.controller;

import com.backend.vedaApp.model.HotelRoom;
import com.backend.vedaApp.service.RoomService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class RoomController {

    private RoomService roomService;

    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping("/rooms")
    public ResponseEntity<List<HotelRoom>> getAllRooms() {
        return new ResponseEntity<>(roomService.getAllRooms(), HttpStatus.OK);
    }

    @GetMapping("/rooms/{id}")
    public ResponseEntity<HotelRoom> getRoomById(@PathVariable int id) {
        HotelRoom room = roomService.getRoomById(id);
        if (room != null) {
            return new ResponseEntity<>(room, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping("/room")
    public ResponseEntity<?> addRoom(@RequestBody HotelRoom hotelRoom) {
        try {
            HotelRoom newRoom = roomService.addRoom(hotelRoom);
            return new ResponseEntity<>(newRoom, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/room/{id}")
    public ResponseEntity<HotelRoom> updateRoom(@PathVariable int id, @RequestBody HotelRoom updatedRoom) {
        HotelRoom room = roomService.updateRoom(id, updatedRoom);
        if (room != null) {
            return new ResponseEntity<>(room, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/room/{id}")
    public ResponseEntity<String> deleteRoom(@PathVariable int id) {
        HotelRoom room = roomService.getRoomById(id);
        if (room != null) {
            roomService.deleteRoom(id);
            return new ResponseEntity<>("Room deleted successfully", HttpStatus.OK);
        }
        return new ResponseEntity<>("Room not found", HttpStatus.NOT_FOUND);
    }
}
