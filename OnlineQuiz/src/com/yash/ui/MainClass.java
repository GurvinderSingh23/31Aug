package com.yash.ui;

import com.yash.repository.Users;
import com.yash.view.View;

public class MainClass {
	
	public static void main(String[] args) {
		
		Users.userData.put("Guri", "Guri");
		Users.userData.put("Akash", "Akash");
		View v=new View();
		v.mainView();
	}
	

}
