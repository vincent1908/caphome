package basic;

public class ArrayJava {

	public static void main(String[] args) {

		int a[][][] = new int [4][5][6];
		int k = 0;
		for(int i=0;i<4;i++)
			for(int j=0;j<5;j++)
				for(int l=0;l<6;l++)
			{

			a[i][j][l] = k;
		k++;
		}
		
		for(int i=0;i<4;i++){
			for(int j=0;j<5;j++){
				for(int l=0;l<6;l++)


			System.out.print(a[i][j][l]+ " ");
			System.out.println();
		}
		}
	}

}
