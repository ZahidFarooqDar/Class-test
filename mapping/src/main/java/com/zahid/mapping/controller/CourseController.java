package com.zahid.mapping.controller;

import com.zahid.mapping.model.Course;
import com.zahid.mapping.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @PostMapping("")
    public Course create(@RequestBody Course course) {
        return courseService.create(course);
    }

    @GetMapping("/{id}")
    public Course read(@PathVariable Long id) {
        return courseService.read(id);
    }

    @PutMapping("/{id}")
    public Course update(@PathVariable Long id, @RequestBody Course course) {
        //course.setID(id);
        return courseService.update(course);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        courseService.delete(id);
    }

    @GetMapping("")
    public List<Course> findAll() {
        return courseService.findAll();
    }
}
