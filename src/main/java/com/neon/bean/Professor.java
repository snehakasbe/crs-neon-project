package com.neon.bean;

public class Professor {
private int id;
private String lastName;
private String firstName;
private String email;
private String username;
private String password;




public Professor(int id, String lastName, String firstName, String email, String username, String password) {
	super();
	this.id = id;
	this.lastName = lastName;
	this.firstName = firstName;
	this.email = email;
	this.username = username;
	this.password = password;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "Professor [id=" + id + ", lastName=" + lastName + ", firstName=" + firstName + ", email=" + email
			+ ", username=" + username + ", password=" + password + "]";
}



}
