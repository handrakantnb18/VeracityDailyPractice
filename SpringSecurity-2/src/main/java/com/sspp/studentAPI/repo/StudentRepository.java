package com.sspp.studentAPI.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sspp.studentAPI.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
