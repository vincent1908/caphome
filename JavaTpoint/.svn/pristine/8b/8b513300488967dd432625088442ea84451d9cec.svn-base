package assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AssignmentA {
	
	 float result ;
	public static float x,y;
	public static char z;

	public void Calculation(float a, float b, char x)
	{
		switch (x)
		{
		
		case '+':
			result=a+b;
			System.out.println("Result of addition : "+result);
			break;
		case '-':
			result=a-b;
			System.out.println("Result of subtraction : "+result);
			break;
		case '*':result=a*b;
		System.out.println("Result of multiplication : "+result);
			break;
		case '%':result=a%b;
		System.out.println("Result of Modulos : "+result);
			break;
		
		}
		System.out.println("Answer is :"+result);
}
	public void input(){
		
		 try{ 
			 @SuppressWarnings("resource")
				Scanner scan=new Scanner(System.in);  
			 System.out.println("Enter any two no. and any arithmatic operations like (+,-,/,*)");
			 		x=scan.nextFloat();  
		  		 	y=scan.nextFloat();
		 			z=scan.next().charAt(0);
		
		 	}
		 catch (InputMismatchException e) {
			   System.out.println("Please enter only number");
			   input();	   
		 	}
}

	
	public static void main(String[] args) {
	AssignmentA obj=new AssignmentA();
	obj.input();
	obj.Calculation(x, y, z); 
	
	}
}
	


			   
			   
		   
		
		
		
		
		
		

	

