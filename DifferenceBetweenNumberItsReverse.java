package ZohoSchool;

import java.util.Scanner;

public class DifferenceBetweenNumberItsReverse {

	public static int reverse(int n) {
		
		int sum = 0;
		while(n!=0) {
			
			sum = (sum*10) + (n%10);
			n = n/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter The Number : ");
		int input = scan.nextInt();
		int revInput = reverse(input);
		System.out.println("Number Reverse Format : "+ revInput);
		System.out.println("Output : "+(input-revInput));
		scan.close();
	}
}
