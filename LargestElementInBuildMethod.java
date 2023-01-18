package ZohoSchool;

import java.util.Arrays;
import java.util.Scanner;

public class LargestElementInBuildMethod {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();
		int a[] = new int[length];
		for(int i = 0;i<length;++i) {
			
			a[i] = scan.nextInt();
		}
		Arrays.sort(a);
		System.out.println("Largest Element : "+a[length-1]);
		scan.close();
	}
}
