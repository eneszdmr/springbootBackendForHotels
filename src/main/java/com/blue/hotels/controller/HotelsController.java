package com.blue.hotels.controller;


import com.blue.hotels.entities.Hotels;
import com.blue.hotels.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelsController {
    @Autowired
    private HotelService hotelService;

    @GetMapping
    public ResponseEntity<List<Hotels>> getAllHotels(){
        List<Hotels> allHotels=hotelService.findAllHotels();
        return new ResponseEntity<List<Hotels>>(allHotels,HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Hotels> addHotel(@RequestBody Hotels hotels){
        Hotels hotel= hotelService.addHotel(hotels);
        return new ResponseEntity<Hotels>(hotel, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<Hotels> getHotelById(@PathVariable("id") Long id){
        Hotels hotelById=hotelService.getHotelById(id);
        return new ResponseEntity<Hotels>(hotelById,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable("id") Long id){
        hotelService.deleteHotelById(id);
        return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
    }

    @PutMapping("/update/{id}")
    public  ResponseEntity<Hotels> updateById(@PathVariable("id") Long id,@RequestBody Hotels hotels ){
        hotels.setHotelId(id);
        Hotels hotelsUpdate = hotelService.updateHotel(id,hotels);
        return new ResponseEntity<Hotels>(hotelsUpdate,HttpStatus.OK);
    }
}
