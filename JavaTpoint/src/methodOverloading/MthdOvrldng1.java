package methodOverloading;

public class MthdOvrldng1 {
	
	//If a class have multiple methods by same name but different parameters/data type, it is known as Method Overloading.

	void sum(int a, int b) {
		System.out.println(a + b);
	}

	// Method Overloading by changing the no. of arguments

	void sum(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	// Method Overloading by changing data type of argument

	void sum(double a, double b) {
		System.out.println(a + b);
	}

	public static void main(String[] args) {

		MthdOvrldng1 c1 = new MthdOvrldng1();
		c1.sum(10, 20);
		c1.sum(10, 20, 30);
		c1.sum(10.5, 10.3);
	}

}
