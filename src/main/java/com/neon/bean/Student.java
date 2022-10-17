package com.neon.bean;

/**
 * @author user361
 * Student bean class.
 */
public class Student {
private int id;
private String firstName;
private String lastName;
private String mailId;
private String pwd;
private String gender;
private int age;





public Student(int id, String firstName, String lastName, String mailId, String pwd, String gender, int age) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.mailId = mailId;
	this.pwd = pwd;
	this.gender = gender;
	this.age = age;
}
public Student() {
	super();
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getMailId() {
	return mailId;
}
public void setMailId(String mailId) {
	this.mailId = mailId;
}
public String getPwd() {
	return pwd;
}
public void setPwd(String pwd) {
	this.pwd = pwd;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", mailId=" + mailId + ", pwd="
			+ pwd + ", gender=" + gender + ", age=" + age + "]";
}


}
