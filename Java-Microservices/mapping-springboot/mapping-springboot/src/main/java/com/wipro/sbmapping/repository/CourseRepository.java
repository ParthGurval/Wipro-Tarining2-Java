package com.wipro.sbmapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.sbmapping.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
