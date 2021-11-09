package com.yash.FirstAssignment;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SerializeDeserializeStudent {
	
	public static void main(String[] args) {
	//Put data into file student.dat(Serializable)	
	try(
			OutputStream os=new FileOutputStream("D:\\File\\student.dat");
			ObjectOutputStream oos=new ObjectOutputStream(os);
		   ){
			
           	Student s1=new Student();
           	s1.setStudentRolNo(101);
           	s1.setStudentName("Gurvinder Singh");
           	
           	s1.setMarks(new int[]{45,67,75,58,87,77});
			oos.writeObject(s1);
			Student s2=new Student();
           	s2.setStudentRolNo(102);
           	s2.setStudentName("Kulvir Singh");
           	s2.setMarks(new int[]{55,68,54,59,77,81});
			oos.writeObject(s2);
			System.out.println("Data put .....");
		}catch(IOException e) {
			e.printStackTrace();
		}
	
	//Read Data from student.dat(Deserializable)
	List<Student> studentList=new ArrayList<>();
	Map<Student,Double> studentPercent=new HashMap<>();
	try(
			InputStream is=new FileInputStream("D:\\File\\student.dat");
			ObjectInputStream ois=new ObjectInputStream(is)
			)
	{
		while(is.available()!=0)
		{
			Student ss=(Student)ois.readObject();
			studentList.add(ss);
		}
		
		for(Student std:studentList)
		{
			int totalMarks=0;
			int studentRoll=std.getStudentRolNo();
			String studentName=std.getStudentName();
			int[] marks=std.getMarks();
			for(int mark:marks)
			{
				totalMarks+=mark;
			}
			
			double percentage=totalMarks/6;
			System.out.println("Percentage of "+studentRoll+" "+studentName+" : "+percentage+"%");
			studentPercent.put(std,percentage);
			
		}
	
		
	}
	catch(IOException | ClassNotFoundException  e)
	{
		e.printStackTrace();
	}
	
	}

}
