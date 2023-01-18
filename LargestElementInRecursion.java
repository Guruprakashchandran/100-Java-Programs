package ZohoSchool;

import java.util.Scanner;

public class LargestElementInRecursion {

	public static void largestElement(int a[],int n,int max) {
		
		System.out.println(n+"-"+max);
		if(n == 0) {
			if(a[n]>max) {
				System.out.println("Largest Element : "+a[n]);
				return;
			}
			System.out.println("Largest Element : "+max);
			return;
		}
		else {
			if(a[n]>max) {
				
				max = a[n];
			}
			largestElement(a,n-1,max);
		}
		return;
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();
		int a[] = new int[length];
		for(int i = 0;i<length;++i) {
			
			a[i] = scan.nextInt();
		}
		largestElement(a,length-1,a[length-1]);
		scan.close();
	}
}
