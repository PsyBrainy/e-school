package com.school.domain.service;

import com.school.persistence.crud.StudentCrudRepository;
import com.school.persistence.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private StudentCrudRepository studentRepository;

    public List<Student> getAll(){
        return (List<Student>) studentRepository.findAll();
    }

    public Optional<Student> getStudent(Integer studentId){
        return studentRepository.findById(studentId);
    }

    public Student save(Student student){
        return studentRepository.save(student);
    }

    public boolean delete(Integer studentId){
        return getStudent(studentId).map(student -> {
            studentRepository.deleteById(studentId);
            return true;
        }).orElse(false);
    }

}
