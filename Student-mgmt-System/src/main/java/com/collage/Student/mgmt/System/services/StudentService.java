package com.collage.Student.mgmt.System.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.collage.Student.mgmt.System.entity.StudentEntity;
import com.collage.Student.mgmt.System.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	//public void 
	
	public StudentEntity updateStudentById(long id, StudentEntity updatedStudent)
	{
		StudentEntity existingStudent = 
				studentRepository.findById(id).orElse(null);
		
		existingStudent.setStudentName(updatedStudent.getStudentName());
		existingStudent.setEmailId(updatedStudent.getEmailId());
		
		return studentRepository.save(existingStudent);
		
		
	}
	
}
