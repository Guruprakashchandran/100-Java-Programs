package ZohoSchool;

import java.util.Scanner;

public class CopyElementsOneArrayToAnother {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Length Of An Array : ");
		int length = scan.nextInt();
		int a[] = new int[length];
		int b[] = new int[length];
		for(int i = 0;i<length;++i) {
			
			a[i] = scan.nextInt();
		}
		for(int i = 0;i<b.length;++i) {
			
			b[i] = a[i];
		}
		for(int i = 0;i<b.length;++i) {
			
			System.out.print(b[i]+" ");
		}
		scan.close();
	}
}
