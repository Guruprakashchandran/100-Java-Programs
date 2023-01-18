package ZohoSchool;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Input : ");
		int input = scan.nextInt();
		System.out.println((boolean)(input<0)?input+" is Negative number":input +" is Positive Number");
		scan.close();
	}
}
