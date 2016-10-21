package keyword;
//Program of this() constructor call (constructor chaining)  

class This2 {
	int id;
	String name;

	This2() {
		System.out.println("default constructor is invoked");
	}

	This2(int id, String name) {
		this();// it is used to invoked current class constructor.
		this.id = id;
		this.name = name;
	}

	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String args[]) {
		This2 e1 = new This2(111, "karan");
		This2 e2 = new This2(222, "Aryan");
		e1.display();
		e2.display();
	}
}