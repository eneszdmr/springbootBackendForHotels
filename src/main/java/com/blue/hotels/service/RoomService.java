package com.blue.hotels.service;

import com.blue.hotels.dao.RoomRepository;
import com.blue.hotels.entities.Rooms;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoomService {

    @Autowired
    private RoomRepository roomRepository;

    public Rooms addRoom (Rooms rooms){
        return roomRepository.save(rooms);
    }

    public List<Rooms> findAllRooms(){
        return roomRepository.findAll();
    }

    public Rooms getRoomById(Long roomId){
        return roomRepository.findById(roomId).orElse(null);
    }

    public void deleteRoomById(Long id){
        roomRepository.deleteById(id);
    }
    public Rooms updateRoom (Long id,Rooms rooms){
        Optional<Rooms> room=roomRepository.findById(id);
        if (!room.isPresent()){
            throw new IllegalArgumentException("oda bulunamadı !");
        }
        return roomRepository.save(rooms);
    }


}
