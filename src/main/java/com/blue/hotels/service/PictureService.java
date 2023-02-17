package com.blue.hotels.service;

import com.blue.hotels.dao.PictureRepository;
import com.blue.hotels.entities.Pictures;
import com.blue.hotels.entities.Rooms;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PictureService {

    @Autowired
    private PictureRepository pictureRepository;


    public Pictures addPicture (Pictures pictures){
        return pictureRepository.save(pictures);
    }

    public List<Pictures> findAllPictures(){
        return pictureRepository.findAll();
    }

    public Pictures getPictureById(Long pictureId){
        return pictureRepository.findById(pictureId).orElse(null);
    }

    public void deletePictureById(Long id){
        pictureRepository.deleteById(id);
    }
    public Pictures updatePicture (Long id,Pictures pictures){
        Optional<Pictures> picture=pictureRepository.findById(id);
        if (!picture.isPresent()){
            throw new IllegalArgumentException("Fotoğraf bulunamadı !");
        }
        return pictureRepository.save(pictures);
    }
}
