package ZohoSchool;

import java.util.Scanner;

public class GroupingArrayElements {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter The Number of Students : ");
		int numOfStudents = scan.nextInt();
		for(int i = 101 ;i<105;++i) {
			
			System.out.println("Group "+(i-100));
			for(int j = i;j<=(100+numOfStudents);j+=4) {
				
				System.out.println(j);
			}
		}
		scan.close();
	}
}
