package ZohoSchool;

import java.util.Scanner;

public class SumArrayElements {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Length of an Array : ");
		int length = scan.nextInt();
		int a[] = new int[length];
		for(int i = 0;i<length;++i) {
			
			a[i] = scan.nextInt();
		}
		int sum = 0;
		for(int i = 0;i<a.length;++i) {
			
			sum += a[i];
		}
		System.out.println("Sum Of Array Elements : "+sum);
		scan.close();
	}
}
