package constructor;

// In this example, we are going to copy the values of one object into another using java constructor.


class Const5 {
	    int id;  
	    String name;  
	    Const5(int i,String n){  
	    id = i;  
	    name = n;  
	    }  
	      
	    Const5(Const5 s){  
	    id = s.id;  
	    name =s.name;  
	    }  
	    void display(){System.out.println(id+" "+name);}  
	   
	    public static void main(String args[]){  
	    	Const5 s1 = new Const5(111,"Karan");  
	    	Const5 s2 = new Const5(s1);  
	    s1.display();  
	    s2.display();  
	   }  
	}  
	

