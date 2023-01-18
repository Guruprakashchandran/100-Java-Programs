package ZohoSchool;

import java.util.Scanner;

public class ArrayReverseInBinarySearch {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();
		int a[] = new int[length];
//		int start = 0,end = length-1;
		for(int i = 0;i<length;++i) {
			
			a[i] = scan.nextInt();
		}
		for(int i = 0;i<length/2;++i) {
			
			int temp = a[i];
			a[i] = a[length-i-1];
			a[length-i-1] = temp;
		}
		for(int i = 0;i<length;++i) {
			
			System.out.print(a[i]+" ");
		}
	}
}
