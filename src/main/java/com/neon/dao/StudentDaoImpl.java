package com.neon.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.*;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ConnectionDetails;
import com.neon.bean.Course;
import com.neon.bean.FeePayment;
import com.neon.bean.Student;

@Service
public class StudentDaoImpl implements StudentDao {
	
	static Connection con = ConnectionDetails.getConnectionDetails();
	static Scanner sc = new Scanner(System.in);
	@Autowired
	private ProfessorDao professordao;

	private static List<Student> list = new ArrayList<>();
	static {
		list.add(new Student(11, "vaibhav", "patil", "vp@gmail.com", "vp", "M", 28));
		list.add(new Student(12, "snehal", "patil", "sp@gmail.com", "ps", "F", 25));
		list.add(new Student(11, "sunny", "patil", "sp@gmail.com", "sp", "M", 28));
		list.add(new Student(11, "komal", "pagar", "kp@gmail.com", "kp", "F", 26));
	}
	private static List<Course> list1 = new ArrayList<>();
	static {
		list1.add(new Course(101, "course:JAVA",50000));
		list1.add(new Course(202, "course:PYTHON",40000));
		list1.add(new Course(303, "course:C++",30000));
		list1.add(new Course(404, "course:DATA SCIENCE",60000));
	}
	
	private static 	List<FeePayment> fee=new ArrayList<>();

	@Override
	public void studentResistratioForCourse() throws SQLException {
//		list.add(student);
//		System.out.println("Record insert succesfully");
//		return list;
		
		
		boolean b = false;

		System.out.println("Enter your details");

		PreparedStatement pst = con.prepareStatement(
				"Insert into Student(firstName,lastName,mailId,gender,age )values (?,?,?,?,?)");
		
		
		
		try {
			System.out.println("Enter your First Name");
			pst.setString(1, sc.next());
			
			System.out.println("Enter your Surname");
			pst.setString(2, sc.next());

			

			System.out.println("Enter your EmailId");
			pst.setString(5, sc.next());
			
			System.out.println("Enter your Password");
			pst.setString(6, sc.next());
			
			System.out.println("Enter your gender");
			pst.setInt(4, sc.nextInt());
			
			System.out.println("Enter your Age");
			pst.setInt(4, sc.nextInt());
			
			pst.execute();
			
		} catch (SQLIntegrityConstraintViolationException e) {
			System.out.println("plz enter valid EmailId and password  ");
			studentResistratioForCourse();
			System.out.println("Registration Done Successfully....");
		}

	}

	@Override
	public List<Course> addCourse(Course course) {
		list1.add(course);
		System.out.println("Record insert succesfully");
		return list1;

	}

	@Override
	public void removeCourse(Long courseId) {
		list1 = list1.stream().filter(course -> course.equals(courseId)).collect(Collectors.toList());

	}
	
	@Override
	public void liststudent() throws SQLException {

//		list.forEach((x) -> System.out.println(x));
//		return list;

		String sql = "select * from Student ";

		Statement st = con.createStatement();

		ResultSet rs = st.executeQuery(sql);


		System.out.println(
				"----------------------------------------------------------------------------------------------------------------------------------------");
		System.out.printf("%-6s%-20s%-40s%-20s%-20s\n", "ID", "FIRST-NAME", "LAST-NAME", "MAIL-ID", "PASSWORD","GENDER","AGE");
		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------------------------------");

		while (rs.next()) {

			int id = rs.getInt("id");
			String firstName = rs.getString("firstName");
			String lastName = rs.getString("lastName");
			String mailId = rs.getString("mailId");
			String pwd = rs.getString("pwd");
			String gender=rs.getString("gender");
			int age=rs.getInt("age");
			

			System.out.printf("%-6s%-20s%-40s%-20s%-20s\n", id, firstName, lastName, mailId, pwd,gender,age);

		}

		System.out.println(
				"---------------------------------------------------------------------------------------------------------------------------------------");
	}
	
	@Override
	public List<Course> listcourse() {

		list1.forEach((x) -> System.out.println(x));
		return list1;

	}

	@Override
	public List<FeePayment> payFee(FeePayment feeform) {
		list.forEach((x) -> System.out.println(x));
		list1.forEach((x) -> System.out.println(x));
		
	
		fee.add(feeform);
	
		fee.forEach((x) -> System.out.println(x));
	 System.out.println("fee paid successfully");
	return fee;
		
	}

	@Override
	public Map<String, String> viewGrades() {
		return professordao.viewGrades();
		
	}

}
