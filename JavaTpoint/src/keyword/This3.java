package keyword;
class This3{  
    int id;  
    String name;  
    String city;  
      
    This3(int id,String name){  
    this.id = id;  
    this.name = name;  
    }  
    This3(int id,String name,String city){  
    this(id,name);//now no need to initialize id and name  
    this.city=city;  
    }  
    void display(){System.out.println(id+" "+name+" "+city);}  
      
    public static void main(String args[]){  
    	This3 e1 = new This3(111,"karan");  
    	This3 e2 = new This3(222,"Aryan","delhi");  
    e1.display();  
    e2.display();  
   }  
} 