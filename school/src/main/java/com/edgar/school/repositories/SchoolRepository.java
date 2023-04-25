package com.edgar.school.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edgar.school.models.School;

public interface SchoolRepository extends JpaRepository<School, Long> {

}
