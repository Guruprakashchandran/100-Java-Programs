package ZohoSchool;

import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Input : ");
		int input = scan.nextInt();
		int sum = 0,largeDigit = 0;
		for(int i = 1;i<=input;++i) {
			
			sum+=i;
		}
		System.out.println("Sum Of Natural Numbers : "+sum);
		while(sum!=0) {
			
			if(largeDigit<(sum%10)) {
				
				largeDigit = sum%10;
			}
			sum/=10;
		}
		System.out.println("Large Digit : "+largeDigit);
		scan.close();
	}
}
