package com.neon.bean;

/**
 * @author user361
 * FeePayment Bean class.
 */
public class FeePayment {
private int id;
private String studentName;
private int courseId;
private int coursePrice;
private int totalAmount;
private String paidAmount;

private String paymentMode;



public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}

public int getCourseId() {
	return courseId;
}
public void setCourseId(int courseId) {
	this.courseId = courseId;
}
public int getCoursePrice() {
	return coursePrice;
}
public void setCoursePrice(int coursePrice) {
	this.coursePrice = coursePrice;
}
public int getTotalAmount() {
	return totalAmount;
}
public void setTotalAmount(int totalAmount) {
	this.totalAmount = totalAmount;
}
public String getPaidAmount() {
	return paidAmount;
}
public void setPaidAmount(String paidAmount) {
	this.paidAmount = paidAmount;
}


public String getPaymentMode() {
	return paymentMode;
}
public void setPaymentMode(String paymentMode) {
	this.paymentMode = paymentMode;
}
public FeePayment(int id, String studentName, int courseId, int coursePrice, int totalAmount, String paidAmount,
		String paymentMode) {
	super();
	this.id = id;
	this.studentName = studentName;
	this.courseId = courseId;
	this.coursePrice = coursePrice;
	this.totalAmount = totalAmount;
	this.paidAmount = paidAmount;
	this.paymentMode = paymentMode;
}
@Override
public String toString() {
	return "FeePayment [id=" + id + ", studentName=" + studentName + ", courseId=" + courseId + ", coursePrice="
			+ coursePrice + ", totalAmount=" + totalAmount + ", paidAmount=" + paidAmount + ", paymentMode="
			+ paymentMode + "]";
}
public FeePayment() {
	super();
}




}
