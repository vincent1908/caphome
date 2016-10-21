package objectClass;

public class ObjCls1 {

	// Example of Object and class that maintains the records of students

	int id;
	String name;
	int id1;
	String name1;

	void insertRecord(int i, String n) {
		id = i;
		name = n;
	}

	void insertRecord1(int i1, String n1) {
		id1 = i1;
		name1 = n1;
	}

	public void displayInformation() {
		System.out.println(id + "student detail" + name);
	}

	void displayInformation1() {
		System.out.println(id1 + " student detail " + name1);
	}

	public static void main(String[] args) {

		ObjCls1 s1 = new ObjCls1();
		ObjCls1 s2 = new ObjCls1();

		s1.insertRecord(1, "karan");
		s2.insertRecord(2, "pravin");
		s1.insertRecord1(3, "mark");
		s1.displayInformation1();
		s1.displayInformation();
		s2.displayInformation();

		/*
		 * In this example, we are creating the two objects of ObjClsAdv class
		 * and initializing the value to these objects, by invoking the
		 * insertRecord method on it. Here, we are displaying the state (data)
		 * of the objects by invoking the displayInformation method.
		 * 
		 */
	}

}
