package com.techment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techment.dao.CourseDao;
import com.techment.entity.Course;

@Service
public class CourseServiceImpl implements ICourseService {
	
	
	@Autowired
	private CourseDao coursedao;

	@Override
	public List<Course> listAll() {
		
		return coursedao.findAll();
	}

	@Override
	public void save(Course course) {
		
		coursedao.save(course);
		
	}

	@Override
	public Course get(int id) {
		
		return coursedao.findById(id).get();
	}

	@Override
	public void delete(Integer id) {
		
		coursedao.deleteById(id);
		
	}

}
