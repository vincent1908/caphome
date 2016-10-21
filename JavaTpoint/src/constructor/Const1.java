package constructor;

//In this example, we are creating the no-arg constructor in the Bike class. It will be invoked at the time of object creation.

class Const1 {
	Const1() {
		System.out.println("Bike is created");
	}

	public static void main(String args[]) {
		Const1 b = new Const1();
	}
}
