package ZohoSchool;

import java.util.Scanner;

public class CylinderOfArea {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the radius : ");
		float radius = scan.nextFloat();
		System.out.print("Enter the Height : ");
		float height = scan.nextFloat();
		float cylinder = (2*(22/7)*radius*height)*(2*(22/7)*radius*radius);
		System.out.println("Cylinder Of a Area : "+cylinder);
		scan.close();
	}
}
