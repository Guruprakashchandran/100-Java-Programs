package ZohoSchool;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OddAndEvenFrequency {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();
		int a[] = new int[length];
		Map<String,Integer> map = new HashMap<String,Integer>();
		int odd = 0,even = 0;
		for(int i = 0;i<length;++i) {
			
			a[i] = scan.nextInt();
		}
		for(int i = 0;i<length;++i) {
			
			if(a[i]%2==1) {
				
				odd++;
			}
			else {
				
				even++;
			}
		}
		map.put("odd", odd);
		map.put("even", even);
		System.out.println(map);
		scan.close();
	}
}
