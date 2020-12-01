package com.codeclan.example.MM2MHW.controllers;

import com.codeclan.example.MM2MHW.models.File;
import com.codeclan.example.MM2MHW.repositories.FileRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class FileController {

    @Autowired
    FileRepo fileRepo;

    @GetMapping(value="/files")
    public ResponseEntity<List<File>> getFiles() {
        return new ResponseEntity<>(fileRepo.findAll(), HttpStatus.OK);
    }

    @GetMapping(value="/files/{id}")
    public ResponseEntity<Optional<File>> getFile(@PathVariable Long id) {
        return new ResponseEntity<>(fileRepo.findById(id), HttpStatus.OK);
    }


}
