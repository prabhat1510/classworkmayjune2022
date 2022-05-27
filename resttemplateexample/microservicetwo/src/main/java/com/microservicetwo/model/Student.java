package com.microservicetwo.model;

public class Student {
	private long rollNo;
	private String name;
	private String emailId;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(long rollNo, String name, String emailId) {
		this.rollNo = rollNo;
		this.name = name;
		this.emailId = emailId;
	}
	public long getRollNo() {
		return rollNo;
	}
	public void setRollNo(long rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", emailId=" + emailId + "]";
	}

}
