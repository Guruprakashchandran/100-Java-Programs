package ZohoSchool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NoOfPathsInMultidimensionalArray {
	
	static List<List<Integer>> result = new ArrayList<List<Integer>>();
	
 	public static void paths(int i,int j,int p,int q) {
		
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(i,j));
		result.add(list);
		if(i == p || j == q) {
			
			if(i == p && j == q) {
				
				System.out.println(result);
			}
			else if(i<p) {
				
				for(int k = i+1;k<=p;++k) {
	
					List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(k,j));
					result.add(list1);
				}
				System.out.println(result);
			}
			else {
				
				for(int k = j+1;k<=q;++k) {
					
					List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(i,k));
					result.add(list1);
				}
				System.out.println(result);
			}
			
			return;
		}
		paths(i,j+1,p,q);
		int c = p - i;
		c += q - j;
		int start = result.size()-1;
		int end = result.size() -1 - c;
		for(int k = start;k>end;--k) {
			
			result.remove(k);
		}
		paths(i+1,j,p,q);
		return;
	}
	public static void main(String[] args) {
		
		System.out.println("\n\t\t\t-----Find No Of Paths-----\n");
		int s[] = {0,0};
		int d[] = {2,1};
		paths(s[0],s[1],d[0],d[1]);
	}
}
