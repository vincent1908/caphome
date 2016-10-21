package com.gc.reddy;

public class Class9 implements Class8 {

	public void engine() {

		System.out.println("engine works fine");
	}

	@Override
	public void handle() {
		System.out.println("handle works fine");
	}

	@Override
	public void belt() {
		System.out.println("belt works fine");
	}

	@Override
	public void gear() {
		System.out.println("gear works fine");
	}

	public static void main(String[] args) {
		Class9 obj9 = new Class9();
		obj9.belt();
		obj9.engine();
		obj9.gear();
		obj9.handle();
	}

}
