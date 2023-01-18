package ZohoSchool;

import java.util.Scanner;

public class PalindromeOrNot {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		StringBuilder buld = new StringBuilder(s);
		if(buld.equals(buld.reverse())) {
			
			System.out.println("Its Palindrome");
		}
		else {
			
			System.out.println("Not a Palindrome");
		}
		scan.close();
	}
}
