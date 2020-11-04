package com.school.domain.service;

import com.school.domain.Parientes;
import com.school.domain.repository.ParientesRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParientesService {
    @Autowired
    private ParientesRepositorio parientesRepositorio;

    public List<Parientes> getAll(){
        return parientesRepositorio.getAll();
    }

    public Parientes save(Parientes parientes){
        return parientesRepositorio.save(parientes);
    }
}
