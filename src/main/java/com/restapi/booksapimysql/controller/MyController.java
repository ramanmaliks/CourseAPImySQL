package com.restapi.booksapimysql.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.booksapimysql.entities.Courses;
import com.restapi.booksapimysql.interfaces.CourseService;

@RestController
@CrossOrigin
public class MyController {
	@Autowired
	private CourseService courseService;

	// for home page
	@GetMapping("/home")
	public String home() {
		return " Welcome, this is my Home Page";
		
	}
	
	
	@GetMapping("/courses")
	public List<Courses> getCourses(){
		return this.courseService.getCourses();
		
	}

	@GetMapping("/courses/{courseId}")
	public Optional<Courses> getCourse(@PathVariable String courseId) {
		return this.courseService.getCourses(Long.parseLong(courseId));
	}

	//@PostMapping("/courses", consumes ="application/json")
	@PostMapping("/courses")
	public Courses addCourse(@RequestBody Courses courses) {
		return this.courseService.addCourse(courses);
	}
	
	//Updating Data in List<>
	@PutMapping("/courses/{courseId}")
	public Courses UpdateCourse(@RequestBody Courses course,@PathVariable String courseId) {
		return this.courseService.updateCourse(course,Long.parseLong(courseId));
	}
	
	//Deleting Data in List<>
	@DeleteMapping("/courses/{courseId}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId) {
		//public String deleterCourse(@PathVariable String courseId){	
		this.courseService.deleteCourse(Long.parseLong(courseId));
		return new ResponseEntity<>(HttpStatus.OK);
		//return "working on Delete" ;
	}
}
