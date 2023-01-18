package ZohoSchool;

import java.util.Scanner;

public class CapitalLettersToSmallLetters {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		char c = scan.next().charAt(0);
		if(c >= 65 && c <= 90) {
			
			System.out.println("Small Letter : "+(char)(c+32));
		}
		else {
			
			System.out.println("Enter Capital Letter");
		}
		scan.close();
	}
}
