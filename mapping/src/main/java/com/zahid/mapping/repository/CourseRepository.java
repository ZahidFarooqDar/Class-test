package com.zahid.mapping.repository;


import com.zahid.mapping.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
