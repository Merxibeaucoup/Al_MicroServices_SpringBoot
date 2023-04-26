package com.edgar.student.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edgar.student.models.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
	
	List<Student> findBySchoolId(Long schoolId);

}
