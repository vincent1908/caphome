package com.java.programming.knowledge;

public class TrycatchEample {

	public static void main(String[] args) {
		int b[] = new int[2];
		
		try{
			
			//int a = 100/0;
			System.out.println(b[3]);
			
		}
		
		catch (ArithmeticException e){
			
			System.out.println(e);
			
		}		
		
catch (Exception e){
			
			System.out.println(e);
			
		}
		System.out.println("--------------");

		}

	}


