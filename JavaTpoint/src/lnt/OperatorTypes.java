package lnt;


public class OperatorTypes {

	public static void main(String[] args) {


		int a = 10 , b = 5 , a1 = 10 , a2 = 10 , a3 = 10 , a4 = 10 , a5 = 10;
		

		int c = a+b;
		int d = a-b;
		int e = a*b;
		int f = a/b;
		int g = a%b;
		a1 += 4;
		a2 -= 4;
		a3 *=  4;
		a4 /=  4;
		a5 %=  4;
		int g1 = g++;
		int g2 = g1--;
		int g3 = ++g2;
		int g4 = --g3;

		System.out.println("Arithematic Operator results are:  "  +c+  "...."   +d+  "...."   +e+  "..."  +f+  "..."   +g+   "..."   +a1+  "..."    +a2+  "..."    +a3+  "..."    +a4+  "..."   +a5+  "..."   +g1+ "..."   +g2+ "..."   +g3+ "..." +g4 );

	}

}
