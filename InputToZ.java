package ZohoSchool;

import java.util.Scanner;

public class InputToZ {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter The Character : ");
		char input = scan.next().charAt(0);
		for(int i = (int)input;i<=90;++i) {
			
			System.out.print((char)i);
		}
		scan.close();
	}
}
