package com.backend.vedaApp.repo;

import com.backend.vedaApp.model.BanquetHall;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HallRepo extends JpaRepository<BanquetHall, Integer> {
}
