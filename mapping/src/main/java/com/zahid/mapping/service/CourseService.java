package com.zahid.mapping.service;

import com.zahid.mapping.model.Course;
import com.zahid.mapping.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseRepository courseRepository;

    public Course create(Course course) {
        return courseRepository.save(course);
    }


    public Course read(Long id) {
        return courseRepository.findById(id).orElse(null);
    }


    public Course update(Course course) {
        return courseRepository.save(course);
    }


    public void delete(Long id) {
        courseRepository.deleteById(id);
    }

    public List<Course> findAll() {
        return courseRepository.findAll();
    }
}

