package ZohoSchool;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Length : ");
		int length = scan.nextInt();
		System.out.print("Enter the Breath : ");
		int breath = scan.nextInt();
		int area = length * breath;
		System.out.println("Area Of Rectangle : "+area);
		scan.close();
	}
}
