package com.edgar.student.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edgar.student.models.Student;
import com.edgar.student.services.StudentService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/students")
@RequiredArgsConstructor
public class StudentController {
	
	private final StudentService studentService;
	
	
	@PostMapping("/save")
	public ResponseEntity<Student> saveStudent(@RequestBody Student student){	
		return ResponseEntity.ok(studentService.newStudent(student));
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Student>> allStudents(){
		return ResponseEntity.ok(studentService.findAllStudents());
	}
	
	@GetMapping("/school/{schoolId}")
	public ResponseEntity<List<Student>> allStudents(@PathVariable long schoolId){
		return ResponseEntity.ok(studentService.findAllStudentsBySchool(schoolId));
	}

}
