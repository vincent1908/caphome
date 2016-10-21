package keyword;
//example of this keyword  
class This1{  
  int id;  
  String name;  
    
  This1(int id,String name){  
  this.id = id;  
  this.name = name;  
  }  
  void display(){System.out.println(id+" "+name);}  
  public static void main(String args[]){  
	  This1 s1 = new This1(111,"Karan");  
	  This1 s2 = new This1(222,"Aryan");  
  s1.display();  
  s2.display();  
}  
}