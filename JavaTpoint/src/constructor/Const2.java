package constructor;

//Explanation:In the above class,you are not creating any constructor so compiler provides you a default constructor.Here 0 and null values are provided by default constructor.

public class Const2 {
	int id;  
	String name;  
	  
	void display(){System.out.println(id+" "+name);}  
	  
	public static void main(String args[]){  
		Const2 s1=new Const2();  
		Const2 s2=new Const2();  
	s1.display();  
	s2.display();  

}
}