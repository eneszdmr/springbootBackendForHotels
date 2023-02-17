package com.blue.hotels.dao;

import com.blue.hotels.entities.Rooms;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Rooms,Long> {
}
