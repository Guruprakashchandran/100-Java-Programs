package ZohoSchool;

import java.util.Scanner;

public class AddTwoMatrix {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();
		int a[][] = new int[length][length];
		int b[][] = new int[length][length];
		for(int i = 0;i<length;++i) {
			
			for(int j = 0;j<length;++j) {
				
				a[i][j] = scan.nextInt();
			}
		}
		for(int i = 0;i<length;++i) {
			
			for(int j = 0;j<length;++j) {
				
				b[i][j] = scan.nextInt();
			}
		}
		int c[][] = new int[length][length];
		for(int i = 0;i<length;++i) {
			
			for(int j = 0;j<length;++j) {
				
				c[i][j] = a[i][j]+b[i][j];
			}
		}
		for(int i = 0;i<length;++i) {
			
			for(int j = 0;j<length;++j) {
				
				System.out.println(c[i][j]);
			}
		}
		scan.close();
	}
}
