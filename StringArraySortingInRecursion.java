package ZohoSchool;

import java.util.Arrays;

public class StringArraySortingInRecursion {

	public static int par(String s[],int start,int end) {
		
		String pos = s[end];
		int i = start-1;
		for(int j =start ; j <end;++j) {
			
			if(s[j].compareTo(pos)<0) {
				
				i++;
				String temp = s[j];
				s[j] = s[i];
				s[i] = temp;
			}
		}
		String temp = s[i+1];
		s[i+1] = s[end];
		s[end] = temp;
		return i+1;
	}
	public static void quick(String s[],int start,int end) {
		
		if(start < end) {
			
			int p = par(s,start,end);
			quick(s,start,p-1);
			quick(s,p+1,end);
		}
	}
	public static void main(String[] args) {
		
		String s[] = {"guru","prabha","abi"};
		quick(s,0,s.length-1);
		System.out.println(Arrays.toString(s));
	}
}
