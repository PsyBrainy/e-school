package com.school.persistence;

import com.school.domain.Alumno;
import com.school.domain.repository.PepeRepositorio;
import com.school.persistence.crud.StudentCrudRepository;
import com.school.persistence.entity.Student;
import com.school.persistence.mapper.AlumnoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class StudentRepository implements PepeRepositorio {

    @Autowired
    private StudentCrudRepository studentCrudRepository;

    @Autowired
    private AlumnoMapper mapper;

    @Override
    public List<Alumno> getAll(){
        List<Student> students = (List<Student>) studentCrudRepository.findAll();
        return mapper.toAlumnos(students);
    }

    @Override
    public Optional<List<Alumno>> getByProyecto(int idProyecto) {
        List<Student> students = studentCrudRepository.findByProjectsDelivered(idProyecto);
        return Optional.of(mapper.toAlumnos(students));
    }

    @Override
    public Alumno getByParientes(int idParientes) {
        Student student = studentCrudRepository.findByParents(idParientes);
        return mapper.toAlumno(student);
    }

    @Override
    public Optional<Alumno> getAlumno(int idAlumno) {

        return studentCrudRepository.findById(idAlumno).map(student -> mapper.toAlumno(student));
    }

    @Override
    public Alumno save(Alumno alumno) {
        Student student = mapper.toStudent(alumno);
        return mapper.toAlumno(studentCrudRepository.save(student));
    }

    @Override
    public void delete(int idAlumno){
        studentCrudRepository.deleteById(idAlumno);
    }
}
