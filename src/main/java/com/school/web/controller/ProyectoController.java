package com.school.web.controller;

import com.school.domain.Proyecto;
import com.school.domain.service.ProyectoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/proyecto")
public class ProyectoController {
    @Autowired
    private ProyectoService proyectoService;

    public List<Proyecto> getAll(){
        return proyectoService.getAll();
    }
    public Optional<List<Proyecto>> getByAlumno(int idProyecto){
        return proyectoService.getByAlumno(idProyecto);
    }
    public Optional<Proyecto> getProyecto(int idProyecto){
        return proyectoService.getProyecto(idProyecto);
    }
    public Proyecto save(Proyecto proyecto){
        return proyectoService.save(proyecto);
    }
    public boolean delete(int idProyecto){
        return proyectoService.delete(idProyecto);
    }
}
