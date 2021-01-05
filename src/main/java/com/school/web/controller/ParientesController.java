package com.school.web.controller;

import com.school.domain.Parientes;
import com.school.domain.service.ParientesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/parientes")
public class ParientesController {
    @Autowired
    private ParientesService parientesService;

    @GetMapping("/all")
    public ResponseEntity<List<Parientes>> getAll(){
        return new ResponseEntity<>(parientesService.getAll(), HttpStatus.OK);
    }
    @PostMapping("/save")
    public ResponseEntity<Parientes> save(Parientes parientes){
        return new ResponseEntity<>(parientesService.save(parientes), HttpStatus.CREATED);
    }

}
