package com.java.programming.knowledge;

public class StaticStudent {
	
	int id;
	String name;
	static int NoOfStudent = 0;
	
	// constructor
	
	StaticStudent(){
		NoOfStudent++;
	}
	
	public static int NoOfStudent(){
		return NoOfStudent;
		
	}
/*
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
*/
}
