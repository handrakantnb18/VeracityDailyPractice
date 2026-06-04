package com.sspp.studentAPI.service;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sspp.studentAPI.entity.Student;
import com.sspp.studentAPI.repo.StudentRepository;

import jakarta.persistence.Id;

@Service
public class StudentService {

	@Autowired
	StudentRepository repository;
	
	public Student getById(int id)
	{
		Student student = null;
		Optional<Student> op = repository.findById(id);
		if(op.isPresent())
		{
			student = op.get();
		}
		
		Student updatedStudent = new Student();
		updatedStudent.setId(student.getId());
		updatedStudent.setAddress(student.getAddress());
		updatedStudent.setCourse(student.getCourse());
		updatedStudent.setCourseFees(student.getCourseFees());
		updatedStudent.setEmail(student.getEmail());
		updatedStudent.setGender(student.getGender());
		updatedStudent.setMobileNo(student.getMobileNo());
		updatedStudent.setName(student.getName());
		updatedStudent.setTiming(Arrays.asList(student.getTiming()));
		
		return student;
	}
	
	public Student saveStudent(Student student)
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
		
		Student savedSudent = repository.save(student);
		
		return savedSudent;
		
	}
}
