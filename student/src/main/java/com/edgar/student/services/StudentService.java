package com.edgar.student.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.edgar.student.models.Student;
import com.edgar.student.repositories.StudentRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentService {
	
	private final StudentRepository studentRepository;
	
	/* save a student */
	public Student newStudent(Student student) {
		return studentRepository.save(student);
	}
	
	/* find all students */
	public List<Student> findAllStudents(){
		return studentRepository.findAll();
	}

	public List<Student> findAllStudentsBySchool(Long schoolId) {
		return studentRepository.findBySchoolId(schoolId);
	}
	
	

}
