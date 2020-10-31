package com.school.persistence;

import com.school.persistence.crud.ProjectCrudRepository;
import com.school.persistence.entity.Project;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProjectRepository {

    private ProjectCrudRepository projectCrudRepository;

    public List<Project> getAll(){
        return (List<Project>) projectCrudRepository.findAll();
    }

    //public List<Project> getByStudent(int studentId){
    //    return projectCrudRepository.findByStudentId(studentId);
    //}

    public Optional<Project> getProject(int projectId){
        return projectCrudRepository.findById(projectId);
    }

    public Project save(Project project){
        return projectCrudRepository.save(project);
    }

    public void delete(int projectId){
        projectCrudRepository.deleteById(projectId);
    }
}
