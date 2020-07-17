package com.sdet.day5;

// if you need a method which acts as a contract 
// or the rule then make that method as abstract 

// if the method is abstract in the class then 
// the class should also be made abstract

// if the class is abstract then creating an object 
// of the class is not allowed directly 

// in a abstract class it is possible to have 
// concrete method/s, and this can be access only 
// through child class/es
public abstract class Figure {
	public abstract void area();
	
	public abstract void draw();
	
}