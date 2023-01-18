package ZohoSchool;

import java.util.Scanner;

public class CopyArrayElementsToAnother {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();
		int a[] = new int[length];
		for(int i = 0;i<length;++i) {
			
			a[i] = scan.nextInt();
		}
		int start = 0;
		int end = length-1;
		int copy[] = new int[length];
		while(start <= end) {
			
			copy[start] = a[start];
			copy[end] = a[end];
			start++;
			end--;
		}
		for(int i = 0;i<length;++i) {
			
			System.out.print(copy[i]+" ");
		}
		scan.close();
	}
}
