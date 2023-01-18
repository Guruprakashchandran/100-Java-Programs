package ZohoSchool;

import java.util.Scanner;

public class Degree90AnglePattern {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		for(int i =1;i<=input;++i) {
			
			for(int j = input;j>=1;--j) {
				
				if(i >= j) {
					
					System.out.print("*");
				}
				else {
					
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
