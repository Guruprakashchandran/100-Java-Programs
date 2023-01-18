package ZohoSchool;

import java.util.Scanner;

public class SmallLetterToCapitalLetter {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		char c = scan.next().charAt(0);
		if(c >= 97 && c <= 122) {
			
			System.out.println("Capital Letter : "+(char)(c-32));
		}
		else {
			
			System.out.println("Enter Small Letter");
		}
		scan.close();
	}
}
