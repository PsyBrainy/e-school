package com.school.persistence.mapper;

import com.school.domain.Alumno;
import com.school.persistence.entity.Student;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AlumnoMapper {

    @Mappings({
            @Mapping(source = "studentId", target = "idAlumno"),
            @Mapping(source = "name", target = "nombre"),
            @Mapping(source = "dni", target = "dniA"),
            @Mapping(source = "address", target = "direccion"),
            @Mapping(source = "mail", target = "correo"),
            @Mapping(source = "phone", target = "telefono"),
            @Mapping(source = "comments", target = "comentarios"),
            @Mapping(source = "prensence", target = "asistencias"),
            @Mapping(source = "parents", target = "parientes"),
            @Mapping(source = "projectsDelivered" , target = "proyectos" )
    })
    Alumno toAlumno(Student student);
    List<Alumno> toAlumnos(List<Student> students);

    @InheritInverseConfiguration
    Student toStudent(Alumno alumno);
}
