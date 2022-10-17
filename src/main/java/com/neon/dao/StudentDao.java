package com.neon.dao;

import java.util.List;
import java.util.Map;

import com.neon.bean.Course;
import com.neon.bean.FeePayment;
import com.neon.bean.Student;

/**
 * @author user361
 * 
 *         Interface for Student DAO operation.
 */
public interface StudentDao {
	/**
	 * @param student
	 * @return it return list of student
	 */
	public List<Student> studentResistratioForCourse(Student student);

	/**
	 * @return it return list of course
	 */
	public List<Course> listcourse();

	/**
	 * @param course
	 * @return it return list of add course
	 */
	public List<Course> addCourse(Course course);

	/**
	 * @param id drop the course
	 */
	public void removeCourse(Long courseId);

	/**
	 * @return it return list of student.
	 */
	public List<Student> liststudent();

	/**
	 * @return it return grade.
	 */
	public Map<String, String> viewGrades();

	/**
	 * This is show fee details.
	 */
	public List<FeePayment> payFee(FeePayment feeform);

}
