package com.string.java;

public class String2 {

	public static void main(String[] args) {

		// equals() method
		String abc = "viru";
		String def =  "vir";
		String ghi = "viru";
		if (abc.equals(def))
		System.out.println("pass");
		else System.out.println("fails");
		System.out.println(abc.equals(ghi));
		
		// compare by == operator (compares reference not values)
		
		String a = " yuvi";
		String b = "yuvi";
		String c = new String ("yuvi");
		String d = "zak";
		System.out.println(a==b);
		System.out.println(a==c);
		
		// compareTo() method
		// The String compareTo() method compares values lexicographically and returns an integer value that describes if first string is less than, equal to or greater than second string.

		System.out.println(a.compareTo(d));
		System.out.println(a.compareTo(b));
		System.out.println(d.compareTo(b));
		
			/*	s1 == s2 :0
				s1 > s2   :positive value
				s1 < s2   :negative value*/
		
		String s5 = "gautam" + " gambhir"; // String Concatenation using + operator
		System.out.println(s5);
		System.out.println(s5.concat(a));
	}

}
