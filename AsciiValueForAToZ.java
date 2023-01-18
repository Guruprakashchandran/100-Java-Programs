package ZohoSchool;

import java.util.Scanner;

public class AsciiValueForAToZ {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		char c = scan.next().charAt(0);
		if((c>=65 && c<=122) || (c>=97 && c<=122)) {
			
			System.out.println("ASCII Value of this "+c+" - "+(int)c);
		}
		else {
			
			System.out.println("Its Not a Alphabet");
		}
		scan.close();
	}
}
