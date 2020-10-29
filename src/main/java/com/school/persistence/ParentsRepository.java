package com.school.persistence;

import com.school.persistence.crud.ParentsCrudRepository;
import com.school.persistence.entity.Parents;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ParentsRepository {

    private ParentsCrudRepository parentsCrudRepository;

    public List<Parents> getAll(){
        return (List<Parents>) parentsCrudRepository.findAll();
    }

    public Parents getByStudent(int studentId){
        return parentsCrudRepository.findByStudent(studentId);
    }

    public Parents save(Parents parents){
        return parentsCrudRepository.save(parents);
    }

    public void delete(int parentId){
        parentsCrudRepository.deleteById(parentId);
    }

}
