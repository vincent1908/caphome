package com.java.programming.knowledge;

public class Increment {

	public static void main(String[] args) {

		int x = 10;
		
		x++;
		
		System.out.println(x);
		System.out.println(x++); // post increment - print and then increment
		System.out.println(x);
		System.out.println(++x); // pre increment - increment and then print
		System.out.println(x);
	}

}
