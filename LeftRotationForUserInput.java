package ZohoSchool;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotationForUserInput {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int j=0,input = scan.nextInt();
		int a[] = {4,2,3,6,5};
		int b[] = new int[input];
		for(int i = 0;i<a.length;++i){

			if(i< (input%a.length)){

				b[i] = a[i];
			}
			else {

				a[j]= a[i];
				j++;	
			}
		}
		for(int i = 0;i<b.length;++i){

			a[j+i] = b[i];
		}
		System.out.println(Arrays.toString(a));
		scan.close();
	}
}
