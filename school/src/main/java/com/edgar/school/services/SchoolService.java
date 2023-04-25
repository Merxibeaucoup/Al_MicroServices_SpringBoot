package com.edgar.school.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.edgar.school.models.School;
import com.edgar.school.repositories.SchoolRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SchoolService {
	
	private final SchoolRepository schoolRepository;
	
	/* save a student */
	public School newSchool(School school) {
		return schoolRepository.save(school);
	}
	
	/* find all students */
	public List<School> findAllSchools(){
		return schoolRepository.findAll();
	}

}
