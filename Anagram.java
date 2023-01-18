package ZohoSchool;

import java.util.Scanner;

public class Anagram {

	public static boolean anagram(String a,String b) {
		

		char c[] = a.toCharArray();
		char c1[] = b.toCharArray();

		int count = 1;		
		if(a.length() == b.length()){

			for(int val=0,j = 0,i=1;i<a.length();++i){

				if(c[j] == '#'){

					j++;
					i += 1;
					val =1;
				}
				else if(c[j] == c[i] || c[j] == c[i]-32 || c[j] == c[i]+32){

					count++;					
				}
				if(i+1 == a.length() && val != 1){
					//System.out.println(c[j] +" "+ count);
					for(int k = 0;k<a.length();++k){

						if(c[j] == c1[k] || c[j] == c1[k]-32 || c[j] == c1[k]+32){

//							System.out.println(count);
							count--;
						}
						if(k+1 == a.length() && count == 0){

							count = 1;
							j++;
							i += 1;
//							System.out.println(c[j] +" "+ count);
						}
						else if(k+1 == a.length() && count != 0){

							return false;
						}
					}
					if((j+1 ==a.length())){

						i = a.length();					
					}					
				}
				else if(val == 1) {
					
					val = 0;
				}
			}
		}
		else {

			return false;
		}
		return true;
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		String b = scan.nextLine();
		if(anagram(a,b)) {
			
			System.out.println("anagrams");
		}
		else {
			System.out.println("Not anagrams");
		}
	}
}
