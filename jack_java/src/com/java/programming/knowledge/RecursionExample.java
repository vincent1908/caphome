package com.java.programming.knowledge;

// calling method within method
// N! = N * (N-1) ....*2*1
// 5! = 5*4*3*2*1

public class RecursionExample {

	public static int factorial(int N){
		
		if(N<=1)
			return 1;
		else return (N * factorial(N-1));
	}
	
	public static void main(String[] args) {

		
		System.out.println(factorial(5));
	}

}
