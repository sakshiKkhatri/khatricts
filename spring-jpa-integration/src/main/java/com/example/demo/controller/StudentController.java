package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import com.example.demo.service.StudentServiceImpl;
@RestController
@RequestMapping("/api")
public class StudentController {

	private StudentService studentService;
       
	@Autowired
	
        public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	
	
	
	
	@GetMapping("/students")
	public List<Student> getAll()
	{
		return studentService.getAllStudents();
	}
	@GetMapping("/students/{studentId}")
	public Optional<Student> getStudentById(@PathVariable Integer studentId)
	{
		return studentService.getStudentById(studentId);
	}
}
