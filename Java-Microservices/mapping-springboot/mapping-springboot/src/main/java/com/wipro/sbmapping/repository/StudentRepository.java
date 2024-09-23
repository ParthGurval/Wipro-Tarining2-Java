package com.wipro.sbmapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.sbmapping.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
