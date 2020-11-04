package com.school.web.controller;

import com.school.domain.Parientes;
import com.school.domain.service.ParientesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/parientes")
public class ParientesController {
    @Autowired
    private ParientesService parientesService;

    public List<Parientes> getAll(){
        return parientesService.getAll();
    }
    public Parientes save(Parientes parientes){
        return parientesService.save(parientes);
    }

}
