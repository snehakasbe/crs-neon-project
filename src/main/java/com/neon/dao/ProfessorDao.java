package com.neon.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.neon.bean.Grade;
import com.neon.bean.Student;

/**
 * @author user361 Interface for Professor DAO operation.
 *
 */
@Repository
public interface ProfessorDao {

	/**
	 * @param grade add grade to student
	 */
	public void addGrades(int studentId, String gradeName);

	/**
	 * @return it return enrolled student list.
	 */
	public List<Student> viewEnrolledStudent(int profId);

	/**
	 * @param grade view grade grade to student
	 */
	public List<Grade> viewGrades();
}
