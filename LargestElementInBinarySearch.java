package ZohoSchool;

import java.util.Scanner;

public class LargestElementInBinarySearch {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();
		int a[] = new int[length];
		for(int i = 0;i<length;++i) {
			
			a[i] = scan.nextInt();
		}
		int max = a[0];
		int start = 0;
		int end = length-1;
		while(start < end) {
			
			if(a[start] > max) {
				
				max = a[start];
			}
			if(a[end] > max) {
				
				max = a[end];
				end--;
			}
			start++;
			end--;
		}
		System.out.println(max);
		scan.close();
	}
}
