package com.yash.FirstAssignment;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SerializeStudent {
	public static void main(String[] args) {
		List<Student> stdList=new ArrayList<>();
		try(Scanner sc=new Scanner(System.in))
		{
			for(int i=0;i<2;i++)
			{
				System.out.println("Enter "+i+" Student Details");
				Student std=new Student();
				System.out.println("Enter Student Roll number: ");
				std.setRollNo(sc.nextInt());
				System.out.println("Enter Student Name : ");
				std.setStudentName(sc.next());
				System.out.println("Enter Student 1 Semester Marks : ");
				std.setSem1Marks(sc.nextInt());
				System.out.println("Enter Student 2 Semester Marks : ");
				std.setSem2Marks(sc.nextInt());
				System.out.println("Enter Student 3 Semester Marks : ");
				std.setSem3Marks(sc.nextInt());
				System.out.println("Enter Student 4 Semester Marks : ");
				std.setSem4Marks(sc.nextInt());
				System.out.println("Enter Student 5 Semester Marks : ");
				std.setSem5Marks(sc.nextInt());
				System.out.println("Enter Student 6 Semester Marks : ");
				std.setSem6Marks(sc.nextInt());
				int percentage=(std.getSem1Marks()+std.getSem2Marks()+std.getSem3Marks()+
						std.getSem4Marks()+std.getSem5Marks()+std.getSem6Marks())/6;
				System.out.println(percentage);
				std.setPercentage(percentage);
				stdList.add(std);
				
			}
			
		}
		
		
		//Put data into file student.dat(Serializable)	
		try(OutputStream os=new FileOutputStream("D:\\File\\student.dat");
				ObjectOutputStream oos=new ObjectOutputStream(os);
			   ){
				for(Student std:stdList)
				{
				oos.writeObject(std);
				System.out.println(std);
				}
				
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	

}
