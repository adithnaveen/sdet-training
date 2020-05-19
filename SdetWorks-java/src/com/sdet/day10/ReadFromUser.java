package com.sdet.day10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFromUser {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader
			(new InputStreamReader(System.in)); 
		
		// to write the contents in to file 
		// references are here 
		File file = null;
		FileWriter fileWriter = null;  
		BufferedWriter bw = null;

		try {
			System.out.println("Enter Employee Id ");
			int empId = Integer.parseInt(br.readLine());
			
			System.out.println("Enter Employee Name ");
			String empName = br.readLine(); 
			
			System.out.println("Enter Employee Salary ");
			double empSal = Double.parseDouble(br.readLine());
			
			System.out.println("Employee Id " + empId);
			System.out.println("Employee Name " + empName);
			System.out.println("Emp Salary " + empSal);
			
			// the instance is constructed 
			file = new File("Emp.txt");
			fileWriter  = new FileWriter(file, true); 
			bw = new BufferedWriter(fileWriter);
			
			bw.write("Employee Id: " + empId);
			bw.newLine();
			bw.write("employee Name: " + empName);
			bw.newLine();
			bw.write("Emp Salary: " + empSal);
			bw.newLine();
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		System.out.println("Data saved Successfully... ");
		
		
	}
}
