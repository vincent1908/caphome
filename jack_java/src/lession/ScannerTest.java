
package lession;
import java.util.Scanner;
public class ScannerTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("enter string:  ");
	
	String x = scan.nextLine();
	
	System.out.println("entered string is:  ");
	
	System.out.println(x);
	
	}

}
