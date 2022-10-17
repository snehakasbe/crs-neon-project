package com.neon.dao;

import java.util.Map;

import org.springframework.stereotype.Repository;

/**
 * @author user361 Interface for Professor DAO operation.
 *
 */
@Repository
public interface ProfessorDao {

	/**
	 * @param grade add grade to student
	 */
	public Map<String, String> addGrades(String name, String grade);

	/**
	 * @return it return enrolled student list.
	 */
	public Map<String, String> viewEnrolledStudent();

	/**
	 * @param grade view grade grade to student
	 */
	public Map<String, String> viewGrades();
}
