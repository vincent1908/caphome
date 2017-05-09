package training;

public class StirngExample {

	public static void main(String[] args) {

		String a = "a b c";
		String b = "b";
		String c = "C";
		Object d = "d";
		System.out.println(a.compareTo(b));
		System.out.println(a.compareToIgnoreCase(c));
		System.out.println(a.compareTo(d.toString()));

		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(d.toString()));
		
		System.out.println(a==b);
		
	//	StringBuffer e = new StringBuffer(a).reverse(); 
	//	System.out.println(e.reverse());
		
		//char [] z = a.toCharArray();
	//for (int i=z.length-1;i>=0;i--)
	
	//	System.out.println(z[i]);
	
	String y [] = a.split("\\s");
	for (String string : y) {
		System.out.println(string);
	}
	
	   String s1 = "t u t o r i a l s"; 
	      String[] words = s1.split("\\s"); 
	      for(String w:words) {
	         System.out.println(w);  
	      }  
	}

}
