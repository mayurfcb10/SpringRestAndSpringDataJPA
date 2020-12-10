package com.cg.springrest.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.springrest.dao.CourseDao;
import com.cg.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {
	@Autowired
	private CourseDao courseDao;

//	List<Course> list;

	public CourseServiceImpl() {
//		list = new ArrayList();
//		list.add(new Course(11, "Java", "Complete Book from beginner to advance"));
//		list.add(new Course(111, "Cpp", "Complete Book from noob to advance"));
//		list.add(new Course(1111, "ReactJS", "Complete Book from beginner to pro"));
	}

	@Override
	public List<Course> getCourses() {
		//return list;
		return courseDao.findAll();
	}

	@Override
	public Course getCourse(long courseId) {
//		for (Course course : list) {
//			if (course.getId() == (courseId)) {
//				return course;
//			}
//		}
		return courseDao.getOne(courseId);
	}

	@Override
	public Course addCourse(Course course) {
//		list.add(course);
		courseDao.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
//		list.forEach(e->{
//			if(e.getId() == course.getId()) {
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription());
//			}
//			
//		});
		courseDao.save(course);
		return course;
	}

	@Override
	public void deleteCourse(long courseId) {
		// list = this.list.stream().filter(e-> e.getId() !=
		// courseId).collect(Collectors.toList());
		Course entity = courseDao.getOne(courseId);
		courseDao.delete(entity);
	}

}
