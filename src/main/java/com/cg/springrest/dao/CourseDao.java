package com.cg.springrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.springrest.entities.Course;

public interface CourseDao extends JpaRepository<Course, Long>{
	
}
