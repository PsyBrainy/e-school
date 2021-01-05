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

    @GetMapping()
    public List<Alumno> getAll(){
        return alumnoService.getAll();
    }

    public Optional<Alumno> getAlumno(int idAlumno){
        return alumnoService.getAlumno(idAlumno);
    }
    public Optional<List<Alumno>> getByProyecto(int idProyecto){
        return alumnoService.getByProyecto(idProyecto);
    }
    public Alumno getByParientes(int idParientes){
        return alumnoService.getByParientes(idParientes);
    }

    @PostMapping()
    @ResponseBody
    public Alumno save(@RequestBody Alumno alumno){
        return alumnoService.save(alumno);
    }

    public boolean delete(Integer idAlumno){
        return alumnoService.delete(idAlumno);
    }
}
