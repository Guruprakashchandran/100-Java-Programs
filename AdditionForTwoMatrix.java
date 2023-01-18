package ZohoSchool;

import java.util.Scanner;

public class AdditionForTwoMatrix {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int row = 2;
		int column = 3;
		int a[][] = {{2,3,4},{5,6,7}};
		
		int r[] = new int[row];
		int c[] = new int[row];
		for(int i = 0;i<row;++i) {
			
			r[i] = 0;
		}
		for(int i = 0;i<row;++i) {
			int start = 0;
			int end = column-1;
			while(start < end) {
				
				if(i < column && end < row) {
					
					c[i] += a[end][i] + a[end][i];
				}
				r[i] = a[i][end] + a[i][end];
				r[i]= a[i][start] + a[i][start];
				if(i < column && start < row) {
					
					c[i] += a[start][i] + a[start][i];
				}
				start++;
				end--;
			}
		}
		for(int i = 0;i<2;++i) {
			
			for(int j = 0;j<3;++j) {
				
				System.out.print(r[i]+" ");
			}
			System.out.println();
		}
		for(int i = 0;i<2;++i) {
			
			for(int j = 0;j<3;++j) {
				
				System.out.print(c[i]+" ");
			}
			System.out.println();
		}
		scan.close();
	}
}
