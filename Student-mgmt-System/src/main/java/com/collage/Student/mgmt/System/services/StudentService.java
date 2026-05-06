package com.collage.Student.mgmt.System.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.collage.Student.mgmt.System.entity.StudentEntity;
import com.collage.Student.mgmt.System.repository.StudentRepository;

import jakarta.websocket.server.PathParam;

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

	public StudentEntity updateStudentById1(long id) {
		StudentEntity student = 
				studentRepository.findById(id).orElse(null);
		
		student.setStudentName(student.getStudentName());
		student.setEmailId(student.getEmailId());
		
//		student.getStudentName();
//		student.getEmailId();
//		
		return studentRepository.save(student);
		
	}

	public List<StudentEntity> getStudentIdGreaterThanFour() {
		return studentRepository.getStudentIdGreaterThanFour( long id);
	}
	
	
	
}
