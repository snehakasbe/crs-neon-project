package com.neon.bean;



public class Course {
	private int courseId;
	private String cources;
	private int coursePrice;
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCources() {
		return cources;
	}
	public void setCources(String cources) {
		this.cources = cources;
	}
	
	
	public int getCoursePrice() {
		return coursePrice;
	}
	public void setCoursePrice(int coursePrice) {
		this.coursePrice = coursePrice;
	}
	public Course(int courseId, String cources, int coursePrice) {
		super();
		this.courseId = courseId;
		this.cources = cources;
		this.coursePrice = coursePrice;
	}
	public Course() {
		super();
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", cources=" + cources + ", coursePrice=" + coursePrice + "]";
	}
	
	
	
	

}
