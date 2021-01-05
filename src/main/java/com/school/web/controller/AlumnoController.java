package com.school.web.controller;

import com.school.domain.Alumno;
import com.school.domain.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/alumnos")
public class AlumnoController {
    @Autowired
    private AlumnoService alumnoService;

    @GetMapping("/all")
    public List<Alumno> getAll(){
        return alumnoService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Alumno> getAlumno(@PathVariable("id") int idAlumno){
        return alumnoService.getAlumno(idAlumno);
    }

    @GetMapping("/proyecto/seach/{idProyecto}")
    public Optional<List<Alumno>> getByProyecto(@PathVariable("idProyecto") int idProyecto){
        return alumnoService.getByProyecto(idProyecto);
    }

    @GetMapping("/parientes/seach/{idParientes}")
    public Alumno getByParientes(@PathVariable("idParientes") int idParientes){
        return alumnoService.getByParientes(idParientes);
    }

    @PostMapping("/save")
    public Alumno save(@RequestBody Alumno alumno){
        return alumnoService.save(alumno);
    }

    public boolean delete(Integer idAlumno){
        return alumnoService.delete(idAlumno);
    }
}
