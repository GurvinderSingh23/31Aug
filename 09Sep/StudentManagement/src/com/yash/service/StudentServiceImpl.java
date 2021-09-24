package com.yash.service;

import com.yash.dao.StudentDAOImpl;
import com.yash.entity.Student;
import com.yash.model.StudentModel;
import java.util.List;

public class StudentServiceImpl {
    
    StudentDAOImpl stdDaoImpl=new StudentDAOImpl(); 
    public Student findStudentByRollNo(int rollNo)
    {
        Student studentData=null;
        List<Student> allStudents=stdDaoImpl.getAllStudents();
        for(Student allStudent:allStudents)
        {
            if(allStudent.getRollNo()==rollNo)
            {
                studentData=(Student)allStudent;
            }
        }
            if(studentData==null)
                throw new NullPointerException(" ERROR ! No Student found with "+rollNo+" :");
            else
                return studentData;
    }
    public List<Student> findAllStudent()
    {
        return stdDaoImpl.getAllStudents();
    }
    
    public boolean registerStudent(StudentModel studentData)
    {
        System.out.println(studentData.getRollNo());
       Student newStudent=new Student(studentData.getRollNo(), studentData.getStudentName(), studentData.getGender(), studentData.getStudentClass(), studentData.getPhoneNumber());
       if(stdDaoImpl.addStudentData(newStudent))
        {
            return true;
        }
        else
        {
            System.out.println("ERROR ! Student Registrartion Is Failed");
            return false;
        }
    }
    public boolean removeStudent(int rollNo)
    {

        return stdDaoImpl.removeStudent(rollNo);
    }
    public boolean updateStudent(int rollNo,Student student)
    {
       return stdDaoImpl.updateStudentData(rollNo, student);
    }
    
    
}
