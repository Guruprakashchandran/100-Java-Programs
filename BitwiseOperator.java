package ZohoSchool;

import java.util.Scanner;

public class BitwiseOperator {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter 1 Number : ");
		int num1 = scan.nextInt();
		System.out.print("Enter 2 Number : ");
		int num2 = scan.nextInt();
		
		//Bitwise And Operation
		System.out.println("Bitwise And : "+ (num1 & num2));  
		//Bitwise Or Operation
		System.out.println("Bitwise Or : "+ (num1 | num2));
		//Bitwise Ex-Or Operation
		System.out.println("Bitwise Ex-Or : "+ (num1 ^ num2));
		//Bitwise Compliment Operation
		System.out.println("Bitwise Compliment : "+ (~num1));
		scan.close();
	}
}
