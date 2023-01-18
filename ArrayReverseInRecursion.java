package ZohoSchool;

import java.util.Scanner;

public class ArrayReverseInRecursion {

	public static int[] recursionOfArrayElements(int a[],int b[],int n,int s) {
		
		if(n == 0) {
			
			b[n] = a[s];
			return b;
		}
		else {
			
			b[n] = a[s];
			recursionOfArrayElements(a,b,n-1,s+1);
		}
		return b;
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();
		int a[] = new int[length];
		for(int i = 0;i<length;++i) {
			
			a[i] = scan.nextInt();
		}

		int b[] = new int[length];
//		b = a;
		b=recursionOfArrayElements(a,b,length-1,0);
		for(int i = 0;i<length;++i) {
			
			System.out.print(b[i]+" ");
		}
		scan.close();
	}
}
