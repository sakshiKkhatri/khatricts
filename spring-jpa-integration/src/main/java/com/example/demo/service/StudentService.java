package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Student;

public interface StudentService {

	public List<Student> getAllStudents();
	public Optional<Student> getStudentById(Integer studentId);
}
