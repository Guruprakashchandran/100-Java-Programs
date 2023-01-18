package ZohoSchool;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class FrequencyElementInMap {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();
		int a[] = new int[length];
		for(int i = 0;i<length;++i) {
			
			a[i] = scan.nextInt();
		}
		int j = 0,count = 1;
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		Arrays.sort(a);
		for(int i = 1;i<length;++i) {
			
			if(a[j]!=a[i]) {
				
				map.put(a[j],count);
				j = i;
				i = j;
				count = 1;
			}
			else {
				
				count++;
			}
		}
		map.put(a[j], count);
		Set<Entry<Integer, Integer>> set = map.entrySet();
		System.out.println(set);
		scan.close();
	}
}
