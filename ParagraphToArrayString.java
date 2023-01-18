package ZohoSchool;

import java.util.Arrays;
import java.util.Scanner;

public class ParagraphToArrayString {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String s1[] = s.split(" ");
		System.out.println(Arrays.toString(s1));
		scan.close();
	}
}
