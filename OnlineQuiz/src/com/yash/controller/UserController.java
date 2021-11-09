package com.yash.controller;

import com.yash.repository.Users;

public class UserController {
	
	
	public boolean addUsers(String username,String password)
	{	
		return new Users().addUsers(username, password);
	}
	public boolean userLogin(String username,String password)
	{
		return new Users().user(username, password);
	}
	
	
}
