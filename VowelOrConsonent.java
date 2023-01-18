package ZohoSchool;

import java.util.Scanner;

public class VowelOrConsonent {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Character : ");
		char input = scan.next().charAt(0);
		if(input == 'a' || input == 'A' || input == 'e' || input == 'E' || input == 'i' || input == 'I' || input =='o' || input == 'O' || input == 'u' || input == 'U') {
			
			System.out.println(input + " is Vowel");
		}
		else {
			
			System.out.println(input + " is Consonent");
		}
		scan.close();
	}
}
