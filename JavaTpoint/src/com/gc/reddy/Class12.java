package com.gc.reddy;

public class Class12 {

	
	
	public static void main(String[] args) {

		int a = 100, b = 200, c = 300, d = 400;
		
		if ((a>b) && (a>c) && (a>d)){
			System.out.println("A is bigger");
		}
		
		else if ((b>a) && (b>c) && (b>d)){
			System.out.println("B is bigger");
		}
		else if ((c>a) && (c>b) && (c>d)){
			System.out.println("C is bigger");
		}
		else{
			System.out.println("D is bigger");
		}
		
	}

}
