package com.springrest.springrest.services;

import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {
	
	
	
	List<Course> list;
	
	public CourseServiceImpl() {
		list  = new ArrayList<>();
		list.add(new Course(145,"Java core course","This course contains java "));
		list.add(new Course(146,"Javascript course","This course contains topic related to maven"));
		
	}

	@Override
	public List<Course> getCourses() {
		return list;
		
		
	}
	Course c = null;

	@Override
	public Course getCourse(long courseId) {
		
		list.forEach(
			i -> {
				if(i.getId() == courseId) {
					c=i;
					
				}
			}
				
				
				
				);
		
		return c;
		
		
	}

	@Override
	public Course addCourse(Course course) {
	list.add(course);
	return course;
	
		
	}

	@Override
	public Course updateCourse(Course course) {
		list.forEach(
				e -> 
				{
					if(e.getId() == course.getId()) {
						e.setTitle(course.getTitle());
						e.setDescription(course.getDescription());
					}
				}
				
				
				
				
				);
		return course;
		
		
		
	}
	Course x = null;

	@Override
	public void deleteCourse(long courseId) {
		list.forEach(
				e ->
				{
					if(e.getId() == courseId) {
						x=e;
					}
				}
				
				
				
				);
		
		
		list.remove(x);
		
	}
	
	

	
		
		
	

}
