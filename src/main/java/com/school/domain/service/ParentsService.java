package com.school.domain.service;

import com.school.persistence.crud.ParentsCrudRepository;
import com.school.persistence.entity.Parents;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParentsService {

    private ParentsCrudRepository parentsRepository;

    public List<Parents> getAll(){
        return (List<Parents>) parentsRepository.findAll();
    }

    public Parents save(Parents parents){
        return parentsRepository.save(parents);
    }
}
