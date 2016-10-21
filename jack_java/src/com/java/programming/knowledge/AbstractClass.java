package com.java.programming.knowledge;

public class AbstractClass {

	public static void main(String[] args) {
		
		Bank b = new Bank();
		
		System.out.println(b.getInterest());
		
		//Bank1 b1 = new Bank1(); // cannot create create instance for abstract class
		
		Bank1 b2 = new Bank_Abc1(); // it can reference to subclass
		
	System.out.println(	b2.getInterest());
		
		
	}

}
