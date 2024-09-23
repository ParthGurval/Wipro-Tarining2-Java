package com.wipro.sbmapping.service;

import java.util.List;

import com.wipro.sbmapping.entity.Student;

public interface IStudentService {
	
	 Student saveStudent(Student student);
	 
	    Student updateStudent(Long id, Student student);
	    
	    void deleteStudent(Long id);
	    
	    List<Student> getAllStudents();
	    
	    Student getStudentById(Long id);

}
