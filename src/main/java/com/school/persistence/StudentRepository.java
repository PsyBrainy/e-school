package com.school.persistence;

import com.school.persistence.crud.StudentCrudRepository;
import com.school.persistence.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class StudentRepository {
    private StudentCrudRepository studentCrudRepository;

    public List<Student> getAll(){
        return (List<Student>) studentCrudRepository.findAll();
    }

    /*public List<Student>getByProject(int projectId){
        return studentCrudRepository.findByProjectId(projectId);
    }*/
    public Student getByParents(int parentsId){
        return studentCrudRepository.findByParents(parentsId);
    }

    public Optional<Student> getStudent(int studentId){
        return studentCrudRepository.findById(studentId);
    }

    public Student save(Student student){
        return studentCrudRepository.save(student);
    }

    public void delete(int studentId){
        studentCrudRepository.deleteById(studentId);
    }
}
