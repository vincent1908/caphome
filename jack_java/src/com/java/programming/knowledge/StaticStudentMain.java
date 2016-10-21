package com.java.programming.knowledge;

public class StaticStudentMain {

	public static void main(String[] args) {

		StaticStudent mark = new StaticStudent();
		
		System.out.println(mark.NoOfStudent());

		
		StaticStudent tom = new StaticStudent();
		
		
		System.out.println(tom.NoOfStudent());
		
		System.out.println(StaticStudent.NoOfStudent());

		
		
	}

}
