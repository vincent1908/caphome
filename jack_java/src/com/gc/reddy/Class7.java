package com.gc.reddy;

public class Class7 extends Class6{
	
	public  void display2(){
		
		System.out.println("statement2");
	}
	
	public  void display3(){
		System.out.println("statement3");	
		
	}

	public static void main(String[] args) {

		Class7 obj7 = new Class7();
		
		obj7.display();
		obj7.display1();
		obj7.display2();
		obj7.display3();
			
	}

}
