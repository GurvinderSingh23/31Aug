package com.yash;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Scanner;

public class CountFilesAndFolder extends SimpleFileVisitor<Path>{
	int files=0;
	int folders=-1;
	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
		if(attrs.isRegularFile())
		{
			files++;
		}
		
		return FileVisitResult.CONTINUE;
	}
	
	@Override
	public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
		if(attrs.isDirectory())
		{
			folders++;
		}
		
		return FileVisitResult.CONTINUE;
	}
	
	public static void main(String[] args) throws IOException {
		String dir=null;
		try(Scanner sc=new Scanner(System.in))
		{
			System.out.println("Enter Path: ");
			dir=sc.next();
			
		}
		Path path=Paths.get(dir);
		CountFilesAndFolder cff=new CountFilesAndFolder();
		Files.walkFileTree(path,cff);
		System.out.println("files "+cff.files);
		System.out.println("folders "+cff.folders);
	}

}
