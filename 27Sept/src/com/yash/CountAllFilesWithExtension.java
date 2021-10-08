package com.yash;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Scanner;

public class CountAllFilesWithExtension extends SimpleFileVisitor<Path>{
	String extension=null;
	int count=0;
	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
		if(file.getFileName().toString().endsWith(extension))
		{
			count++;
		}
		
		return FileVisitResult.CONTINUE;
	}
	
	public static void main(String[] args) throws IOException {
		CountAllFilesWithExtension caf=new CountAllFilesWithExtension();
		try(Scanner sc=new Scanner(System.in))
		{
			System.out.println("Enter File Extension : ");
			caf.extension=sc.next();
			
		}
		Path path=Paths.get("D:\\assignments");
		Files.walkFileTree(path, caf);
		System.out.println("Total Files with "+caf.extension+" "+caf.count);
		
	}

}
