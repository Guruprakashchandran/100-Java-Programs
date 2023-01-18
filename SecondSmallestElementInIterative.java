package ZohoSchool;

import java.util.Scanner;

public class SecondSmallestElementInIterative {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();
		int a[] = new int[length],min = 0,secMin = 1;
		for(int i = 0;i<length;++i) {
			
			a[i] = scan.nextInt();
			if(i == 0) {
				
				min = a[i];
			}
			else if(i == 1) {
				
				if(min>a[i]) {
					
					int temp = min;
					min = a[i];
					secMin = temp;
				}
				else {
					
					secMin = a[i];
				}
			}
			else {
				
				if(a[i]< min) {
					
					int temp = min;
					min= a[i];
					secMin = temp;
				}
				else if(a[i]<secMin) {
					
					secMin = a[i];
				}
			}
		}
		System.out.println("Second Smallest Element - "+secMin);
		scan.close();
	}
}
