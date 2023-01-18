package ZohoSchool;

import java.util.ArrayList;
import java.util.Scanner;

public class ParagraphToStringArrayInIterative {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String s1 = "";
		ArrayList<String> list = new ArrayList<String>();
		for(int i = 0;i<s.length();++i) {
			
			if(i<s.length()-1 && s.charAt(i)!= ' ') {
				
				s1 += s.charAt(i);
			}
			else if(i == s.length()-1) {
				
				if(s.charAt(i) != '.') {
					
					s1 += s.charAt(i);
				}
				list.add(s1);
				s1 = "";
			}
			else {
				
				list.add(s1);
				s1 = "";
			}
		}
		System.out.println(list);
		scan.close();
	}
}
