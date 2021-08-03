package com.restapi.booksapimysql.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restapi.booksapimysql.entities.Courses;

//this is used for CRUD function in DB
public interface CourseDao extends JpaRepository<Courses, Long>{

}
