package com.jdc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jdc.entity.Student;
import com.jdc.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService serv;
	
	@PostMapping("/save")
	public ResponseEntity<Student> saveStudent(@RequestBody Student student) {
		Student s1 = serv.setStudent(student);
		
		return new ResponseEntity<>(s1, HttpStatus.CREATED);
	}
	
	@GetMapping("/allstudents")
	public List<Student> getAllStudents(){
		List<Student> students = serv.getStudents();
		return students;
	}
	

}
