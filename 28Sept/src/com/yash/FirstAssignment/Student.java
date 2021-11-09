package com.yash.FirstAssignment;

import java.io.Serializable;
import java.util.Arrays;

public class Student implements Serializable
{
	
	private int studentRolNo;
	private String studentName;
	private int[] marks;
	
	
	public Student() {
	
	}
	public Student(int studentRolNo, String studentName, int[] marks) {
		super();
		this.studentRolNo = studentRolNo;
		this.studentName = studentName;
		this.marks = marks;
	}
	public int getStudentRolNo() {
		return studentRolNo;
	}
	public void setStudentRolNo(int studentRolNo) {
		this.studentRolNo = studentRolNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [studentRolNo=" + studentRolNo + ", studentName=" + studentName + ", marks="
				+ Arrays.toString(marks) + "]";
	}
	

}
