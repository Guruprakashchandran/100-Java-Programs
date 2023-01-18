package ZohoSchool;

import java.util.Scanner;

public class NewPattern {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter The Input : ");
		int input = scan.nextInt();
		int column = input*2;
		int row = (input*2)-1;
		int point = 0;
		System.out.println("Output : ");
		for(int i = 1;i<=row;++i) {
			for(int j = 1;j<=column;++j) {
				if(j<=input && j <= input-point) {
				
					System.out.print("*");
				}
				else if(j>input && j > input+point) {
					
					System.out.print("*");
				}
				else {
					
					System.out.print("_");
				}
			}
			if(i>=input) {
				
				point--;
			}
			else {
				
				point++;
			}
			System.out.println();
		}
		scan.close();
	}
}
