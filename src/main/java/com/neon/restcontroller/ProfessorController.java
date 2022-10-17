/**
 * 
 */
package com.neon.restcontroller;

import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neon.bean.Student;
import com.neon.dao.ProfessorDao;

/**
 * @author user368
 *
 */
@RestController
@RequestMapping("/Prof")
public class ProfessorController {
	@Autowired
	private ProfessorDao professordao;

	@GetMapping("/viewEnrolledStudent")
	public Map<String, String> viewEnrolledStudent() {
		professordao.viewEnrolledStudent();
		return professordao.viewEnrolledStudent();
	}

	@PostMapping("/grade")
	public Map<String, String> addGrade(String name, String grade) {

		return professordao.addGrades(name, grade);
	}

	@GetMapping("/grade")
	public Map<String, String> viewGrades() {

		return professordao.viewGrades();

	}
}
