package com.sdet.day10;

import java.io.File;
import java.io.IOException;

public class FileEx01 {
	public static void main(String[] args) {
		// this object will not create the file 
		// this will only hold the reference of the file 
		
		File file = new File("Sample.txt"); 
		
		if(file.exists()){
			System.out.println("File already Exits, so we are deleting ");
			file.delete(); 
			
		}else {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Absolute Path " + file.getAbsolutePath());
		System.out.println("Is file executable " + file.canExecute());
		System.out.println("Is File Readable " + file.canRead());
		System.out.println("Is File Writable " + file.canWrite());
		
		System.out.println("File Created... ");
		
		
	}
}
