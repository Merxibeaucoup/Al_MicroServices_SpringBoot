package com.edgar.school.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.edgar.school.models.Students;



@FeignClient(name ="student-service",  url="http://localhost:8443/api/v1/students")
public interface StudentClient {
	
	@GetMapping("/school/{schoolId}")
	List<Students>allStudents(@PathVariable long schoolId);

}
