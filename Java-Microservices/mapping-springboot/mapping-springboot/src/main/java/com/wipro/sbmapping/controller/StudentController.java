package com.wipro.sbmapping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.sbmapping.entity.Student;
import com.wipro.sbmapping.service.IStudentService;

@RestController
@RequestMapping("/api/students")
public class StudentController {

	 @Autowired
	    private IStudentService studentService;

	    @PostMapping("/add")
	    public Student createStudent(@RequestBody Student student) {
	        return studentService.saveStudent(student);
	    }

	    @PutMapping("/update/{id}")
	    public Student updateStudent(@PathVariable Long id, @RequestBody Student student) {
	        return studentService.updateStudent(id, student);
	    }

	    @DeleteMapping("/delete/{id}")
	    public void deleteStudent(@PathVariable Long id) {
	        studentService.deleteStudent(id);
	    }

	    @GetMapping("/getall")
	    public List<Student> getAllStudents() {
	        return studentService.getAllStudents();
	    }

	    @GetMapping("/getbyid/{id}")
	    public Student getStudentById(@PathVariable Long id) {
	        return studentService.getStudentById(id);
	    }
	
	
}
