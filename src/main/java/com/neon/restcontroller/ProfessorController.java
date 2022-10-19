/**
 * 
 */
package com.neon.restcontroller;

import java.util.List;
import java.util.Map;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import javax.ws.rs.core.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.neon.bean.Grade;
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

	@GetMapping("/viewEnrolledStudent/{courseId}")
	public List<Student> viewEnrolledStudent(@PathVariable("courseId") int courseId) {
		return professordao.viewEnrolledStudent(courseId);
	}

	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.POST, value = "/grade_1")
	@ResponseBody
	public  String addGrade(@RequestBody int studentId, @RequestBody String gradeName) {
		professordao.addGrades(studentId, gradeName);
		return "Grade has been added";
	}

	@GetMapping("/grade")
	public List<Grade> viewGrades() {
		return professordao.viewGrades();
	}
}
