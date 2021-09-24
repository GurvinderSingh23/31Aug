
package com.yash.ui;

import com.yash.dao.StudentDAO;
import com.yash.dao.StudentDAOImpl;
import com.yash.view.MainView;

public class MainStart {
    public static void main(String[] args) {
        StudentDAOImpl stdDao=new StudentDAOImpl();
        stdDao.studentsData();
        MainView mv=new MainView();
        mv.mainMenu();
    }
    
}
