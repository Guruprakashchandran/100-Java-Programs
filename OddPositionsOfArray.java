package ZohoSchool;

import java.util.Scanner;

public class OddPositionsOfArray {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Length Of Array : ");
		int length = scan.nextInt();
		int a[] = new int[length];
		for(int i = 0;i<length;++i) {
			
			a[i] = scan.nextInt();
		}
		for(int i = 0;i<length;i+=2) {
			
			System.out.print(a[i]+" ");
		}
		scan.close();
	}
}
