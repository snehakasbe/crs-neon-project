package com.neon.dao;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.neon.bean.Grade;
import com.neon.bean.Student;
import com.neon.configuration.JDBCConfiguration;
import com.neon.mapper.GradeMapper;
import com.neon.mapper.StudentMapper;

/**
 * @author user361 Professor DAO Implementation.
 */
@Repository
public class ProfessorImplDAO implements ProfessorDao {

	// create the reference of looger here
	Logger logger = LoggerFactory.getLogger(ProfessorImplDAO.class);

	// DI injection of JDBCTemplate
	@Autowired
	private JDBCConfiguration jdbcTemplateObject;

	/**
	 * grade added
	 */
	@Override
	@Transactional
	public void addGrades(int studentId, String gradeName) {
		String SQL = "insert into Exam (studentId, gradeName) values (?, ?)";
		 jdbcTemplateObject.jdbcTemplate().update( SQL, studentId, gradeName);
		 System.out.println("Grade = " + gradeName + " Student_Id = " + studentId);		
	}

	@Override
	@Transactional
	public List<Student> viewEnrolledStudent(int courseId) {
		String SQL = "select * from student where Course_ID ="+courseId;
		return jdbcTemplateObject.jdbcTemplate().query( SQL, new StudentMapper());
	}

	@Override
	@Transactional
	public List<Grade> viewGrades() {
		String SQL = "select gradeName from Grade";
		return jdbcTemplateObject.jdbcTemplate().query( SQL, new GradeMapper());
	}

}
