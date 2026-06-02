package com.sspp.studentAPI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sspp.studentAPI.entity.Student;
import com.sspp.studentAPI.repo.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository repository;
	
	public void saveStudent(Student student)
	{
		repository.save(student);
	}
}
