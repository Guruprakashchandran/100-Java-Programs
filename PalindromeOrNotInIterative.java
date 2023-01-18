package ZohoSchool;

import java.util.Scanner;

public class PalindromeOrNotInIterative {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		int start = 0,end = s.length()-1;
		boolean bool = false;
		while(start < end) {
			
			if(s.charAt(start) != s.charAt(end)) {
				
				System.out.println("Not a Palindrome");
				bool = true;
				break;
			}
			start++;
			end--;
		}
		if(bool == false) {
			
			System.out.println("Palindrome");
		}
		scan.close();
	}
}
