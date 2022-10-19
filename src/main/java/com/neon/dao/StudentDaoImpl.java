package com.neon.dao;

import java.util.*;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neon.bean.Course;
import com.neon.bean.FeePayment;
import com.neon.bean.Student;
import com.neon.configuration.JDBCConfiguration;

/**
 * @author user361 
 * Student DAO Implementation.
 */
@Repository
public class StudentDaoImpl implements StudentDao {

	Logger logger = LoggerFactory.getLogger(StudentDaoImpl.class);
	

	 @Autowired
	private	JDBCConfiguration jdbcTemplateObject;

	
	
	@Override
	@Transactional
	public void studentResistratioForCourse(String firstName, String lastName, String emailId, String gender, int age) {
		String SQL = "insert into employee (S_Firstname, S_Lastname,S_Email, S_Gender, S_Age) values (?, ?, ?, ?, ?)";
	      
		 jdbcTemplateObject.jdbcTemplate().update(SQL);
		 System.out.println("Created Record Name = " + firstName + " lastName = " + lastName +" Email = " + emailId +" Gender = " + gender +" Age = " + age);
		
		
		
	}

	@Override
	public List<Course> listcourse() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Course> addCourse(Course course) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeCourse(Long courseId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Student> liststudent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, String> viewGrades() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FeePayment> payFee(FeePayment feeform) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
