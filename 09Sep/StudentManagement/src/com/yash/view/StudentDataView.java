package com.yash.view;

import com.yash.controller.StudentController;
import com.yash.entity.Student;
import java.util.List;
import java.util.Scanner;

public class StudentDataView {
    
    MainView mv1=null;
    
   public void studentData(List<Student> students)
   {
       int count=0;
       System.out.println("< ========All Student Detail  ========>");       
       for(Student studentData:students)
       {
           count++;
       System.out.println(" ========Student Detail of Roll Number "+studentData.getRollNo() +"========");
	System.out.println("=> Student Roll Number : "+studentData.getRollNo());
	System.out.println("=> Student Name : "+studentData.getStudentName());
	System.out.println("=> Student Gender : "+studentData.getGender());
	System.out.println("=> Student Class : "+studentData.getStudentClass() );
                    System.out.println("=> Student Phone Number : "+studentData.getPhoneNumber());
       }
       System.out.println("Total Number Of Students is "+count);
                    mv1=new MainView();
                    mv1.viewStudent();
       
   }
    
    public void studentData(int rollNo,Student studentData,String work)
    {
         
        System.out.println(" ========Student Detail of Roll Number "+rollNo +"========");
	System.out.println("=> Student Roll Number : "+studentData.getRollNo());
	System.out.println("=> Student Name : "+studentData.getStudentName());
	System.out.println("=> Student Gender : "+studentData.getGender());
	System.out.println("=> Student Class : "+studentData.getStudentClass() );
                    System.out.println("=> Student Phone Number : "+studentData.getPhoneNumber());
                    if("view".equals(work))
                    {
                    mv1=new MainView();
                    mv1.viewStudent();
                    }
                    else if("update".equals(work))
                    {
                        updateStudentData(studentData);
                    }
    }
    public void deletedStudedent(int rollNo,boolean value)
    {
        if(value)
        {
        System.out.println("Student have Roll Number "+rollNo +" Detail is Deleted ");
        }
        mv1=new MainView();
        mv1.deleteStudent();
    }
    
    public void newRegisteration()
        {
                System.out.println("***** Student Registeration SUCCESSFULL *****");
                mv1=new MainView();
                mv1.mainMenu();
            }
    
            public void updateStudentData(Student student){
                int rollNo=student.getRollNo();
                StudentController sc=new StudentController();
                System.out.println("What do you want to update ??"); 
	System.out.println("=>1. Roll Number");
	System.out.println("=>2. Student Name");
	System.out.println("=>3. Student Gender");
	System.out.println("=>4. Student Class");
	System.out.println("=>5. Student Phone Number");
                System.out.println("=>6. Main Menu");
	try(Scanner scanner1=new Scanner(System.in)){
                                          System.out.print("**Option:");
                                       if(scanner1.hasNextInt()){
		int option=scanner1.nextInt();
                                        switch(option) {
		case 1:
                                                    System.out.println("==> Enter New Roll Number: ");
                                                    if(scanner1.hasNextInt())
                                                    {
                                                        student.setRollNo(scanner1.nextInt());
                                                       sc.updateStudent(rollNo,student);
                                                    }
                                                    else
                                          throw new NullPointerException("ERROR! No Data is Inserted ");
		       break;
		case 2:
                                                    System.out.println("==> Enter new Student Name: ");
                                                    if(scanner1.hasNext())
                                                    {
                                                        student.setStudentName(scanner1.next());
                                                        sc.updateStudent(rollNo,student);
                                                    }else
                                              throw new NullPointerException("ERROR! No Data is Inserted ");
		   break;
		case 3:
                                                String gender;
                                                System.out.println("==> Enter Gender (Only M/F/O) : ");
                                                if(scanner1.hasNext())
                                                    {
                                                        gender=scanner1.next();
                                                         if(gender.equals("M") || gender.equals("F") || gender.equals("O"))
                                                         {
                                                             student.setGender(gender.charAt(0));
                                                             sc.updateStudent(rollNo,student);
                                                         }else
                                                         {
                                                             System.out.println("Enter Only M/F/O");
                                                             updateStudentData(student);
                                                         }
                                                    }else
                                                throw new NullPointerException("ERROR! No Data is Inserted ");
		   break;
		case 4:
                                                System.out.println("==> Enter New Student Class: ");
                                                if(scanner1.hasNextInt())
                                                    {
                                                        student.setStudentClass(scanner1.nextInt());
                                                        sc.updateStudent(rollNo,student);
                                                    }
                                                else
                                         throw new NullPointerException("ERROR! No Data is Inserted ");
		  break;
		case 5:
                                            System.out.println("==> Enter New Phone Number: ");
                                            if(scanner1.hasNext())
                                                    {
                                                        student.setPhoneNumber(scanner1.next());
                                                        sc.updateStudent(rollNo,student);
                                                    }
                                                else
                                             throw new NullPointerException("ERROR! No Data is Inserted ");
		   break;
                                            case 6:
                                                mv1.mainMenu();
		  break;
		default:System.out.println("!ERROR **SELECT APPROPRIATE OPTION**");
		        mv1.updateStudent();
                }}
		
	}catch(Exception e) {
		System.out.println("!ERROR **SELECT APPROPRIATE OPTION ** "+e);
	
                }
               
            }
            
    }
    
   
