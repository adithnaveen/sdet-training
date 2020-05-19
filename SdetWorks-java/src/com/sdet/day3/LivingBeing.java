package com.sdet.day3;

// if the class does not have the super then 
// the object will be the super 

// class Object{
//  public Object (){}
//}
//public class LivingBeing  extends Object{

public class LivingBeing {

	
	public LivingBeing() {
		super();
		System.out.println("Living Begin is created... ");
	}
	
	public void breathe(){
		System.out.println("All Living Beings breathe... ");
	}
	
	
}
