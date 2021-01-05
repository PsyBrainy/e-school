package com.school.web.controller;

import com.school.domain.Alumno;
import com.school.domain.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/alumnos")
public class AlumnoController {
    @Autowired
    private AlumnoService alumnoService;

    @GetMapping("/all")
    public ResponseEntity<List<Alumno>> getAll(){
        return new ResponseEntity<>(alumnoService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Alumno> getAlumno(@PathVariable("id") int idAlumno){
        return alumnoService.getAlumno(idAlumno)
                .map(alumno -> new ResponseEntity<>(alumno, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/proyecto/seach/{idProyecto}")
    public ResponseEntity<List<Alumno>> getByProyecto(@PathVariable("idProyecto") int idProyecto){
        return alumnoService.getByProyecto(idProyecto)
                .map(alumnos -> new ResponseEntity<>(alumnos, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/parientes/seach/{idParientes}")
    public ResponseEntity<Alumno> getByParientes(@PathVariable("idParientes") int idParientes){
        return new ResponseEntity<>(alumnoService.getByParientes(idParientes), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Alumno> save(@RequestBody Alumno alumno){
        return new ResponseEntity<>(alumnoService.save(alumno),HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable("id") int idAlumno){
        if (alumnoService.delete(idAlumno)){
            return new ResponseEntity(HttpStatus.OK);
        }else{
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }
}
