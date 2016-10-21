package com.java.programming.knowledge;

public class ConstructorMethod {

	int length ;
	int breadth;
	int height;
	
	
	// method
	
	public int cubeVolume(){
		return(length*breadth*height);
	}
	

	//constructor1
	ConstructorMethod(){
			System.out.println("welcome to constructor");
			length = 10;
			breadth = 20;
			height =30;
		}
	
	// Parameterized constructor
	ConstructorMethod(int l, int b, int h){
		length = l;
		breadth = b;
		height = h;
	
	}
	
	
	
	
}
	
