package ZohoSchool;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateElementsAnArray {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Length Of An Array : ");
		int length = scan.nextInt();
		int a[] = new int[length];
		for(int i = 0;i<length;++i) {
			
			a[i] = scan.nextInt();
		}
		int dup[] = new int[length];
		int len = 0;
		Arrays.sort(a);
		boolean bool = false;
		for(int i = 0;i<length;++i,bool = false) {
			
			if(i+1 != length && a[i] == a[i+1]) {
				
				for(int j = 0;j<len;++j) {
					
					if(a[i] == dup[j]) {
						
						bool = true;
						break;
					}
				}
				if(bool == false) {
					
					dup[len++] = a[i];
				}
			}
		}
		System.out.print("Duplicate Elements : ");
		for(int i = 0;i<len;++i) {
			
			System.out.print(dup[i]+" ");
		}
		scan.close();
	}
}
