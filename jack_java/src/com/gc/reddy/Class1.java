package com.gc.reddy;

public class Class1 {
	
	int a1 = 10;
	
	int b1 = 20;
	
	public void add1(){
		System.out.println(a1+b1);
	}


	public void add1a(){
		System.out.println("method 1 from class1");
	}
	public static void main(String[] args) {
		
		Class1 obj1 = new Class1();
		
		obj1.add1();

	}

}
