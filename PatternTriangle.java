package ZohoSchool;

import java.util.Scanner;

public class PatternTriangle {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Input : ");
		int input = scan.nextInt();
		int value = (input*2)-1;
		for(int i = input;i>0;--i) {
			
			for(int j = 1;j<=value;++j) {
				
				if(i+j >= input+1 && (i+j)%2==(input+1)%2) {
					
					System.out.print(i);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
			value = value-1;
		}
		scan.close();
	}
}
