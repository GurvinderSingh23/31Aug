
package com.yash.view;

import com.yash.controller.StudentController;
import com.yash.entity.Student;
import com.yash.model.StudentModel;
import java.util.InputMismatchException;
import java.util.Scanner;


public class MainView {
    
    StudentController studentController=new StudentController();
        
        public void mainMenu() {
            
	System.out.println(" ========MAIN MENU========");
	System.out.println("=>1. View Student Details");
	System.out.println("=>2. Register Studennt");
	System.out.println("=>3. Update Student Detail");
	System.out.println("=>4. Delete Student");
	System.out.println("=>5. Exit");
	try(Scanner scanner1=new Scanner(System.in)){
                                          System.out.print("**Option:");
                                       if(scanner1.hasNextInt()){
		int option=scanner1.nextInt();
		switch(option) {
		case 1:viewStudent();
		       break;
		case 2:registerStudent();
		   break;
		case 3:updateStudent();
		   break;
		case 4:deleteStudent();
		  break;
		case 5:
                                                  System.out.println("========THANK YOU========");
                                                System.exit(0);
		   break;
		default:System.out.println("!ERROR **SELECT APPROPRIATE OPTION**");
		        mainMenu();		  
                }}else
                                       {
                                           System.out.println("Any Unexcepted ");
                                       }
		
	}catch(Exception e) {
		System.out.println("!ERROR **SELECT APPROPRIATE OPTION ** "+e);
	
                }
        }
        public void viewStudent()
        {
            System.out.println("========VIEW STUDENT========");
            System.out.println("=>1. View Student Detail By Roll No.");
            System.out.println("=>2. View All Students Details ");
            System.out.println("=>3. Main Menu");
	try(Scanner scanner2=new Scanner(System.in)){
		System.out.print("**Option:");
		int option=scanner2.nextInt();
		switch(option) {
		case 1:
                                                  System.out.println("==> Enter Student Roll No. "); 
                                                  int rollNo=scanner2.nextInt();
                                                  studentController.viewStudentByRollNo(rollNo);
                                                  break;
		case 2: studentController.viewAllStudentDetail();
		   break;
		case 3: mainMenu();
		   break;
		
		default:System.out.println("!ERROR **SELECT APPROPRIATE OPTION**");
		        viewStudent();
		}
		
	}catch(Exception e) {
		System.out.println("!ERROR **SELECT APPROPRIATE OPTION**"+e.getMessage());
	
                }
        }
        
        
        
        public void updateStudent()
        {
            System.out.println("========UPDATE STUDENT========");
            System.out.println("=>1. Update Student By Roll Number ");
            System.out.println("=>2. Main Menu");
	try(Scanner scanner2=new Scanner(System.in)){
		System.out.print("**Option:");
		int option=scanner2.nextInt();
		switch(option) {
		case 1:
                                                  System.out.println("==> Enter Student Roll Number : "); 
                                                  int rollNo=scanner2.nextInt();
                                                  studentController.updateStudent(rollNo);
                                                  break;
		case 2: mainMenu();
		   break;
		
		default:System.out.println("!ERROR **SELECT APPROPRIATE OPTION**");
		        deleteStudent();
		}
		
	}catch(Exception e) {
		System.out.println("!ERROR **SELECT APPROPRIATE OPTION**"+e.getMessage());
	
                }
            
            
        }
        public void deleteStudent()
        {
            System.out.println("========DELETE STUDENT========");
            System.out.println("=>1. Delete Student By Roll Number ");
            System.out.println("=>2. Main Menu");
	try(Scanner scanner2=new Scanner(System.in)){
		System.out.print("**Option:");
		int option=scanner2.nextInt();
		switch(option) {
		case 1:
                                                  System.out.println("==> Enter Student Roll Number : "); 
                                                  int rollNo=scanner2.nextInt();
                                                  studentController.deleteStudent(rollNo);
                                                  break;
		case 2: mainMenu();
		   break;
		
		default:System.out.println("!ERROR **SELECT APPROPRIATE OPTION**");
		        deleteStudent();
		}
		
	}catch(Exception e) {
		System.out.println("!ERROR **SELECT APPROPRIATE OPTION**"+e.getMessage());
	
                }
        }
         public void registerStudent()
        {
            int rollNo;
            StudentModel sm=new  StudentModel();
            try
            {
                Scanner scanner=new Scanner(System.in);
            System.out.println("========ADD STUDENT========");
            System.out.println("==> Enter Roll Number :");
            if(scanner.hasNextInt())
            {
                rollNo=scanner.nextInt();
            sm.setRollNo(rollNo);
            }
            else
                throw new NullPointerException("ERROR! No Data is Inserted ");
            System.out.println("==> Enter Student Name :");
            if(scanner.hasNext())
            {
            sm.setStudentName(scanner.next());
            }
            else
                throw new NullPointerException("ERROR! No Data is Inserted ");
            
            System.out.println("==> Enter Student Gender (Only M/F/O) :");
            if(scanner.hasNext())
            {
                String gender=scanner.next();
               if(gender.equals("M") || gender.equals("F") || gender.equals("O"))
               {
                   sm.setGender(gender.charAt(0));
               }
               else
               {
                   System.out.println("Enter Only (M /F /O)");
                   registerStudent();
               }
            }
            else
                throw new NullPointerException("ERROR! No Data is Inserted ");
            System.out.println("==> Enter Student Class :");
            if(scanner.hasNextInt())
            {
               sm.setStudentClass(scanner.nextInt());
            }
            else
                throw new NullPointerException("ERROR! No Data is Inserted ");
            System.out.println("==> Enter Phone Number :");
            if(scanner.hasNext())
            {
                sm.setPhoneNumber(scanner.next());
            }
            else
                throw new NullPointerException("ERROR! No Data is Inserted ");
            }
            catch(InputMismatchException e)
            {
                System.out.println(e.getMessage());
            }
            studentController.addStudent(sm);
        }
      
            
  }
              
        
        

           
   
