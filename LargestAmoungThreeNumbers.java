package ZohoSchool;

import java.util.Scanner;

public class LargestAmoungThreeNumbers {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number 1 : ");
		int num1 = scan.nextInt();
		System.out.print("Enter Number 2 : ");
		int num2 = scan.nextInt();
		System.out.print("Enter Number 3 : ");
		int num3 = scan.nextInt();
		System.out.println((boolean)(num1>num2)?((boolean)(num1>num3)?num1:num3):((boolean)(num2>num3)?num2:num3) + " is Biggest Amoung Three Numbers");
		scan.close();
	}
}
