package com.yash.file;

import java.util.ArrayList;

public class StringDuplicates {
	private ArrayList<String> duplicates=new ArrayList<String>(); 

	public ArrayList<String>returnDuplicates(ArrayList<String> checkDuplicates,int size)
	{
		
		for(int i=0;i<size;i++) 
		{
			String s = checkDuplicates.get(i); //---Get Element in a String to check concurrency
		    
			for(int j = 0; j<size;j++) //----second loop for iterating without current element
		    {
		    	if(j!=i)  
		    	{
		    		if(checkDuplicates.get(j)==s)
		    		{
		    			duplicates.add(s);
		    		}
		    	}
		    }
		}
		
		
		return duplicates;
	}

}
