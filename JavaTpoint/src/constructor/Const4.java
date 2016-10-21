package constructor;

//Constructor Overloading in Java

public class Const4 {

	int id;
	String name;
	int age;

	// 1st Constructor

	Const4(int i, String n) {

id = i;
name = n;
	}

	Const4(int i, String n, int a) {
id = i;
name = n;
age = a;
}

	void displayConst() {
		System.out.println(id+ "..." +name+ "..." +age);
	}

	public static void main (String args[]){
		
		Const4 c1 = new Const4(10,"tom");
		Const4 c2 = new Const4(10,"mark",65);
		
		c1.displayConst();
		c2.displayConst();

	}
	
}
