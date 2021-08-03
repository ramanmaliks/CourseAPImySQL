package com.restapi.booksapimysql.interfaces;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi.booksapimysql.Dao.CourseDao;
import com.restapi.booksapimysql.entities.Courses;




@Service
public class CourseServiceImpl implements CourseService  
{
	@Autowired
	private CourseDao courseDao;
	
	@Override
	public List<Courses> getCourses() {
		// findAll will return Select * query to show all records
		return courseDao.findAll();
	}
	@Override
	public Optional<Courses> getCourses(long courseId) {
		// searching a record by id
		return courseDao.findById(courseId);
	}
	@Override
	public Courses addCourse(Courses courses) {
		// Adding a course
		return courseDao.save(courses);
		
	}
	@Override
	public Courses updateCourse(Courses course, long courseId) {
		// updating a record
			Courses entity = courseDao.getById(courseId);
			entity.setTitle(course.getTitle());
			entity.setDescription(course.getDescription());
			return courseDao.save(entity);			
	}
	@Override
	public void deleteCourse(long parseLong) {
		// deleting a record
		Courses entity = courseDao.getById(parseLong);
		courseDao.delete(entity);
	}

		
}
