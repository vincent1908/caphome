package constructor;

public class Const6 {
	    int id;  
	    String name;  
	    Const6(int i,String n){  
	    id = i;  
	    name = n;  
	    }  
	    Const6(){}  
	    void display(){System.out.println(id+" "+name);}  
	   
	    public static void main(String args[]){  
	    	Const6 s1 = new Const6(111,"Karan");  
	    	Const6 s2 = new Const6();  
	    s2.id=s1.id;  
	    s2.name=s1.name;  
	    s1.display();  
	    s2.display();  
	   }  
	} 


