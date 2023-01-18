package ZohoSchool;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateElementsInIterative {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();
		int a[] = new int[length];
		for(int i = 0;i<length;++i) {
			
			a[i] = scan.nextInt();
		}
		Set<Integer> set = new HashSet<Integer>();
		Arrays.sort(a);
		for(int i = 1;i<length;++i) {
			
			if(a[i] == a[i-1]) {
				
				set.add(a[i]);
			}
		}
		System.out.println(set);
		scan.close();
	}
}
