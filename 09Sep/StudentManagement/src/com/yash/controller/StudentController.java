package com.yash.controller;

import com.yash.entity.Student;
import com.yash.model.StudentModel;
import com.yash.service.StudentServiceImpl;
import com.yash.view.MainView;
import com.yash.view.StudentDataView;
import java.util.List;

public class StudentController {
    
    StudentServiceImpl studentService=new StudentServiceImpl();
    StudentDataView sdv=new  StudentDataView();
    MainView mv=null;
    public void viewStudentByRollNo(int rollNo)
    {
        Student studentData=(Student)studentService.findStudentByRollNo(rollNo);
          sdv.studentData(rollNo, studentData,"view");
    }
    public void viewAllStudentDetail()
    {
        sdv.studentData(studentService.findAllStudent());
    }
    public void addStudent(StudentModel studentData)
    {
      if(studentService.registerStudent(studentData))
      {
          sdv.newRegisteration();
      }
    }
    
    public void deleteStudent(int rollNo)
    {
        
        if(studentService.removeStudent(rollNo))
        {
            sdv.deletedStudedent(rollNo,true);
        }
        else
        {
            sdv.deletedStudedent(rollNo,false);
        }
            
    }
    public void updateStudent(int rollNo)
    {
       Student studentData=(Student)studentService.findStudentByRollNo(rollNo);
       sdv.studentData(rollNo, studentData,"update");
    }
    public void updateStudent(int rollNo,Student student)
    {
        if(studentService.updateStudent(rollNo, student))
        {
            System.out.println("Update SUCESSFULL");
            mv=new MainView();
            mv.updateStudent();
        }
        else
        {
            System.out.println("FAILED ! Update NOT SUCCESSFULL");
            mv=new MainView();
            mv.updateStudent();
        }
                
    }
    
}
