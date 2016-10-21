package assignment;

public class BubbleSort {


	
	public static void main(String[] args) {

		String abc [] = {"Nw", "is", "their", "te", "her"};

		for (int i=0;i<abc.length;i++){
			for (int j=i+1;j<abc.length;j++){
				if(abc[j].compareTo(abc[i])<0){
					String t = abc[i];
					abc[i] = abc[j];
					abc[j] = t;
				}
			}
			System.out.println(abc[i]);

		}
		
		
	}

}
