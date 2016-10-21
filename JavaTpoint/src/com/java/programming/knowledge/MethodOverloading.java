package com.java.programming.knowledge;

public class MethodOverloading {

	public static void main(String[] args) {

		
		System.out.println("Method 1: " +add(10,10));
		System.out.println("Method 1: " +add(10.5,34.5));
		System.out.println("Method 1: " +add("abc","def"));

		
	}
	

	public static int add(int a, int b){
		return(a+b);
	}
	

	public static double add(double a, double b){
		return(a+b);
	}
	

	public static String add(String a, String b){
		return(a+b);
	}

}
