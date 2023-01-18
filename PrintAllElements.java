package ZohoSchool;

import java.util.Scanner;

public class PrintAllElements {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();
		int a[] = new int[length];
		for(int i = 0;i<length;++i) {
			
			a[i] = scan.nextInt();
		}
		System.out.println("Array Elements");
		for(int i = 0;i<length;++i) {
			
			System.out.print(a[i]+" ");
		}
		scan.close();
	}
}
