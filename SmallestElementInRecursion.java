package ZohoSchool;

import java.util.Scanner;

public class SmallestElementInRecursion {

	public static void smallestElement(int a[],int n,int min) {
		
		
		if(n == 0) {
			if(a[n]<min) {
				
				System.out.println("Smallest Element : "+a[n]);
				return;
			}
			System.out.println("Smallest Element : "+min);
			return;
		}
		else {
			if(a[n]<min) {
				
				min = a[n];
			}
			smallestElement(a,n-1,min);
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
		smallestElement(a,length-1,a[length-1]);
		scan.close();
	}
}
