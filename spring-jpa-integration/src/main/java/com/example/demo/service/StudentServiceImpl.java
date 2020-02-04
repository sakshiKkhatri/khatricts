package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.demo.dao.StudentDAO;
import com.example.demo.entity.Student;

@Service
@EnableTransactionManagement
public class StudentServiceImpl implements StudentService{

	private StudentDAO studentDAO;
	
	@Autowired
	public StudentServiceImpl(StudentDAO studentDAO) {
		super();
		this.studentDAO = studentDAO;
	}

	@Override
	@Transactional
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentDAO.findAll();
	}

	@Override
	@Transactional
	public Optional<Student> getStudentById(Integer studentId) {
		// TODO Auto-generated method stub
		Optional<Student> student=studentDAO.findById(studentId);
		return student;
		
	}

}
