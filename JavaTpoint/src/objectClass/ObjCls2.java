package objectClass;

public class ObjCls2 {

	// example that maintains the records of Rectangle class
	
	int length;
	int breadth;
	
	
	void provideInput(int l, int b){
		length = l ;
		breadth = b ;	
	}
	
	void diplayArea(){
				System.out.println("Area of rectangle : " + length*breadth);
		
	}
	
	public static void main(String[] args) {
		
		ObjCls2 s1 = new ObjCls2();
		ObjCls2 s2 = new ObjCls2();

		s1.provideInput(10, 20);
		s2.provideInput(30, 40);
		
		s1.diplayArea();
		s2.diplayArea();
		
	}

}
