package com.backend.vedaApp.repo;

import com.backend.vedaApp.model.HotelRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepo extends JpaRepository<HotelRoom, Integer> {

}
