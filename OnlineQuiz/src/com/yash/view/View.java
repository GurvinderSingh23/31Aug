package com.yash.view;


import java.util.Scanner;

import com.yash.controller.QuestionController;
import com.yash.controller.UserController;


public class View {
	
	
	private UserController uc=new UserController();
	private QuestionController qc=new QuestionController();
	 
	public void mainView()
	{
		try(Scanner scanner=new Scanner(System.in))
		{
		int option=0;
		System.out.println("==========Online Quiz=========");
		System.out.println("=>1. Login");
		System.out.println("=>2. New Registration ");
		System.out.println("=>3. Exit");
		System.out.println("Enter your option : ");
		if(scanner.hasNextInt())
		{
		option=scanner.nextInt();
		
		switch(option)
		{
		case 1: 
			login();
		case 2:
			addUser();
			
		case 3:
			System.out.println("==========Thank-You=========");
			System.exit(0);
			
		default:
			System.err.println("Please Enter Correct option");
			mainView();
		
		}
		}
		else {
			System.err.println("ERROR! Please Enter correct input.");
			mainView();
		}
	}
	}
	public void addUser()
	{
		try(Scanner scanner=new Scanner(System.in))
		{
		System.out.println("=>Enter username : ");
		
		String username=scanner.next();
		System.out.println("=>Enter password : ");
		String password=scanner.next();
		
		if(uc.addUsers(username, password))
			System.out.println("User Registeration Successfull");
		else
			System.err.println("User found ");
		mainView();
	}
	}
	public void login()
	{
		try(Scanner scanner=new Scanner(System.in))
		{
		System.out.println("=>Enter username : ");
		String username=scanner.next();
		System.out.println("=>Enter password : ");
		String password=scanner.next();
		if(uc.userLogin(username, password))
			examStart();
		else
			mainView();
	}
	}
	
	public void examStart()
	{
		int option=0;
		try(Scanner scanner=new Scanner(System.in))
		{
		System.out.println("=>1. Java Collection ");
		System.out.println("=>2. Java MultiThreading ");
		System.out.println("=>3. Back to Main Menu ");
		System.out.println("=>4. Exit");
		if(scanner.hasNextInt())
		{
		option=scanner.nextInt();
		}
		else
		{
			System.err.println("ERROR! Please Enter correct input.");
			mainView();
		}
		switch(option)
		{
		case 1: 
			qc.collectionJavaExamStart();
			
		case 2:
			qc.multithreadingJavaExamStart();
			
		case 3:
			mainView();
			
		case 4:
			System.out.println("==========Thank-You=========");
			System.exit(0);
		 
		default:
			System.out.println("Please Enter Correct option");
			examStart();
		
		}
		}
	}
	
	
	
	
	
}
