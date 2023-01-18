package ZohoSchool;

import java.util.Arrays;
import java.util.Scanner;

public class PrintArrayElementsToString {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();
		int a[] = new int[length];
		for(int i = 0;i<length;++i) {
			
			a[i] = scan.nextInt();
		}
		System.out.println(Arrays.toString(a));
		scan.close();
	}
}
