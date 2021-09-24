package com.yash.entity;

public class Student {
    
    private int rollNo;
    private String studentName;
    private char gender;
    private int studentClass;
    private String phoneNumber;

    public Student() {
    }

    public Student(int rollNo, String studentName, char gender, int studentClass, String phoneNumber) {
        this.rollNo = rollNo;
        this.studentName = studentName;
        this.gender = gender;
        this.studentClass = studentClass;
        this.phoneNumber = phoneNumber;
    }
    
    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(int studentClass) {
        this.studentClass = studentClass;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Student{" + "rollNo=" + rollNo + ", studentName=" + studentName + ", gender=" + gender + ", studentClass=" + studentClass + ", phoneNumber=" + phoneNumber + '}';
    }
    
            
    
}
