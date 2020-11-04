package com.school.domain.service;

import com.school.domain.Proyecto;
import com.school.domain.repository.ProyectoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProyectoService {
    @Autowired
    private ProyectoRepositorio proyectoRepositorio;

    public List<Proyecto> getAll() {
        return proyectoRepositorio.getAll();
    }
    public Optional<List<Proyecto>> getByAlumno(int idProyecto){
        return proyectoRepositorio.getByAlumno(idProyecto);
    }
    public Optional<Proyecto> getProyecto(int idProyecto){
        return proyectoRepositorio.getProyecto(idProyecto);
    }
    public Proyecto save(Proyecto proyecto){
        return proyectoRepositorio.save(proyecto);
    }
    public boolean delete(int idProyecto){
        return getByAlumno(idProyecto).map(proyectos -> {
            proyectoRepositorio.delete(idProyecto);
            return true;
        }).orElse(false);
    }

}
