package ZohoSchool;

import java.util.Scanner;

public class StringInBinarySearch {

	public static int find(String a[],char word,int start,int end) {
		
		while(start < end) {
			
			if(a[start].equals(word)) {
				
				return start;
			}
			else if(a[end].equals(word)) {
				
				return end;
			}
			else {
				
				find(a,word,++start,--end);
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();
		String a[] = new String[length];
		for(int i = 0;i<length;++i) {
			
			a[i] = scan.nextLine();
		}
		char word = scan.next().charAt(0);
		int i = find(a,word,0,length-1);
		if(i!=-1) {
			
			System.out.println("match");
			System.out.println("Index - "+i);
		}
		else {
			
			System.out.println("Not Match");
		}
		scan.close();
	}
}
