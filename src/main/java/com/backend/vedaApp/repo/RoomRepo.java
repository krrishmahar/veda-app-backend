package com.backend.vedaApp.repo;

import com.backend.vedaApp.model.HotelRoom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepo extends JpaRepository<HotelRoom, Integer> {
}
