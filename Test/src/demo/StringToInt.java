package demo;

public class StringToInt {

	public static void main(String[] args) {
//String[]a = null;
//		for (int i=1;i<=a.length;i++){
//		
//		a = new String[] {"1","2","3"};
//		System.out.println(a);
		
//		}
		
		
		String a ="1";
		int b = Integer.parseInt(a);
		System.out.println(b);
	
		String arr = "[1,2,a1,11,1a]";
		String[] items = arr.replaceAll("\\[", "").replaceAll("\\]", "").replaceAll("\\s", "").split(",");

		int[] results = new int[items.length];

		for (int i = 0; i < items.length; i++) {
		    try {
		        results[i] = Integer.parseInt(items[i]);
		        System.out.println(results[i]);
		    } catch (NumberFormatException nfe) {
		        //NOTE: write something here if you need to recover from formatting errors
		    };
		}
		
		
	}

}
