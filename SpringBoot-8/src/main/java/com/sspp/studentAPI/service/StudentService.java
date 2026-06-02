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
		if(student.getCourse().equalsIgnoreCase("Java Full Stack"))
		{
			student.setCourseFees(50000.00);
		}
		else if(student.getCourse().equalsIgnoreCase("Python Full Stack"))
		{
			student.setCourseFees(60000.00);
		}
		else
		{
			student.setCourseFees(80000.00);
		}
		
		repository.save(student);
	}
}
