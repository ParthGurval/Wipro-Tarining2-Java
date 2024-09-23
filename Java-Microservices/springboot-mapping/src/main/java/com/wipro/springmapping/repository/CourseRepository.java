package com.wipro.springmapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.springmapping.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
