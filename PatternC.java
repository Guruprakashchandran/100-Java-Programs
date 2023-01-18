package ZohoSchool;

import java.util.Scanner;

public class PatternC {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter The Input : ");
		int input = scan.nextInt();
		System.out.println("Output : ");
		for(int i = 0;i<input;++i) {
			
			for(int j = 0;j<input;++j) {
			
				if(i>0 && i < input-1) {
					
					System.out.print("*");
					break;
				}
				else {
					
					System.out.print("*");
				}
			}
			System.out.println();
		}
		scan.close();
	}
}
