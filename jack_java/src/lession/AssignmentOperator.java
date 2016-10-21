package lession;

public class AssignmentOperator {

	public static void main(String[] args) {
	
	int x = 10;
	
	System.out.println(x);

	System.out.println(x++);
	
	System.out.println(++x);
	
	x += 5; // x = x+5
	
	System.out.println(x);
	
	/*
	 ++.. post increment
	 ..++ pre increment
	 --.. post decrement
	 ..-- pre decrement
	 += addition assignment
	 -+ subtraction assignment
	 *= multiplication assignment
	 /= division assignment
	 %= modulus assignment 
	 */
	
	// Logical Operator
	
	int subject1 = 40;
	int subject2 = 60;
	
	if ((subject2 <= 60) && (subject1<=60)){
		System.out.println("condition is true");
	}
	else{
		System.out.println("condition is false");
	}
		
	// && - ANd , || OR operator
	
	// Relational Operator
	
	if (x==20){
		System.out.println("x==10");
	}
	else{
		System.out.println("x!=10");
	}
	
	/*
	 == equal to
	 != not equal to
	 < lesser than
	 > greater than
	 <= lesser than or equal to
	 >= greater than or equal to
	 */

	
	}

}
