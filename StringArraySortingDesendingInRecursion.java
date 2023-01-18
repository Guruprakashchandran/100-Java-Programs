package ZohoSchool;

import java.util.Arrays;

public class StringArraySortingDesendingInRecursion {

	public static int par(String s[],int start,int end) {
		
		String pos= s[end];
		int i = start -1;
		for(int j = start;j<end;++j) {
			
			if(s[j].compareTo(pos)>0) {
				
				i++;
				String temp = s[i];
				s[i] = s[j];
				s[j] = temp;
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
		
		String s[] = {"guru","abi","ganesh","sakthi","mahesh"};
		quick(s,0,s.length-1);
		System.out.println(Arrays.toString(s));
	}
}
