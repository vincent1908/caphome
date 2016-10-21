package basic;

public class Assignment1 {

	public static void main(String[] args) {

		System.out.println("********DATA TYPES*************");
		
		// Integer Types
		int a = 1;
		short b = 2;
		byte c  = 3;
		long d = 7645645;

		System.out.println("Integer Datatypes:  "+a+ "..." +b+ "...." +c+ "....." +d);

		// Float Types
		float e = 100.1000F;
		double f = 200.10;
		System.out.println("Float Datatypes:  "+e+ "..." +f);

		// Character Types
		char g = 88;
		System.out.println("Character Datatypes:  " +g);

		// Boolean Types
		boolean h = true;
		boolean i = false;
		System.out.println("Boolean dataypes:  " +h+ "...." +i);


		/*
		 byte  number 1 byte
		 short number 2 bytes
		 int  number 4 bytes
		 long number 8 bytes
		 float decimal number 4 bytes
		 double decimal number 8 bytes
		 char character 2 bytes
		 boolean true or false 1 byte 
		 */
		
		System.out.println("********OPERATORS********");
		
		// Arithmetic Operators
		
		int j = 10,k = 5;
		
		System.out.println("value of addition is :" +(j+k));
		System.out.println("value of subtraction is :" +(j-k));
		System.out.println("value of multiplication is :" +(j*k));
		System.out.println("value of division is :" +(j/k));
		System.out.println("value of modulus :" +(j%k));


		
		// Increment and Decrement operator
		
		int l = 1;
		int m = 1;
		
		int n = ++l;
		int o = m--;
		
		System.out.println("value of n is : " +n);
		System.out.println("value of o is : " +o);

		/* ++.. post increment
		 ..++ pre increment
		 --.. post decrement
		 ..-- pre decrement
		 */
		
		// Assignment Operator


		int p = 10;
		
		int q=0,r=0,s=0,t=0;
		
		q += p;
		
		r -= p;
		
		s *= p;
		
		t /=p;
		
		
		System.out.println(q);

		System.out.println(r);
		
		System.out.println(s);
		
		System.out.println(t);
		
		/*
		 += addition assignment
		 -+ subtraction assignment
		 *= multiplication assignment
		 /= division assignment
		 %= modulus assignment 
		 */
		
		
		// Logical Operator
		
		int subject1 = 40;
		int subject2 = 60;
		
		if ((subject2 < 60) && (subject1<=60))
			System.out.println("condition is true");
		else
			System.out.println("condition is false");
		
			
		// && - ANd , || OR operator
		
		// Relational Operator
		
		int u = 10;
		
		if (u==20)
			System.out.println("u==10");
		
		else
			System.out.println("u!=10");
		
		
		/*
		 == equal to
		 != not equal to
		 < lesser than
		 > greater than
		 <= lesser than or equal to
		 >= greater than or equal to
		 */
		
		
		//bitwise operator
		String binary[] = { "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111",
						"1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};
				
		int v = 3;
		int w = 6;
				
		int x = v | w;
		int y = v & w;
		int z = v ^ w;
				
				
		System.out.println("x is " + binary[x]);
		System.out.println("y is " + binary[y]);
		System.out.println("z is " + binary[z]);

		System.out.println("**************CONTROL STATEMENTS**********");
		
		// If - Else
		
		int a1 = 10 , b1 = 5;
		
		if (a1>b1)
			System.out.println(a1);
		else 
			System.out.println(b1);
	
		// For loop
		
		int c1;
		
		for (c1=0;c1<10;c1++) System.out.println(c1);
		
		// While loop
		
		int d1 = 0;
		
		while (d1<10){
			System.out.println(d1);
			d1++;
		}
		
		// Do - While loop
		
		int e1 = 0;
		
		do{
			System.out.println(e1);
			e1++;
		}while(e1<10);

		// Switch statement
		
		int score = 0;
		
		switch (score){
		
		case 90:
			System.out.println("very good");
			break;
		
		case 60:
			System.out.println("good");
			break;
		
		case 40:
			System.out.println("average");
			break;
			
		case 20:
			System.out.println("poor");
			break;
			
		default:
			System.out.println("grade not defined");
			
		}
		
		
		System.out.println("***********ARRAYS**************");
	
		
		
		// One Dimensional Array - type 1
		
	
		
		int f1 [] = new int [12];
		
		f1[0] = 31;
		f1[1] = 28;
		f1[2] = 31;
		f1[3] = 30;
		f1[4] = 31;
		f1[5] = 30;
		f1[6] = 31;
		f1[7] = 31;
		f1[8] = 30;
		f1[9] = 31;
		f1[10] = 30;
		f1[11] = 31;
		
		 
		System.out.println("April has : " + f1[3]+ " days");
		
		
		// One Dimensional Array - type 2
		
		
		int g1 [] =  {31,28,31,30,31,30,31,31,30,31,30,31};
		
		System.out.println("July has " +g1[6]+ " days");
		
		// calculate average of array variables
		
		double nums[] = {10.1,11.2,13.3,14.4,15.5};
		double result = 0;
		int h1;
		for (h1=0;h1<5;h1++) 
		//result = result + nums[h1];	
		result = result + g1[h1];
			System.out.println("avearge of arrays is : " +result/5);
		
		
		// multi dimensional array
		
		int twoD [][] = new int [5][5];
		
		int i1,j1,k1=0;
		
		for (i1=0;i1<5;i1++)
			for (j1=0;j1<5;j1++){
				twoD [i1][j1] = k1;
				k1++;
			
		}
		
		for (i1=0;i1<4;i1++){
			for (j1=0;j1<5;j1++)
				System.out.print(twoD [i1][j1]+ "  ");
				System.out.println();
			
		}
		
		
		
		// manually allocate differing size second dimension
		
		int twoDD [][] = new int [4][];
		twoDD [0] = new int [1];
		twoDD [1] = new int [2];
		twoDD [2] = new int [3];
		twoDD [3] = new int [4];
		
		int l1,m1,n1=0;
		
		for (l1=0;l1<4;l1++)
		for (m1=0;m1<l1+1;m1++){
			twoDD [l1][m1] = n1;
			n1++;
		}

		for (l1=0;l1<4;l1++){
			for (m1=0;m1<l1+1;m1++)
				System.out.print(twoDD[l1][m1] +  "   ");
				System.out.println();
			}	

		
		// initialize two dimensional array - matrix
		
		double o1 [][] = { {0*0, 1*0, 2*0, 3*0},
				{0*1, 1*1, 2*1, 3*1},
				{0*2, 1*2, 2*2, 3*2},
				{0*3, 1*3, 2*3, 3*3}
		};
		
		int p1,q1;
		
		for (p1=0;p1<4;p1++){
			for (q1=0;q1<4;q1++)
		System.out.print(o1 [p1][q1] + "  ");
		System.out.println();
 
		}
		
		// three dimensional array
		
		
		int threeD [][][] = new int [3][4][5];
		
		int r1,s1,t1;
		
		for (r1=0;r1<3;r1++)
			for (s1=0;s1<4;s1++)
				for (t1=0;t1<5;t1++)
					threeD [r1][s1][t1] = r1*s1*t1;
		
		for (r1=0;r1<3;r1++){
			for (s1=0;s1<4;s1++){
				for (t1=0;t1<5;t1++)
				System.out.print(threeD [r1][s1][t1] + "  ");	
				System.out.println();
			}
	
	
	}

}

}