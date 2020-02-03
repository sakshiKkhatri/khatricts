package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StudentDAO;
import com.example.demo.entity.Student;

@Service("service")
public class StudentServiceImpl implements StudentService{

	private StudentDAO dao;
	
	@Autowired
	public StudentServiceImpl(StudentDAO dao) {
		super();
		this.dao=dao;
	}





	@Override
	public Student createStudent(Student student) {
		// TODO Auto-generated method stub
		return dao.createStudent(student);
	}

}
