package com.jdc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jdc.entity.Student;
import com.jdc.repository.StudentRepo;

@Service
public class StudentService {
	@Autowired
	private StudentRepo repo;
	
	public Student setStudent(Student student) {
	
	Student save = repo.save(student);
	System.out.println("student data saved");
	return save;
	}
	
	public List<Student> getStudents(){
		List<Student> list = repo.findAll();
		list.forEach(System.out::println);
		return list;
	}
}
