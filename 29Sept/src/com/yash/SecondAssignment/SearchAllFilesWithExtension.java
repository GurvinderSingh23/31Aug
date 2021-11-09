package com.yash.SecondAssignment;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Scanner;

public class SearchAllFilesWithExtension extends SimpleFileVisitor<Path>{
	String extension=null;
	int count=0;
	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
		if(file.getFileName().toString().endsWith(extension))
		{
			System.out.println(file.getFileName());
		
		}
		
		return FileVisitResult.CONTINUE;
	}
	
	public static void main(String[] args) throws IOException {
		SearchAllFilesWithExtension saf=new SearchAllFilesWithExtension();
		try(Scanner sc=new Scanner(System.in))
		{
			System.out.println("Enter File Extension : ");
			saf.extension=sc.next();
			
		}
		Path path=Paths.get("D:\\assignments");
		Files.walkFileTree(path, saf);
		
		
	}

}

