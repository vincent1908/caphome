package lnt;

public class Arrays {

	public static void main(String[] args) {
		
		
		// One Dimensional Array - type 1
		
		@SuppressWarnings("unused")
		int i;
		
		int x [] = new int [12];
		
		x[0] = 31;
		x[1] = 28;
		x[2] = 31;
		x[3] = 30;
		x[4] = 31;
		x[5] = 30;
		x[6] = 31;
		x[7] = 31;
		x[8] = 30;
		x[9] = 31;
		x[10] = 30;
		x[11] = 31;
		
		//for (i=0;i<12;i++) 
		System.out.println("April has : " + x[3]+ " days");
		
		
		// One Dimensional Array - type 2
		
		
		int y [] =  {31,28,31,30,31,30,31,31,30,31,30,31};
		
		System.out.println("July has " +y[6]+ " days");
		
		// calculate average of array variables
		
		double nums[] = {10.1,11.2,13.3,14.4,15.5};
		double result = 0;
		int q;
		for (q=0;q<5;q++) 
		result = result + nums[q];	
		System.out.println("avearge of arrays is : " +result/5);
		
		
		// multi dimensional array
		
		int twoD [][] = new int [4][5];
		
		int b,n,m=0;
		
		for (b=0;b<4;b++)
			for (n=0;n<5;n++){
				twoD [b][n] = m;
				m++;
			
		}
		
		for (b=0;b<4;b++){
			for (n=0;n<5;n++)
				System.out.print(twoD [b][n]+ "  ");
				System.out.println();
			
		}
		
		
		
		// manually allocate differing size second dimension
		
		int twoDD [][] = new int [4][];
		twoDD [0] = new int [1];
		twoDD [1] = new int [2];
		twoDD [2] = new int [3];
		twoDD [3] = new int [4];
		
		int w,e,r=0;
		
		for (w=0;w<4;w++)
		for (e=0;e<w+1;e++){
			twoDD [w][e] = r;
			r++;
		}

		for (w=0;w<4;w++){
			for (e=0;e<w+1;e++)
				System.out.print(twoDD[w][e] +  "   ");
				System.out.println();
			}	

		
		// initialize two dimensional array - matrix
		
		double z [][] = { {0*0, 1*0, 2*0, 3*0},
				{0*1, 1*1, 2*1, 3*1},
				{0*2, 1*2, 2*2, 3*2},
				{0*3, 1*3, 2*3, 3*3}
		};
		
		int t,u;
		
		for (t=0;t<4;t++){
			for (u=0;u<4;u++)
		System.out.print(z [t][u] + "  ");
		System.out.println();
 
		}
		
		// three dimensional array
		
		
		int threeD [][][] = new int [3][4][5];
		
		int a,s,d;
		
		for (a=0;a<3;a++)
			for (s=0;s<4;s++)
				for (d=0;d<5;d++)
					threeD [a][s][d] = a*s*d;
		
		for (a=0;a<3;a++){
			for (s=0;s<4;s++){
				for (d=0;d<5;d++)
				System.out.print(threeD [a][s][d] + "  ");	
				System.out.println();
			}
		// string
		
				String str = "This is string";
				System.out.println(str);
				
	


}
	
}
	
}
