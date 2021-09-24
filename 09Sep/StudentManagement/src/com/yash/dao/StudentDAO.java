package com.yash.dao;

import com.yash.entity.Student;
import java.util.List;
import java.util.Map;

public interface StudentDAO {
                    List<Student> getAllStudents();
                    Student getStudentByRollNo(int rollNo);
	boolean addStudentData(Student student);
	boolean updateStudentData(int rollNo,Student student);
	boolean removeStudent(int rollNo);
        
}
