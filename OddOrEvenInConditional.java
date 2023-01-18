package ZohoSchool;

import java.util.Scanner;

public class OddOrEvenInConditional {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter The Input : ");
		int input = scan.nextInt();
		System.out.println((boolean)(input%2 == 1)?input+" is Odd":input+" is Even");
		scan.close();
	}
}
