package com.yash.repository;

import java.util.HashMap;
import java.util.Map;

public class Users {
	
	public static Map<String,String> userData=new HashMap<>();
	
	public boolean addUsers(String username,String password)
	{	
		
		if(userData.containsKey(username))
		{
			return false;
		}
		else
		{
			userData.put(username, password);
			return true;
		}
	}
	public boolean user(String username,String password)
	{
		if(userData.containsKey(username))
		{
			String password2=userData.get(username);
			if(password2.equals(password))
			{
				return true;
			}
			else
			{
				System.err.println("Invalid Password..");
				return false;
			}
		}
		else
			System.err.println("User Not Found..");
			return false;
	}
	
}
