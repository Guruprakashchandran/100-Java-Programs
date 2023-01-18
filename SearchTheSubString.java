package ZohoSchool;
import java.util.Scanner;

public class SearchTheSubString {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String s1 = scan.nextLine();
		String s2 = scan.nextLine();
		int value = -1;
		for(int i = 0;i<s1.length();++i) {
			
			for(int j = 0;j<s2.length();++j) {
				
				if(i<s1.length() && s1.charAt(i) == s2.charAt(j)) {
					
					i++;
				}
				else {
					
					break;
				}
				if(s2.length() -1 == j && s1.charAt(i-1) == s2.charAt(j)) {
					
					value = (i-1)-j;
				}
			}
		}
		System.out.println(value);
		scan.close();
	}
}
