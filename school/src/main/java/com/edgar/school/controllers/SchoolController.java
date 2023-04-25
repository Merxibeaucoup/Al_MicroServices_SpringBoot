package com.edgar.school.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edgar.school.models.School;
import com.edgar.school.services.SchoolService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/schools")
@RequiredArgsConstructor
public class SchoolController {
	
	private final SchoolService schoolService;
	
	
	@PostMapping("/save")
	public ResponseEntity<School> saveSchool(@RequestBody School school){	
		return ResponseEntity.ok(schoolService.newSchool(school));
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<School>> allStudents(){
		return ResponseEntity.ok(schoolService.findAllSchools());
	}

}
