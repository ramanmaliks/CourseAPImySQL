package com.restapi.booksapimysql.interfaces;

import java.util.List;
import java.util.Optional;

import com.restapi.booksapimysql.entities.Courses;

public interface CourseService {

	// for getting all records
	public List<Courses> getCourses();
	// for getting one record
	public Optional<Courses> getCourses(long courseId);
	// for adding a record
	public Courses addCourse(Courses courses);
	// for updating a record
	public Courses updateCourse(Courses course, long courseId);
	// for deleting a record
	public void deleteCourse(long parseLong); 
	
	
	
}
