package ZohoSchool;

import java.util.Scanner;

public class PatternStaritTriangle {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Input : ");
		int input = scan.nextInt();
		int value = input;
		for(int i =1;i<=input;++i) {
			
			for(int j = 1;j<=value;++j) {
				
				if(j+i>=input+1) {
					if(j>input) {
						
						System.out.print(input - (j-input));
					}
					else {
					
						System.out.print(j);
					}
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
