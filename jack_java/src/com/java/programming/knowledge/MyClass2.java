package com.java.programming.knowledge;

public class MyClass2 {

	public static void main(String[] args) {

		StudentClass s1 = new StudentClass();
		
		s1.setId(1);
		s1.setName("mark");
		s1.setAge(15);
		
		System.out.println(s1.getId()+ "..." +s1.getName()+ "..." +s1.getAge());
		
		StudentClass s2 = new StudentClass();
		
		s2.setId(2);
		s2.setName("tom");
		s2.setAge(16);
		
		System.out.println(s2.getId()+ "..." +s2.getName()+ "...." +s2.getAge());
		
	}

}
