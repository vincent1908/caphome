package demo;

import java.util.Arrays;

public class AddTwoIntArr {

	public static void main(String[] args) { 
		int[] number1 = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,2,3,4,5,6,7,8,9};
	    int[] number2 = {0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};

	    int carry = 0, sum = 0;

	    int[] result = new int[number1.length];
	    for (int i = number1.length - 1; i >= 0 ; i--) {
	        sum = number1[i] + number2[i] + carry;
	        result[i] = sum%10;
	        carry = sum/10;
	    }
	    // [0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 3, 4, 5, 6, 7, 9, 0, 0]                                                                   
	    System.out.println(Arrays.toString(result)); 
	    
	    int[] numbera = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,2,3,4,5,6,7,8,9};
        int[] numberb = {0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        int[] result1 = new int[numbera.length+1];
        int carry1 = 0;
        for (int j = numbera.length - 1; j >= 0; j--) {
            result1[j+1] = numbera[j] + numberb[j] + carry1;
            if (result1[j+1] > 9) {
                carry1 = result1[j+1] - 9;
                result1[j+1] -= 10;
            }
            else {
                carry1 = 0;
            }
        }
        System.out.println(Arrays.toString(result1));
	}

}
