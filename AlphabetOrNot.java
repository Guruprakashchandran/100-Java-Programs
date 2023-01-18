package ZohoSchool;

import java.util.*;
public class AlphabetOrNot {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Character : ");
		char input = scan.next().charAt(0);
		System.out.println((boolean)((input>=65 && input <=90) || (input >=97 && input <= 122))?input+" is Alphabet":input+" is Not a Alphabet");
		scan.close();
	}
}
