package com.java.programming.knowledge;

public class InterfaceClass {
	
	// class class         - extends
	// interface class     - implements
	// interface interface - extends

	public static void main(String[] args) {

		//Bank2 ba = new Bank2(); /// cannot instantiate as it is abstract class
		
		Bank2 aba = new Bank3();
		
		System.out.println(aba.getInterest());
		
		
	}

}
