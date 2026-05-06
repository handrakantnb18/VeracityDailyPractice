package com.collage.Student.mgmt.System.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.collage.Student.mgmt.System.entity.StudentEntity;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Long> {

	
	List<StudentEntity> getStudentIdGreaterThanFour(long id);
}
