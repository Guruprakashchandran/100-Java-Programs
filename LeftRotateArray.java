package ZohoSchool;

import java.util.Scanner;

public class LeftRotateArray {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Length of an Array : ");
		int length = scan.nextInt();
		int a[] = new int[length];
		for(int i = 0;i<length;++i) {
			
			a[i] = scan.nextInt();
		}
		int pos = a[0];
		for(int i = length-1;i>=0;--i) {
			
			int temp = a[i];
			a[i] = pos;
			pos = temp;

		}
		for(int i = 0;i<length;++i) {
			
			System.out.print(a[i]+" ");
		}
		scan.close();
	}
}
