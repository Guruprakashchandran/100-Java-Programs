package ZohoSchool;

import java.util.Arrays;

public class StringArraySortingDesending {
	
	public static void main(String[] args) {
		
		String s[] = {"guru","prabha","abi"};
		for(int i = 0;i<s.length-1;++i) {
			
			for(int j = i+1;j<s.length;++j) {
				
				if(s[i].compareTo(s[j]) < 0) {
					
					String temp = s[i];
					s[i] = s[j];
					s[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(s));
	}
}
