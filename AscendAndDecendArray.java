package ZohoSchool;

import java.util.Scanner;

public class AscendAndDecendArray {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Length of An Array : ");
		int length = scan.nextInt();
		int a[] = new int[length];
		for(int i = 0;i<length;++i) {
			
			a[i] = scan.nextInt();
		}
		for(int i = 0;i<length;++i) {
			
			for(int j = i+2;j<length;j+=2) {
				
				if(i%2 == 0) {
					
					if(a[i] < a[j]) {
						
						int temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
				else {
					
					if(a[i]>a[j]) {
						
						int temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
			}
		}
		for(int i = 0;i<length;++i) {
			
			System.out.print(a[i]+" ");
		}
	}
}
