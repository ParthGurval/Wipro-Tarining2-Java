package com.wipro.springmapping.service;

import java.util.List;

import com.wipro.springmapping.entity.Student;
import com.wipro.springmapping.repository.StudentRepository;

public class StudentService {
	
	private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElseThrow(() -> new RuntimeException("Student not found"));
    }

}
