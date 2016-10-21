package com.java.programming.knowledge;

public class ConstructorClass {

	public static void main(String[] args) {
		
		ConstructorMethod c1 = new ConstructorMethod();
		
		
		ConstructorMethod c2 = new ConstructorMethod(20,30,40);
		
		ConstructorMethod c3 = new ConstructorMethod(10,20,40);


		System.out.println("cube volume is " +c1.cubeVolume());
		System.out.println("cube volume is " +c2.cubeVolume());
		System.out.println("cube volume is " +c3.cubeVolume());



		
		

	}

}
