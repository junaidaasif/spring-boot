package com.techment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techment.entity.Course;
import com.techment.service.ICourseService;

@RestController
@RequestMapping(value="/courseController")
public class CourseController {
	
	@Autowired
	ICourseService icourseservice;
	
	
	@GetMapping(value="/courses")
	public List<Course> list()
	{
		return icourseservice.listAll();
		
	}
	
	
	@GetMapping(value="/courseById")
	public String get(@PathVariable int id)
	{
		icourseservice.get(id);
		return "course by id";
		
	}
	
	@PostMapping(value="/addingCourse")
	public void add(@RequestBody Course course)
	{
		icourseservice.save(course);
	}
	
	public String update(@RequestBody Course course, @PathVariable int id)
	{
		icourseservice.get(id);
		icourseservice.save(course);
		return "updating course by id";
		
	}
	
	
	

}
