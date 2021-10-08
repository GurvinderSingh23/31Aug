package com.yash;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StreamTokenizer;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class CountWordAndNumberInFile {
	public static void main(String[] args) throws IOException {
		
	
	List<String> fileDataList=new ArrayList<>();
	String path=null;
	
	try(Scanner sc=new Scanner(System.in))
	{
		System.out.println("Enter Path of file : ");
		path=sc.next();
		
	}
	catch(InputMismatchException e)
	{
		e.printStackTrace();
	}
	try(FileReader fr=new FileReader(path);
			BufferedReader br=new BufferedReader(fr);
			)
			{
			String fileData=br.readLine();
			while(fileData!=null)
			{
				fileDataList.add(fileData);
				fileData=br.readLine();
			}
			
			int token=0;
			int words=0;
			int numbers=0;
			for(String lineData:fileDataList)
			{
				Reader r=new StringReader(lineData);
		        StreamTokenizer streamTokenizer=new StreamTokenizer(r);
		        while(true)
		        {
		            token=streamTokenizer.nextToken();
		            if(token==StreamTokenizer.TT_EOF)
		               break;
		            if(token==StreamTokenizer.TT_WORD)
		                words++;
		            if(token==StreamTokenizer.TT_NUMBER)
		                numbers++;
		        }
				
			}
			System.out.println("Total count of words : "+words);
			System.out.println("Total count of numbers : "+numbers);
	}
	}
}


