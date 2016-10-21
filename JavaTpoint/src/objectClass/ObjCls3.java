package objectClass;

public class ObjCls3 {

	// Anonymous Object

	void fact(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println(fact);

	}

	public static void main(String[] args) {

		new ObjCls3().fact(5);

	}

}
