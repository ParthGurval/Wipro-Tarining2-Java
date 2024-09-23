package com.wipro.springmapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.springmapping.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
