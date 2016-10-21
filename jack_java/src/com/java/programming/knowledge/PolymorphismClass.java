package com.java.programming.knowledge;

public class PolymorphismClass {

	public static void main(String[] args) {

		Bank abc = new Bank_Abc();
		System.out.println(abc.getInterest());
		
		Bank xyz = new Bank_Xyz();
		System.out.println(xyz.getInterest());
		
		
	}

}
