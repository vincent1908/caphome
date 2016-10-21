package com.gc.reddy;

public class Class13 {

	public static void main(String[] args) {

		for (int i = 1; i<=10; i++){
			System.out.println(i);
		}
		
		System.out.println("----------------------------");
		
		for (int j = 10; j>=1 ; j--){
			System.out.println(j);
		}
		
		System.out.println("-----------------------------");
		
		for(int k=1; k<=10; k++){
		if(!((k==4) || (k==7))){
		System.out.println(k);
		}
		}
		
		int l = 1;
		while(l<=10){
			System.out.println(l);
			l++;
		}
		
		System.out.println("---------------------------");
		
		
		int m = 10;
		while(m>=1){
			if (!(m==6)){
				System.out.println(m);
			} m--;
		}
		
		System.out.println("--------------------");
	
		int n = 20;
		
		do{
			System.out.println(n);
			n++;
		}
		while (n<=10);
	}
	

}
