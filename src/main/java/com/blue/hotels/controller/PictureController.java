package com.blue.hotels.controller;

import com.blue.hotels.dao.PictureRepository;
import com.blue.hotels.entities.Pictures;
import com.blue.hotels.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pictures")
public class PictureController {
    @Autowired
    private PictureService pictureService;
    @Autowired
    private PictureRepository pictureRepository;

    @PostMapping("/save")
    public ResponseEntity<Pictures> addPicture(@RequestBody Pictures pictures){
        Pictures pictures1=pictureService.addPicture(pictures);
        return new ResponseEntity<Pictures>(pictures1, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Pictures>> getAllPictures(){
        List<Pictures> allPictures=pictureService.findAllPictures();
        return new ResponseEntity<List<Pictures>>(allPictures,HttpStatus.ACCEPTED);
    }

    @GetMapping("{id}")
    public ResponseEntity<Pictures> getPictureById(@PathVariable("id") Long id){
        Pictures pictureById=pictureService.getPictureById(id);
        return new ResponseEntity<Pictures>(pictureById,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable("id") Long id){
    pictureService.deletePictureById(id);
    return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Pictures> updateById(@PathVariable("id") Long id,@RequestBody Pictures pictures){
        pictures.setPictureId(id);
        Pictures updatedPic=pictureService.updatePicture(id,pictures);
        return new ResponseEntity<Pictures>(updatedPic,HttpStatus.OK);
    }

}