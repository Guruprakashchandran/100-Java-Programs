package ZohoSchool;

import java.util.Scanner;

public class SquareOfArea {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number:");
		int n =scan.nextInt();
		System.out.println("Area of the Square - "+n*n);
		scan.close();
	}
}
