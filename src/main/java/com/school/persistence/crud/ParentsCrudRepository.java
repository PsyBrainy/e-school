package com.school.persistence.crud;

import com.school.persistence.entity.Parents;
import org.springframework.data.repository.CrudRepository;


public interface ParentsCrudRepository extends CrudRepository<Parents,Integer> {

    Parents findByIdParents(int studentId);
}
