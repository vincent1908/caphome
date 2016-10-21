package assignment;

import java.util.LinkedList;

public class AlpabeticalOrder {
	
	String s1 = "project";
	String s2 = "sunject";
	
	public static void main(String args[]){
	LinkedList<String> ll = new LinkedList<String>();
	
    //LinkedList ll = new LinkedList();
	ll.add("SAMSUNG GALAXY");
	ll.add("SONY XPERIA");
	ll.add("IPHONE");
	/*ll.add("$500.00");
	ll.add("$100.00");*/
	//$100.00
	System.out.println(ll);	
	boolean result = checkOrder(ll);
	System.out.println(result);
	
}
 static boolean checkOrder(LinkedList<String> ll){
		
	 String prev="";
	 for (final String cur:ll){
		 if(cur.compareToIgnoreCase(prev)<0){
			 return false;
		 }
		 prev=cur;
	 }
		return true;
	}
}