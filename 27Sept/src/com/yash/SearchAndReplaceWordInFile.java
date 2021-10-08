package com.yash;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class SearchAndReplaceWordInFile {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
	List<String> fileDataList=new ArrayList<>();
	List<String> updateDataList=new ArrayList<>();
	String path=null;
	String search=null;
	String replace=null;
	try(Scanner sc=new Scanner(System.in))
	{
		System.out.println("Enter Path of file : ");
		path=sc.next();
		System.out.println("Word Search : ");
		search=sc.next();
		System.out.println("Replace : ");
		replace=sc.next();
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
		
		for(String lineData:fileDataList)
		{
			System.out.println(lineData);
			String replaceData=lineData.replaceAll(search, replace);
			updateDataList.add(replaceData);
		}
		try(BufferedWriter bw=new BufferedWriter(new FileWriter(path));
		)
		{
		for(String updateDate:updateDataList)
		{
			bw.write(updateDate);
			bw.newLine();
		}
		}
	}
	
	}
}
