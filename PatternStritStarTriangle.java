package ZohoSchool;

import java.util.Scanner;

public class PatternStritStarTriangle {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Input : ");
		int input = scan.nextInt();
		int value = input;
		for(int i =1;i<=input;++i) {
			
			for(int j = 1;j<=value;++j) {
				
				if(j+i>=input+1) {
					
					System.out.print("*");
				}
				else {
					
					System.out.print(" ");
				}
			}
			System.out.println();
			value++;
		}
		scan.close();
	}
}
