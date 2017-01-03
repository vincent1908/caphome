package demo;

import java.util.StringTokenizer;

public class StringToInt {

	public static void main(String[] args) {
//String[]a = null;
//		for (int i=1;i<=a.length;i++){
//		
//		a = new String[] {"1","2","3"};
//		System.out.println(a);
		
//		}
		
		 int i=0;
		    int n[]=new int[2];//for integer array of numbers
		    String st="[1,2]";
		    StringTokenizer stk=new StringTokenizer(st,"[,]"); //"[,]" is the delimeter
		    String s[]=new String[2];//for String array of numbers
		     while(stk.hasMoreTokens())
		     {
		        s[i]=stk.nextToken();
		        n[i]=Integer.parseInt(s[i]);//Converting into Integer
		       i++;
		     }
		  for(i=0;i<2;i++)
		  System.out.println("number["+i+"]="+n[i]);
		
		final String[] strings = {"1", "2"};
	    final int[] ints = new int[strings.length];
	    for (int j=0; j < strings.length; j++) {
	        ints[j] = Integer.parseInt(strings[j]);
	        System.out.println(ints[j]);
	    }
		
		String a ="1";
		int b = Integer.parseInt(a);
		System.out.println(b);
	
		String arr = "[1,2,a1,11,1a]";
		String[] items = arr.replaceAll("\\[", "").replaceAll("\\]", "").replaceAll("\\s", "").split(",");

		int[] results = new int[items.length];

		for (int k = 0; k < items.length; k++) {
		    try {
		        results[k] = Integer.parseInt(items[k]);
		        System.out.println(results[k]);
		    } catch (NumberFormatException nfe) {
		        //NOTE: write something here if you need to recover from formatting errors
		    };
		}
		
		
	}

}
