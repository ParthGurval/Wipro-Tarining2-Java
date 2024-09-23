package com.wipro.springmapping.service;

import java.util.List;

import com.wipro.springmapping.entity.Course;
import com.wipro.springmapping.repository.CourseRepository;

public class CourseService {
	
	private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    public Course saveCourse(Course course) {
        return courseRepository.save(course);
    }

    public Course getCourseById(Long id) {
        return courseRepository.findById(id).orElseThrow(() -> new RuntimeException("Course not found"));
    }

}
