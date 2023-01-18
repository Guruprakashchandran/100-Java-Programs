package ZohoSchool;

import java.util.Scanner;

public class SumOfDigitInFactorial {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Input : ");
		int input = scan.nextInt();
		int factValue = 1;
		for(int i = 1;i<=input;++i) {
			
			factValue *=i;
		}
		System.out.println("Factorial Number : "+factValue);
		input = 0;
		while(factValue!=0) {
			
			input += (factValue%10);
			factValue /= 10;
		}
		System.out.println("Sum Of Digit the Factorial Number : "+input);
		scan.close();
	}
}
