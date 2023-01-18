package ZohoSchool;

import java.util.Scanner;

public class StringInLinearSearch {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String a[] = {"guru","abi","ganesh"};
		char c = scan.next().charAt(0);
		boolean bool = false;
		int i = 0;
		for(i = 0;i<a.length;++i) {
			
			if(a[i].equals(c)) {
				
				bool = true;
				break;
			}
		}
		if(bool == false) {
			
			System.out.println("This Word Match");
			System.out.println("Index - "+--i);
		}
		else {
			
			System.out.println("This Word Not Match");
		}
		scan.close();
	}
}
