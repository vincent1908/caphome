package com.array.test;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise2 {
	
	// reverse an array list

	public static void main(String[] args) {
		
		
		ArrayList a = new ArrayList();
		
		a.add("tom");
		a.add("kim");
		a.add("zom");
		Collections.reverse(a);

		System.out.println(a);
		
		
		// write an array of strings to output console
		
		String str[] = new String [3];
		str[0] = "This is tring 1";
		str[1] = "This is tring 1";
		str[2] = "This is tring 1";
		
		
		for (int i = 0; i<str.length;i++){
			System.out.println(str[i]);
		}

		
		
		
	}

}
