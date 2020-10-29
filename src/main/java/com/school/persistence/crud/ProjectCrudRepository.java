package com.school.persistence.crud;

import com.school.persistence.entity.Project;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProjectCrudRepository extends CrudRepository<Project,Integer> {

    List<Project> findByStudentId(int studentId);
}
