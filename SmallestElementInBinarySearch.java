package ZohoSchool;

import java.util.Scanner;

public class SmallestElementInBinarySearch {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();
		int a[] = new int[length];
		for(int i = 0;i<length;++i) {
			
			a[i] = scan.nextInt();
		}
		int min = a[0];
		int start = 0;
		int end = length-1;
		while(start < end) {
			
			if(a[start] < min) {
				
				min = a[start];
			}
			if(a[end] < min) {
				
				min = a[end];
				end--;
			}
			start++;
			end--;
		}
		System.out.println(min);
		scan.close();
	}
}
