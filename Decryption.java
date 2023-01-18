package ZohoSchool;

import java.util.Scanner;

public class Decryption {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter The String : ");
		String s = scan.nextLine();
		int sum = 0;
		String s1 = "";
		for(int i = 0;i<s.length();++i) {
			
			if((int)s.charAt(i)>=48 && (int)s.charAt(i)<=57) {
				
				sum = (sum * 10) + Character.getNumericValue(s.charAt(i));
				if(i+1< s.length() && (int)s.charAt(i+1)>=47 && (int)s.charAt(i+1)<=56) {
					
					continue;
				}
			}
			else {
				
				s1 += s.charAt(i);
				continue;
			}
			for(int j = 0;j<sum;++j) {
				
				System.out.print(s1);
			}
			s1 = "";
			sum = 0;
		}
		scan.close();
	}
}
