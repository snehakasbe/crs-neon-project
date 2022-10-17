/**
 * 
 */
package com.neon.restcontroller;

import java.sql.SQLException;
import java.util.*;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.neon.bean.Course;
import com.neon.bean.FeePayment;
import com.neon.bean.Student;
import com.neon.dao.StudentDao;
import com.neon.service.StudentService;

/**
 * @author user368
 *
 */

@RestController
@RequestMapping("/std")
public class StudentController {
	@Autowired
	private StudentDao studentdao;
	private static List<Student> list = new ArrayList<>();
	private static List<Course> list1 = new ArrayList<>();


	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.GET, value = "/student")

	public @ResponseBody Iterable<Student> getStudent() throws SQLException {
		// List<Customer> list = new ArrayList<>();
		studentdao.liststudent();
		System.out.println("record get succesfully");
		return list;

	}

	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.GET, value = "/course")

	public @ResponseBody Iterable<Course> getCourse() {
		// List<Customer> list = new ArrayList<>();
		list1 = studentdao.listcourse();
		System.out.println("record get succesfully");
		return list1;

	}

	@PostMapping("/student")
	public String addStudent(@RequestBody Student student) throws SQLException {

		studentdao.studentResistratioForCourse();
		return "Student has been Added.";
	}

	@PostMapping("/course")
	public String addCourse(@RequestBody Course course) {

		studentdao.addCourse(course);
		return "Course  has been Added.";
	}

	@DeleteMapping("/course/{courseId}")
	public String removeCourse(Long courseId) {
		studentdao.removeCourse(courseId);
		return "Course has been removed.";
	}
	@PostMapping("/fee")
	public String  payFee(FeePayment feeform){
		studentdao.payFee(feeform);
		return "fee paid successfully";
		
	}
	
	@GetMapping("/grade")
	public Map<String, String> viewGrades() {
		return studentdao.viewGrades();
		
	}

}
//@DeleteMapping("/student/{studentId}")
//public String removeStudent(Long studentId) {
//	studentdao.removeStudent(studentId);
//	return "Student  has been removed.";
//}