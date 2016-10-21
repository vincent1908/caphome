package com.java.programming.knowledge;

public class ArrayExample {

	public static void main(String[] args) {

		int my_array[] = {10,45,25,56,98};
		
		System.out.println(my_array[3]);
		
		System.out.println("-----------------");
		
		int index = 0;
		
		while(index<=4){
			System.out.println(my_array[index]);
			index++;
		}
		
		System.out.println("___________-------------------------");

		for (int x : my_array)
		System.out.println(x);
	}

}
