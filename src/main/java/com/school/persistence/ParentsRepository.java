package com.school.persistence;

import com.school.domain.Parientes;
import com.school.domain.repository.ParientesRepositorio;
import com.school.persistence.crud.ParentsCrudRepository;
import com.school.persistence.entity.Parents;
import com.school.persistence.mapper.ParientesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ParentsRepository implements ParientesRepositorio {
    @Autowired
    private ParentsCrudRepository parentsCrudRepository;

    @Autowired
    private ParientesMapper mapper;

    @Override
    public List<Parientes> getAll(){
        List<Parents> parentsList = (List<Parents>) parentsCrudRepository.findAll();
        return mapper.toParientesList(parentsList);
    }

    @Override
    public Parientes getByAlumno(int alumno) {
        Parents parents = parentsCrudRepository.findByStudent(alumno);
        return mapper.toParientes(parents);
    }

    @Override
    public Parientes save(Parientes parientes) {
        Parents parents = mapper.toParents(parientes);
        return mapper.toParientes(parentsCrudRepository.save(parents));
    }

    @Override
    public void delete(int parentId){
        parentsCrudRepository.deleteById(parentId);
    }

}
