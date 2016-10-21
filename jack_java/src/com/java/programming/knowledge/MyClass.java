package com.java.programming.knowledge;

public class MyClass {

	public static void main(String[] args) {

		StudentClass s1 = new StudentClass();
		
		s1.id = 1;
		s1.name = "mark";
		s1.age = 15;
		
		System.out.println(s1.id+ "..." +s1.name+ "..." +s1.age);
		
		StudentClass s2 = new StudentClass();
		
		s2.id = 2;
		s2.name = "tom";
		s2.age = 16;
		
		System.out.println(s2.id+ "..." +s2.name+ "...." +s2.age);
		
	}

}
