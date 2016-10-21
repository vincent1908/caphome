package com.gc.reddy;

public class Class15 {

	public static void main(String[] args) {

		String str1 = "Selenium";
		String str2 = "selenium";
		String str3 = "Selenium";
		String str4 = "Zselenium";
		
		// 2 way comparison
		
		System.out.println(str1 == str2);
		System.out.println(str1==str3);
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareTo(str3));
		System.out.println(str4.compareTo(str1));
		
	}

}
