package com.sdet.day10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SroreGetObject {

	// we will write the business logic to store it into 
	// .ser file 
	public static void storeProduct(Products product){
		
		try {
			File file = new File("Product.ser"); 
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
			
			oos.writeObject(product);
			oos.writeInt(101);
			oos.writeObject("Hello");
			
			// data persisting will happen here 
			oos.close(); 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 

		System.out.println("Objecdt Stored");
	}
	
	
	public static  Products getProduct(){
		try {
			File file = new File("Product.ser"); 
			ObjectInputStream ois = new ObjectInputStream(new 
					FileInputStream(file));
	
			String str = (String) ois.readObject(); 
			Products product = (Products) ois.readObject(); 
			int myInt = ois.readInt(); 
			
			System.out.println("Product Details " +product);
			System.out.println("Int Value " + myInt);
			System.out.println("String value : " + str);
			
			return product; 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		return null;
	}
	
	public static void main(String[] args) {
		
		Products product = new Products(101, "Monitor", 2000);
//		storeProduct(product);
		getProduct(); 
	}
}
