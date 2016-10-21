package training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DayOne {

	public static void main(String[] args) {

		int my_array[] = { 1, 2, 35, 3, 3, 346, 6, 6, };


		Arrays.sort(my_array);
		

		for (int i = 0; i < my_array.length; i++){

			System.out.println(my_array[i]);
		}

		int value = Arrays.binarySearch(my_array, 3);
		
		
		System.out.println(value);
		
		Integer[] values = { 1, 3, 7 }; 
		
		List<Integer> list = Arrays.asList(values); 
		
		//ArrayList<list> al = new ArrayList<list>(Arrays.asList(values));
		
		///////////////////////////////////////////////////////////////////////
		
		
		List<String> myList = new ArrayList<String>();
		myList.add("100");
		myList.add("200");
		myList.add("300");
		Integer[] myArray = new Integer[myList.size()];
		for (int i = 0; i < myList.size(); i++) {
		   myArray[i] = Integer.valueOf(myList.get(i));
		}
		for (Integer myInt : myArray) {
		   System.out.println(myInt);
		   
		}
		
		
		
		////////////////////////////////////////////////////////
		
		String my_array3[] = {"tomn","dgb","sdf"};
		
		for (int i=0;i<my_array3.length;i++){
			for (int j=i+1;j<my_array3.length;j++){
				if(my_array3[i].compareTo(my_array3[i])<0){
					String temp = my_array3[i];
					my_array3[i] = my_array3[j];
					my_array3[j] = temp;
					//System.out.println(my_array[i]);
				}
				System.out.println(my_array3[i]);

			}					//System.out.println(my_array3[j]);

		}
		
		String abc [] = {"google","apple","windows"};
		
		
		Arrays.sort(abc);
		
		for(String a:abc)
		System.out.println(a);
		

		Arrays.sort(abc, Collections.reverseOrder());
		
		for(String a:abc)
		System.out.println(a);
		
		/////////////////////////////////////////////////
		
		
		

		 ArrayList arrayList = new ArrayList();
	     arrayList.add(1);
	     arrayList.add(45);
	     arrayList.add(63);
	     arrayList.add(2);
	     arrayList.add(34);
	     System.out.println("Before Reverse Order: " + arrayList);
	     Collections.reverse(arrayList);
	     System.out.println("After Reverse Order: " + arrayList);

		
	     
	     /////////////////////////////////////////////////////  
	     
	     int ary1[] = {1,2,3,4,5,6};
	     int ary2[] = {1,2,3,4,5,6};
	     int ary3[] = {1,2,3,4,5};
	     
	     System.out.println("arrays is equal" +ary1.equals(ary2));
	     System.out.println("arraysis not equal "+ary1.equals(ary3));
	    ///////////////////////////////////////////////////////////
	     
	     
	     // converting integer array to arraylist
	     
	     int[] arr = {5,2,1,3,19,100};
			
			List<Integer> al = new ArrayList<Integer>();
			for(int i=0;i<arr.length;i++){
				al.add(arr[i]);
			}
			Collections.sort(al);
			System.out.println(al);
			Collections.reverse(al);
			System.out.println(al);
			
			//////////////////////////////  
			
			//minimum and maximum value aof array
			
			
			Integer mm[] = {1,2,3,4,5,6,7,8,9};
			
		int min = 	Collections.min(Arrays.asList(mm));
		
		System.out.println(min);
		
		int max = Collections.max(Arrays.asList(mm));
		
		System.out.println(max);
		
		
	}
	
}
