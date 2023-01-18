package ZohoSchool;

import java.util.Scanner;

public class CharacterInWordBinarySearch {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		char c = scan.next().charAt(0);
		int start = 0;
		int end = s.length() - 1;
		boolean reach = false;
		while(start <= end) {
			
			if(s.charAt(start) == c || s.charAt(end) == c) {
				
				System.out.println(c + " is Available");
				System.out.println((boolean)(s.charAt(end) == c)?"Index - "+end:"Index - "+start);
				reach = true;
				break;
			}
			start++;
			end--;
		}
		if(reach == false) {
			
			System.out.println(c + " character Not Available in the Word");
		}
	}
}
