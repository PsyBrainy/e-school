package com.school.web.controller;

import com.school.domain.Proyecto;
import com.school.domain.service.ProyectoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/proyecto")
public class ProyectoController {
    @Autowired
    private ProyectoService proyectoService;

    @GetMapping("/all")
    public ResponseEntity<List<Proyecto>> getAll(){
        return new ResponseEntity<>(proyectoService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/alumno/{id}")
    public ResponseEntity<List<Proyecto>> getByAlumno(@PathVariable("id") int idProyecto){
        return proyectoService.getByAlumno(idProyecto)
                .map(proyectos -> new ResponseEntity<>(proyectos, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @GetMapping("/{id}")
    public ResponseEntity<Proyecto> getProyecto(@PathVariable("id") int idProyecto){
        return proyectoService.getProyecto(idProyecto)
                .map(proyecto -> new ResponseEntity<>(proyecto, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @PostMapping("/save")
    public ResponseEntity<Proyecto> save(Proyecto proyecto){
        return new ResponseEntity<>(proyectoService.save(proyecto), HttpStatus.OK);
    }
    public ResponseEntity delete(int idProyecto){
        if (proyectoService.delete(idProyecto)){
            return new ResponseEntity(HttpStatus.OK);
        }else{
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }
}
