package keyword;

public class Static4 {
	// Program of changing the common property of all objects(static field).

	int rollno;
	String name;
	static String college = "ITS";

	static void change() {
		college = "BBDIT";
	}

	Static4(int r, String n) {
		rollno = r;
		name = n;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + college);
	}

	public static void main(String args[]) {
		Static4.change();

		Static4 s1 = new Static4(111, "Karan");
		Static4 s2 = new Static4(222, "Aryan");
		Static4 s3 = new Static4(333, "Sonoo");

		s1.display();
		s2.display();
		s3.display();
	}
}
