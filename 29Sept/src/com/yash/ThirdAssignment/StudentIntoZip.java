package com.yash.ThirdAssignment;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class StudentIntoZip {
	
	public static void main(String[] args) {

		try(
			InputStream is=new FileInputStream("D:\\File\\student.dat");
			OutputStream os=new FileOutputStream("D:\\File\\student.zip");
			ZipOutputStream zos=new ZipOutputStream(os);
		  ){
			ZipEntry zipEntry=new ZipEntry("student.dat");
			zos.putNextEntry(zipEntry);
			byte[] buffer=new byte[1024];
			int k;
			while((k=is.read(buffer))>0) {
				zos.write(buffer,0,k);
			}
			zos.closeEntry();
		}catch(IOException e) {
			System.err.println("--Error--");
		}
	}

}
