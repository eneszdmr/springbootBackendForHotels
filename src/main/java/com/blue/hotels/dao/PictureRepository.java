package com.blue.hotels.dao;

import com.blue.hotels.entities.Pictures;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PictureRepository extends JpaRepository<Pictures,Long> {
}
