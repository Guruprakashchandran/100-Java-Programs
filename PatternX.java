package ZohoSchool;

import java.util.Scanner;

public class PatternX {

	//static int length = 0;
	public static int[] length(int input,int length) {
		
		int a[] = new int[length];
		int i = 0;
		while(input!=0) {
			
			a[i++] = input%10;
			input = input/10;
		}
		return a;
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int length = 0;
		System.out.print("Enter The Number : ");
		int input = scan.nextInt();
		for(int i = input;i != 0;) {
			
			length++;
			i = i / 10;
		}
		int a[] = new int[length];
		a = length(input,length);
		System.out.println("Output : ");
		if(length % 2 == 1) {
			for(int i = 1;i<=length;++i) {
				for(int j = 1;j<=length;++j) {
					
					if(i==j || i+j == length+1) {
						
						System.out.print(a[length-i]);
					}
					else {
						
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
		else {
			
			System.out.println("Please Odd Number Length");
		}
		scan.close();
	}
}
