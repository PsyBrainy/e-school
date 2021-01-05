package com.school.domain.repository;

import com.school.domain.Alumno;

import java.util.List;
import java.util.Optional;

public interface PepeRepositorio {
    List<Alumno> getAll();
    Optional<List<Alumno>> getByProyecto(int idProyecto);
    Alumno getByParientes(int idParientes);
    Optional<Alumno> getAlumno(int idAlumno);
    Alumno save(Alumno alumno);
    void delete(int idAlumno);
}
