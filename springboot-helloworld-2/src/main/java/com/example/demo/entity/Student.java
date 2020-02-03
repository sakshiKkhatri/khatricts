package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Student {

	@Id
	private Integer id;
	private String uId;
	private String firstName;
	private String lastName;
	private String email;
	
}
