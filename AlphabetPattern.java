package ZohoSchool;

import java.util.Scanner;

public class AlphabetPattern {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter The Character : ");
		char input = scan.next().charAt(0);
		System.out.println("output : ");
		for(int i = (int)input;i>=65;--i) {
			
			for(int j = 0;j < (i - 64);++j) {
				
				System.out.print((char)i);
			}
			System.out.println();
		}
		scan.close();
	}
}
