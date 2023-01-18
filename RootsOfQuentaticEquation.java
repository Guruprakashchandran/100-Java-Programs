package ZohoSchool;

import java.util.Scanner;

public class RootsOfQuentaticEquation {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter A Value : ");
		double a = scan.nextFloat();
		System.out.print("Enter B Value : ");
		double b = scan.nextFloat();
		System.out.print("Enter C Value : ");
		double c = scan.nextFloat();
		double value = (b*b) - (4*a*c);
		if(value > 0) {
			
			double root1 = (-b + (Math.sqrt(value)))/(2*a);
			double root2 = (-b - (Math.sqrt(value)))/(2*a);
			System.out.println("values  root1 :"+root1+" root2 :"+root2);	
		}
		else {
			
			double root1 = (-b + (Math.sqrt(value)))/(2*a);
			System.out.println("Root Value : "+root1);
		}
		scan.close();
	}
}
