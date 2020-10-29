package com.school.domain.repository;

import com.school.domain.Proyecto;


import java.util.List;
import java.util.Optional;

public interface ProyectoRepositorio {

    List<Proyecto> setAll();

    List<Proyecto> getByAlumno(int idAlumno);

    Optional<Proyecto> getProyecto(int idProyecto);

    Proyecto save(Proyecto proyecto);

    void delete(int idProyecto);

}
