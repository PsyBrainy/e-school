package com.school.persistence;

import com.school.domain.Proyecto;
import com.school.domain.repository.ProyectoRepositorio;
import com.school.persistence.crud.ProjectCrudRepository;
import com.school.persistence.entity.Project;
import com.school.persistence.mapper.ProyectoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProjectRepository implements ProyectoRepositorio {

    @Autowired
    private ProjectCrudRepository projectCrudRepository;

    @Autowired
    private ProyectoMapper mapper;

    @Override
    public List<Proyecto> getAll() {
        List<Project> projects = (List<Project>) projectCrudRepository.findAll();
        return mapper.toProyectos(projects);
    }

    @Override
    public Optional<List<Proyecto>> getByAlumno(int idAlumno) {
        List<Project> projects = projectCrudRepository.findByStudents(idAlumno);
        return Optional.of(mapper.toProyectos(projects));
    }

    @Override
    public Optional<Proyecto> getProyecto(int idProyecto) {
        return projectCrudRepository.findById(idProyecto).map(project -> mapper.toProyecto(project));
    }

    @Override
    public Proyecto save(Proyecto proyecto) {
        Project project = mapper.toProject(proyecto);
        return mapper.toProyecto(projectCrudRepository.save(project));
    }
    @Override
    public void delete(int projectId){
        projectCrudRepository.deleteById(projectId);
    }
}
