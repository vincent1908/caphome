package constructor;

//Example of parameterized constructor

public class Const3 {
	int id;
	String name;

	Const3(int i, String n) {
		id = i;
		name = n;
	}

	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String args[]) {
		Const3 s1 = new Const3(111, "Karan");
		Const3 s2 = new Const3(222, "Aryan");
		s1.display();
		s2.display();
	}
}