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

	@Override
	public Student createStudent(Student student) {
		// TODO Auto-generated method stub
		return studentDAO.save(student);
	}

	@Override
	public void deleteStudentbyId(Integer studentId) {
		// TODO Auto-generated method stub
		
		studentDAO.deleteById(studentId);
		
	
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
		studentDAO.deleteAll();
	}

	@Override
	public List<Student> findByFirstName(String firstName) {
		// TODO Auto-generated method stub
		return studentDAO.findByFirstName(firstName);
	}

	@Override
	public List<Student> findByLastName(String lastName) {
		// TODO Auto-generated method stub
		return studentDAO.findByLastName(lastName);
	}

	@Override
	public List<Student> findByFirstNameAndLastName(String firstName, String lastName) {
		// TODO Auto-generated method stub
		return studentDAO.findByFirstNameAndLastName(firstName, lastName);
	}

	

}
