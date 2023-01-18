package ZohoSchool;

import java.util.Scanner;

public class LeftRotationForTwoDimensional {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter The No of Row : ");
		int row = scan.nextInt();
		System.out.print("Enter The No of Columns : ");
		int column = scan.nextInt();
		int a[][] = new int[row][column];
		for(int i = 0;i<row;++i) {
			
			for(int j = 0;j<column;++j) {
				
				a[i][j] = scan.nextInt();
			}
		}
		System.out.println("Left Rotation Matrix : ");
		for(int i = column-1;i>=0;--i) {
			
			for(int j = 0;j<row;++j) {
				
				System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}
		scan.close();
	}
}
