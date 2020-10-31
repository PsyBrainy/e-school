package com.school.persistence.crud;

import com.school.persistence.entity.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentCrudRepository extends CrudRepository<Student,Integer> {

   //List<Student> findByProjectId(int projectId);

    Student findByParents(int parentId);
}
