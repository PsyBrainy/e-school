package com.school.domain.repository;

import com.school.domain.Alumno;

import java.util.List;
import java.util.Optional;

public interface AlumnoRepositorio {
    List<Alumno> getAll();
    List<Alumno> getByProyecto(int idProyecto);
    Alumno getByParientes(int idParientes);
    Optional<Alumno> getAlumno(int idAlumno);
    Alumno save();
    void delete(int idAlumno);
}
