package com.neon.dao;





import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Repository;

import com.neon.bean.Student;
@Repository
public interface ProfessorDao  {
	public Map<String, String> addGrades(String name,String grade);

	public Map<String,String> viewEnrolledStudent();
public Map<String,String> viewGrades();
}
