package ZohoSchool;

import java.util.Scanner;

public class PatternXRow {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Input : ");
		int input = scan.nextInt();
		int value = input;
		int length = 0;
		while(value!=0) {
			
			value/=10;
			length++;
		}
		int a[] = new int[length];
		int in = 0;
		while(input != 0) {
			
			a[in++] = input%10;
			input/=10;
		}
		for(int i = 0;i<length;++i) {
			
			for(int j = 0;j<length;++j) {
				
				if(i == j || i+j == length-1) {
					
					System.out.print(a[(length-1) - i]);
					if(i<=(input/2+1) && i+j == length-1) {
						
						break;
					}
					else if(i>input/2+1 && i == j) {
						
						break;
					}
				}
				else {
					
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
