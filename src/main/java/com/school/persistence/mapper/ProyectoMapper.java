package com.school.persistence.mapper;

import com.school.domain.Proyecto;
import com.school.persistence.entity.Project;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProyectoMapper {

    @Mappings({
            @Mapping(source = "projectId", target = "idProyecto"),
            @Mapping(source = "nameProject", target = "nombreP"),
            @Mapping(source = "limitDate", target = "fechaLimite"),
            @Mapping(source = "students", target = "alumnos")
    })
    Proyecto toProyecto(Project project);
    List<Proyecto> toProyectos(List<Project> projects);

    @InheritInverseConfiguration
    Project toProject(Proyecto proyecto);

}
