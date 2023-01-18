package ZohoSchool;

import java.util.Scanner;

public class SumOfEachRowAndColumn {

	public static void printSums(int a[],String s) {
		
		for(int i = 0;i<a.length;++i) {
			
			System.out.println(s+" "+i+" - "+a[i]);
		}
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();
		int a[][] = new int[length][length];
		for(int i = 0;i<length;++i) {
			for(int j = 0;j<length;++j) {
				
				a[i][j] = scan.nextInt();
			}
		}
		int row[] = new int[length];
		int column[] = new int[length];
		for(int i = 0;i<length;++i) {
			int sumOfRow = 0;
			int sumOfColumn = 0;
			for(int j = 0;j<length;++j) {
				
				sumOfRow += a[i][j];
				sumOfColumn += a[j][i];
			}
			row[i] = sumOfRow;
			column[i] = sumOfColumn;
		}
		System.out.println("Sum Of Rows ");
		printSums(row,"Row");
		System.out.println("Sum Of Columns");
		printSums(column,"Column");
		scan.close();
	}
}
