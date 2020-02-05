package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.StudentDAO;
import com.example.demo.entity.Student;

@SpringBootApplication
public class SpringJpaIntegrationApplication2 implements CommandLineRunner {
           // private StudentDAO studentDAO;
            
	/*
	 * @Autowired public SpringJpaIntegrationApplication2(StudentDAO studentDAO) {
	 * super(); this.studentDAO = studentDAO; }
	 */
            
	public static void main(String[] args) {
		SpringApplication.run(SpringJpaIntegrationApplication2.class, args);
	}

	public void run(String... args) throws Exception{
		
		/*
		 * studentDAO.save(new Student(1,"sakshi", "khatri")); studentDAO.save(new
		 * Student(1,"saks61", "khat5ri"));
		 * 
		 */

	}
}
