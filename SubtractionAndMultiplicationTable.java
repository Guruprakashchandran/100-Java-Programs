package ZohoSchool;

import java.util.Scanner;

public class SubtractionAndMultiplicationTable {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Input : ");
		int input = scan.nextInt();
		System.out.println("Multiplication Table");
		for(int i = 1;i<=input;++i) {
			
			System.out.println(i+" * "+input+" = "+(input*i));
		}
		System.out.println("Subtraction Table");
		for(int i = 1;i<=input;++i) {
			
			System.out.println(input+" - "+i+" = "+(input-i));
		}
		scan.close();
	}
}
