package com.wipro.sbmapping.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.sbmapping.entity.Course;
import com.wipro.sbmapping.entity.Student;
import com.wipro.sbmapping.repository.CourseRepository;
import com.wipro.sbmapping.repository.StudentRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class StudentServiceImpl implements IStudentService {

	@Autowired
    private StudentRepository studentRepository;
	
	 @Autowired
	 private CourseRepository courseRepository;

	 @Override
	    public Student saveStudent(Student student) {
	        // Save courses if not already persisted
	        for (Course course : student.getCourses()) {
	            if (course.getId() == null) {
	                courseRepository.save(course);
	            }
	        }
	        return studentRepository.save(student);
	    }

    @Override
    public Student updateStudent(Long id, Student student) {
        Optional<Student> existingStudent = studentRepository.findById(id);
        if (existingStudent.isPresent()) {
            Student updatedStudent = existingStudent.get();
            updatedStudent.setName(student.getName());
            updatedStudent.setEmail(student.getEmail());
            updatedStudent.setCourses(student.getCourses());
            return studentRepository.save(updatedStudent);
        }
        return null;
    }

    @Override
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

}
