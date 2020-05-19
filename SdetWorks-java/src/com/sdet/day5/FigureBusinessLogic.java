package com.sdet.day5;

public class FigureBusinessLogic {
	public void showFigure(Figure figure){
		System.out.println("--------------------------------");
		figure.area();
		figure.draw(); 
//		
//		if(figure instanceof Rectangle){
//			((Rectangle) figure).scaledImages();
//		}
	}
}
