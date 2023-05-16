package com.zahid.mapping.service;

import com.zahid.mapping.model.Student;
import com.zahid.mapping.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public Student create(Student student) {
        return studentRepository.save(student);
    }


    public Student read(Long id) {
        return studentRepository.findById(id).orElse(null);
    }


    public Student update(Student student) {
        return studentRepository.save(student);
    }


    public void delete(Long id) {
        studentRepository.deleteById(id);
    }

    public List<Student> findAll() {
        return studentRepository.findAll();
    }
}

