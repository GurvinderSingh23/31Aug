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

public class ConvertAlternateWordUpper {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		List<String> fileDataList=new ArrayList<>();
		List<String> updateDataList=new ArrayList<>();
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
				
				}
		for(String lineData:fileDataList)
		{
			StringBuffer sb=new StringBuffer();
			String[] splitString=lineData.split(" ");
			for(int i=0;i<splitString.length;i++)
			{
				if(i%2!=0)
				{
					splitString[i]=splitString[i].toUpperCase();
					
				}else
				{
					splitString[i]=splitString[i].toLowerCase();
				}
				sb.append(splitString[i]+" ");
				
			}
			updateDataList.add(sb.toString());
		}
		try(BufferedWriter bw=new BufferedWriter(new FileWriter(path)))
			{
				for(String updateDate:updateDataList)
				{
					bw.write(updateDate);
					bw.newLine();
				}
			}  
		
		
	}

}
