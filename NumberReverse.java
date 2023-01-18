package ZohoSchool;

import java.util.Scanner;

public class NumberReverse {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = scan.nextInt();
		int reverse = 0;
		while(num != 0) {
			
			reverse = reverse * 10 + (num%10);
			num /= 10;
		}
		System.out.println("Reverse Formet of Given Number : "+reverse);
		scan.close();
	}
}
