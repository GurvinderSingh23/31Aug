package com.yash.ThirdAssignment;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class SerializeManager {
	
		public static void main(String[] args)
		{
			
			//Serialization
					try(
						OutputStream os=new FileOutputStream("D:\\assignments\\File\\Manager.ser");
						ObjectOutputStream oos=new ObjectOutputStream(os);
					   ){
						
						Manager manager=new Manager(10111);
						manager.setEmpId(101);
						manager.setEmpFirstName("Guri");
						manager.setEmpLastName("Singh");
						manager.setEmpDob("23-07-1999");
						manager.setEmpGender("Male");
						oos.writeObject(manager);
						
					}catch(IOException e) {
						e.printStackTrace();
					}
					
					//De-Serialization
					try(
						InputStream is=new FileInputStream("D:\\assignments\\File\\Manager.ser");
						ObjectInputStream ois=new ObjectInputStream(is);
					   ){
						
						Manager manager=(Manager)ois.readObject();
						System.out.println(manager);
						System.out.println(manager.getEmpId());
						System.out.println(manager.getEmpFirstName());
						System.out.println(manager.getEmpLastName());
						System.out.println(manager.getEmpDob());//null
						System.out.println(manager.getEmpGender());
						
					}catch(IOException | ClassNotFoundException e) {
						e.printStackTrace();
					}
				}
			
			
	
		
		
	}
