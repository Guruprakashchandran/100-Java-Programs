package ZohoSchool;

import java.util.Scanner;

public class LargestElement {

	public  static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Length of Array : ");
		int length = scan.nextInt();
		int a[] = new int[length];
		int max = -2147483648;
		for(int i = 0;i<length;++i) {
			
			a[i] = scan.nextInt();
			if(max<a[i]) {
				
				max = a[i];
			}
		}
		System.out.println("Max Value : "+max);
		scan.close();
	}
}
