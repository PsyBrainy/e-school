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
            @Mapping(source = "idParents" , target = "idParientes" ),
            @Mapping(source = "nameFather" , target = "nombrePadre" ),
            @Mapping(source = "nameMather" , target = "nombreMadre" ),
            @Mapping(source = "emailFather" , target = "correoPadre" ),
            @Mapping(source = "emailMather" , target = "correoMadre" ),
            @Mapping(source = "comments" , target = "comentarios" ),
            @Mapping(source = "student" , target = "alumno" )
    })
    Parientes toParientes(Parents parents);

    @InheritInverseConfiguration
    Parents toParents(Parientes parientes);

}
