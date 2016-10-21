package methodOverloading;

public class MthdOvrldng4 {
	
	// You can have any number of main methods in a class by method overloading
	
	public static void main(int a){
		System.out.println(a);

		System.out.println("main method invoked");
	}

	public static void main(String[] args) {
		
		main(10);

	}

}
