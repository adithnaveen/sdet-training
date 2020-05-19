package com.sdet.day5;

public class FigureClient {
	public static void main(String[] args) {
		FigureBusinessLogic fbl = new FigureBusinessLogic(); 
		
		Figure figures[]  = new Figure[5];
		
		figures[0] = new Rectangle(34, 44); 
		figures[1] = new Circle(5);
		figures[2] = new Rectangle(34, 44); 
		figures[3] = new Square(44) ;
		figures[4] = new Rectangle(34, 44); 
		
		for(int i=0; i<figures.length; i++){
			fbl.showFigure(figures[i]);
		}
		
		
		
	}
}
