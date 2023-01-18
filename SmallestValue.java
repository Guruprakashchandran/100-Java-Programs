package ZohoSchool;

import java.util.Scanner;

public class SmallestValue {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter The Length Of Array : ");
		int length = scan.nextInt();
		int min = 2147483647;
		int a[] = new int[length];
		for(int i = 0;i<length;++i) {
			
			a[i] = scan.nextInt();
			if(min>a[i]) {
				min = a[i];
			}
		}
		System.out.println("Minimum Value : "+min);
		scan.close();
	}
}
