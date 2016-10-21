package com.java.programming.knowledge;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter number ");

		int user_input_number = scan.nextInt();
		System.out.println("entered number is : ");
		System.out.print(user_input_number);
		System.out.println();

		

		Scanner scan1 = new Scanner(System.in);
		System.out.println("enter decimal number ");

		double user_input_decimal = scan1.nextDouble();
		System.out.println("entered decimal is : ");
		System.out.print(user_input_decimal);
		System.out.println();

		

		Scanner scan2 = new Scanner(System.in);
		System.out.println("enter text ");

		String user_input_text = scan2.nextLine();
		System.out.println("entered text is : ");
		System.out.print(user_input_text);

		
		
	}

}
