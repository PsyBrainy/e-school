package com.school.domain.repository;

import com.school.domain.Parientes;

import java.util.List;

public interface ParientesRepositorio {

    List<Parientes> getAll();

    Parientes getByAlumno(int alumno);

    Parientes save(Parientes parientes);

    void delete(int idParientes);
}
