package com.zahid.mapping.repository;


import com.zahid.mapping.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
