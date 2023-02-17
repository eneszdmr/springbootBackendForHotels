package com.blue.hotels.service;

import com.blue.hotels.dao.HotelRepository;
import com.blue.hotels.entities.Hotels;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HotelService {

    @Autowired
    private HotelRepository hotelRepository;


    public Hotels addHotel(Hotels hotels){
        return hotelRepository.save(hotels);
    }

    public List<Hotels> findAllHotels(){
        return hotelRepository.findAll();
    }

    public Hotels getHotelById(Long hotelId){
        return hotelRepository.findById(hotelId).orElse(null);
    }

    public void deleteHotelById(Long hotelId){
        hotelRepository.deleteById(hotelId);
    }

    public Hotels updateHotel(Long id,Hotels hotels){
        Optional<Hotels> hotelDb = hotelRepository.findById(id);
        if(!hotelDb.isPresent()){
            throw new IllegalArgumentException("Hotel Bulunamadı !");
        }
        return hotelRepository.save(hotels);

    }

}
