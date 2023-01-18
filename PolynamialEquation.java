package ZohoSchool;

import java.util.Scanner;

public class PolynamialEquation {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		double x = ((-b) + Math.abs ( Math.sqrt (( b * b ) - ( 4 * a * c )))) / ( 2 * a);
		System.out.println(x);
		scan.close();
	}
}
