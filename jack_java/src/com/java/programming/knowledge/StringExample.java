package com.java.programming.knowledge;

public class StringExample {

	public static void main(String[] args) {

		String my_string = "Hello World";

		int my_string_length = my_string.length();

		System.out.println(my_string_length);

		String my_string_lowercase = my_string.toLowerCase();

		System.out.println(my_string_lowercase);

		int my_string_index = my_string.indexOf("W");

		System.out.println(my_string_index);

		String my_string_replace = my_string.replace("H", "t");
		System.out.println(my_string_replace);

	}

}
