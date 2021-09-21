package com.yash.SortingBasedOnAtrributes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class StudentData {
    class SortStudentBasedOnFirstName implements Comparator<Student>{
		@Override
		public int compare(Student o1, Student o2) {
			return o1.getFirstName().compareTo(o2.getFirstName());
		}
	
	}
    class SortStudentBasedOnLastName implements Comparator<Student>{
		@Override
		public int compare(Student o1, Student o2) {
			return o1.getLastName().compareTo(o2.getLastName());
		}
	
	}
    class SortStudentBasedOnAge implements Comparator<Student>{
		@Override
		public int compare(Student o1, Student o2) {
                                        if(o1.getAge()>o2.getAge())
                                            return 1;
                                        else if(o1.getAge()<o2.getAge())
                                            return -1;
                                        else 
                                            return 0;
                                                
                    
		}
	
	}
    public static void main(String[] args) {
        
        List<Student> listStudent=new ArrayList<>();
        
        try(Scanner sc=new Scanner(System.in))
        {
            for(int i=1;i<=4;i++)
            {
                Student std=new Student();
                System.out.println("Enter Detail of "+i+" Student");   
                System.out.println("==>Enter Roll No.:");
                std.setRollNo(sc.nextInt());
                System.out.println("==>Enter First Name: ");
                std.setFirstName(sc.next());
                System.out.println("==>Enter Last Name: ");
                std.setLastName(sc.next());
                System.out.println("==>Enter Age Name: ");
                std.setAge(sc.nextInt());
                System.out.println("==>Enter FIRST Semester Marks :");
                std.setFirstSemesterMarks(sc.nextDouble());
                System.out.println("==>Enter SECOND Semester Marks: ");
                std.setSecondSemesterMarks(sc.nextDouble());
                System.out.println("==>Enter THIRD Semester Marks: "); 
                std.setThirdSemesterMarks(sc.nextDouble());
                listStudent.add(std);
         }
        }
        catch(InputMismatchException ime)
        {
            System.err.println("Error ! Data is not appropiate ");
        }
       
       double totalMarks;
        for(Student student:listStudent)
        {   
            double firstSem=student.getFirstSemesterMarks();
            double secondSem=student.getSecondSemesterMarks();
            double thirdSem=student.getThirdSemesterMarks();
            totalMarks=((firstSem+secondSem+thirdSem)/300)*100;    
            student.setPercentage(totalMarks);
        }
        
        Collections.sort(listStudent,new StudentData().new SortStudentBasedOnFirstName());
        System.out.println("***** Sorted List Based on First Name *****");
        for(Student student:listStudent)
        {
            System.out.println(student);
        }
        Collections.sort(listStudent,new StudentData().new SortStudentBasedOnLastName());
        System.out.println("***** Sorted List Based on Last Name *****");
        for(Student student:listStudent)
        {
            System.out.println(student);
        }
        Collections.sort(listStudent,new StudentData().new SortStudentBasedOnAge());
        System.out.println("***** Sorted List Based on Age Name *****");
        for(Student student:listStudent)
        {
            System.out.println(student);
        }
        
        
        Collections.sort(listStudent,new Comparator<Student>(){

            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getPercentage()>o2.getPercentage())
                                            return -1;
                                        else if(o1.getPercentage()<o2.getPercentage())
                                            return 1;
                                        else 
                                            return 0;
           }
            
            
        });
        System.out.println("***** Sorted List Based on Percentage Name *****");
        for(Student student:listStudent)
        {
            System.out.println(student);
        }
        
        
    }
    
}
