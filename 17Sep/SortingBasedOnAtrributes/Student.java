package com.yash.SortingBasedOnAtrributes;

public class Student {
   
    private int rollNo;
    private String firstName;
    private String lastName;
    private int age;
    private double firstSemesterMarks;
    private double secondSemesterMarks;
    private double thirdSemesterMarks;
    private double percentage;
    
    public Student() {
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getFirstSemesterMarks() {
        return firstSemesterMarks;
    }

    public void setFirstSemesterMarks(double firstSemesterMarks) {
        this.firstSemesterMarks = firstSemesterMarks;
    }

    public double getSecondSemesterMarks() {
        return secondSemesterMarks;
    }

    public void setSecondSemesterMarks(double secondSemesterMarks) {
        this.secondSemesterMarks = secondSemesterMarks;
    }

    public double getThirdSemesterMarks() {
        return thirdSemesterMarks;
    }

    public void setThirdSemesterMarks(double thirdSemesterMarks) {
        this.thirdSemesterMarks = thirdSemesterMarks;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "Student{" + "rollNo=" + rollNo + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", firstSemesterMarks=" + firstSemesterMarks + ", secondSemesterMarks=" + secondSemesterMarks + ", thirdSemesterMarks=" + thirdSemesterMarks + ", percentage=" + percentage + "%"+'}';
    }
    
    
    
    
    
    
}
