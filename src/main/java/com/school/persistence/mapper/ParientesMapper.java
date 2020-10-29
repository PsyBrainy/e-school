package com.school.persistence.mapper;

import com.school.domain.Parientes;
import com.school.persistence.entity.Parents;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface ParientesMapper {

    @Mappings({
            @Mapping(source = "idParientes" , target = "idParents" ),
            @Mapping(source = "nombrePadre" , target = "nameFather" ),
            @Mapping(source = "nombreMadre" , target = "nameMather" ),
            @Mapping(source = "correoPadre" , target = "emailFather" ),
            @Mapping(source = "correoMadre" , target = "emailMather" ),
            @Mapping(source = "comentarios" , target = "comments" ),
            @Mapping(source = "alumno" , target = "student" )
    })
    Parents toParents(Parientes parientes);

    @InheritInverseConfiguration
    Parientes toParientes(Parents parents);

}
