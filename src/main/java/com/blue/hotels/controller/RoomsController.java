package com.blue.hotels.controller;

import com.blue.hotels.entities.Hotels;
import com.blue.hotels.entities.Rooms;
import com.blue.hotels.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rooms")
public class RoomsController {

    @Autowired
    private RoomService roomService;

    @PostMapping("/save")
    public ResponseEntity<Rooms> addRoom(@RequestBody Rooms rooms){
        Rooms  room=roomService.addRoom(rooms);
        return new ResponseEntity<Rooms>(room, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Rooms>> getAllRooms(){
        List<Rooms> allRooms=roomService.findAllRooms();
        return new ResponseEntity<List<Rooms>>(allRooms,HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<Rooms> getRoomById(@PathVariable("id") Long id){
        Rooms roomById=roomService.getRoomById(id);
        return new ResponseEntity<Rooms>(roomById,HttpStatus.OK);
    }


    @PutMapping("/update/{id}")
    public  ResponseEntity<Rooms> updateById(@PathVariable("id") Long id, @RequestBody Rooms rooms ){
        rooms.setRoomId(id);
        Rooms updated=roomService.updateRoom(id,rooms);
        return new ResponseEntity<Rooms>(updated,HttpStatus.OK);
    }

}
