package com.blue.hotels.dao;

import com.blue.hotels.entities.Hotels;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotels,Long> {
}
