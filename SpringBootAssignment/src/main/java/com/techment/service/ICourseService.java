package com.techment.service;

import java.util.List;

import com.techment.entity.Course;

public interface ICourseService {
	
	List<Course> listAll();
	void save(Course course);
	Course get(int id);
	void delete(Integer id);

}
