package com.neon.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.neon.bean.Course;
import com.neon.bean.Student;

/**
 * @author user361
 *  Professor DAO Implementation.
 */
@Service
public class ProfessorImplDAO implements ProfessorDao {

	@Autowired

	private static List<Student> list = new ArrayList<>();
	private static Map<String, String> map = new HashMap<String, String>();
	static {
		map.put("snehal", "java");
		map.put("shubham", "Paython");
		map.put("neha", "c++");
		map.put("sneha", "Data Science");
	}
	private static Map<String, String> map1 = new HashMap<String, String>();
	static {

		map1.put("snehal", "A");
		map1.put("shubham", "B");
		map1.put("neha", "C");
		map1.put("sneha", "D");

	}

	/**
	 * grade added
	 */
	@Override
	public Map<String, String> addGrades(String name, String grade) {

		map1.put(name, grade);
		return map1;

	}

	@Override

	public Map<String, String> viewEnrolledStudent() {

		Set s = map.entrySet();
		System.out.println(s);
		return map;
	}

	@Override
	public Map<String, String> viewGrades() {
		Set s = map1.entrySet();
		System.out.println(s);
		return map1;
	}

}
