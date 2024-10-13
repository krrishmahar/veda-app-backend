package com.backend.vedaApp.controller;

import com.backend.vedaApp.model.BanquetHall;
import com.backend.vedaApp.service.HallService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class HallController {

    private HallService hallService;

    public HallController(HallService hallService) {
        this.hallService = hallService;
    }

    @GetMapping("/halls")
    public ResponseEntity<List<BanquetHall>> getAllHalls() {
        return new ResponseEntity<>(hallService.getAllHalls(), HttpStatus.OK);
    }

    @GetMapping("/halls/{id}")
    public ResponseEntity<BanquetHall> getHallById(@PathVariable int id) {
        BanquetHall hall = hallService.getHallById(id);
        if (hall != null) {
            return new ResponseEntity<>(hall, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping("/hall")
    public ResponseEntity<?> addHall(@RequestBody BanquetHall banquetHall) {
        try {
            BanquetHall newHall = hallService.addHall(banquetHall);
            return new ResponseEntity<>(newHall, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/hall/{id}")
    public ResponseEntity<BanquetHall> updateHall(@PathVariable int id, @RequestBody BanquetHall updatedHall) {
        BanquetHall hall = hallService.updateHall(id, updatedHall);
        if (hall != null) {
            return new ResponseEntity<>(hall, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/hall/{id}")
    public ResponseEntity<String> deleteHall(@PathVariable int id) {
        BanquetHall hall = hallService.getHallById(id);
        if (hall != null) {
            hallService.deleteHall(id);
            return new ResponseEntity<>("Hall deleted successfully", HttpStatus.OK);
        }
        return new ResponseEntity<>("Hall not found", HttpStatus.NOT_FOUND);
    }
}
