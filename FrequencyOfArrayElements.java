package ZohoSchool;

import java.util.Arrays;
import java.util.Scanner;

public class FrequencyOfArrayElements {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Length Of An Array : ");
		int length = scan.nextInt();
		int a[] = new int[length];
		for(int i = 0;i<length;++i) {
			
			a[i] = scan.nextInt();
		}
		int j = 0;
		Arrays.sort(a);
		for(int i =1;i<length;++i) {
			
			if(a[i] != a[j]) {
				
				int temp = a[++j];
				a[j] = a[i];
				a[i] = temp;
			}
		}
		int ele[] = new int[j+1];
		for(int i = 0;i<=j;++i) {
			
			int count = 1;
			for(int k = j+1;k<length;++k) {
				
				if(a[i] == a[k]) {
					
					count++;
				}
			}
			ele[i] = count;
			System.out.println(ele[i]+" "+i);
		}
		System.out.println("Element		Frequency of Element");
		for(int i = 0;i<j+1;i++) {
			
			System.out.println(a[i]+"		"+ele[i]);
		}
		scan.close();
	}
}
