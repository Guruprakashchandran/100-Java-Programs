package ZohoSchool;

import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallestElementInArray {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();
		int a[] = new int[length];
		for(int i = 0;i<length;++i) {
			
			a[i] = scan.nextInt();
		}
		Arrays.sort(a);
		if(length>=2) 
			System.out.println(a[1]);
		else 
			System.out.println("Enter Length Above 2");
		scan.close();
	}
}
