package ZohoSchool;

import java.util.Scanner;

public class SecondLargestInIterative {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();
		int a[] = new int[length];
		for(int i = 0;i < length;++i) {
			
			a[i] = scan.nextInt();
		}
		int max = a[0],secMax = a[1];
		for(int i = 2;i<length;++i) {
			
			if(a[i]> max) {
				
				int temp = max;
				max= a[i];
				secMax = temp;
			}
			else if(a[i]>secMax) {
				
				secMax = a[i];
			}
		}
		System.out.println("Second Largest Element - "+secMax);
		scan.close();
	}
}
