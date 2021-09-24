package com.yash.dao;

import com.yash.entity.Student;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StudentDAOImpl implements StudentDAO{
    
   static Map<Integer,Student> studentData=new HashMap<>();
    
    public void studentsData()
    {
             Student s1=new Student(101, "Guri Singh", 'M', 12, "6959595959");
             Student s2=new Student(102, "Vidhya", 'F',10, "75000779");
             studentData.put(s1.getRollNo(), s1);
             studentData.put(s2.getRollNo(), s2);
             
    }

    @Override
    public List<Student> getAllStudents() {
        List<Student> listOfAllStudents=new ArrayList<>();
        
        for(Student allStudent : studentData.values())
        {
            
            listOfAllStudents.add(allStudent);
        }
        
        if(listOfAllStudents.isEmpty())
        {
            throw new NullPointerException("No Data Found");
            
        }
        else
            return listOfAllStudents;
        
    }
     @Override
    public Student getStudentByRollNo(int rollNo) {
        
        return null;
    }
    

    @Override
    public boolean addStudentData(Student student) {
        if(studentData.containsKey(student.getRollNo()))
        {
           return false;
        }
        else
        {
        studentData.put(student.getRollNo(), student);
        return true;
        }
        
    }

    @Override
    public boolean updateStudentData(int rollNo,Student student) {
        
        studentData.remove(rollNo);
        if(studentData.containsKey(student.getRollNo()))
        {
            return false;
        }
        else
        {
        studentData.put(student.getRollNo(), student);
        return true;
        }
        
    }

    
    @Override
    public boolean removeStudent(int rollNo) {
        if(studentData.containsKey(rollNo))
        {
       studentData.remove(rollNo);
       if(studentData.containsKey(rollNo))
       {
           return false;
       }
       else
       {
           return true;
       }
        }
        else
        {
            System.out.println("No Student Found With Roll Number "+rollNo);
        return false;    
        }
    }

   

   
    
}
