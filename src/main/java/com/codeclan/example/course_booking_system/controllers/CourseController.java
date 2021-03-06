package com.codeclan.example.course_booking_system.controllers;

import com.codeclan.example.course_booking_system.models.Course;
import com.codeclan.example.course_booking_system.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping(value = "/courses")
    public ResponseEntity<List<Course>> getAllCourses() {
        return new ResponseEntity<List<Course>>(courseRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/courses/{id}")
    public ResponseEntity<Optional<Course>> getCourse(@PathVariable Long id) {
        return new ResponseEntity<Optional<Course>>(courseRepository.findById(id), HttpStatus.OK);
    }

}
