package com.school.domain.service;

import com.school.domain.Alumno;
import com.school.domain.repository.PepeRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlumnoService {
    @Autowired
    private PepeRepositorio alumnoRepositorio;

    public List<Alumno> getAll(){
        return alumnoRepositorio.getAll();
    }

    public Optional<Alumno> getAlumno(int idAlumno){
        return alumnoRepositorio.getAlumno(idAlumno);
    }

    public Optional<List<Alumno>> getByProyecto(int idProyecto){
        return alumnoRepositorio.getByProyecto(idProyecto);
    }
    public Alumno getByParientes(int idParientes){
        return alumnoRepositorio.getByParientes(idParientes);
    }

    public Alumno save(Alumno alumno){
        return alumnoRepositorio.save(alumno);
    }

    public boolean delete(Integer idAlumno){
        return getAlumno(idAlumno).map(alumno -> {
            alumnoRepositorio.delete(idAlumno);
            return true;
        }).orElse(false);
    }

}
