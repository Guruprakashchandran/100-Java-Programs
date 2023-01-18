package ZohoSchool;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number1 : ");
		int num1 = scan.nextInt();
		System.out.print("Enter the Number2 : ");
		int num2 = scan.nextInt();
		int temp = num2;
		num2 = num1;
		num1 = temp;
		System.out.println("Swapping Two Numbers ");
		System.out.println("Number 1:"+num1);
		System.out.println("Number 2:"+num2);
		scan.close();
	}
}
