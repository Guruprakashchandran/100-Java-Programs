package ZohoSchool;

import java.util.Scanner;

public class EvenAndOddElements {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();
		int a[] = new int[length];
		for(int i = 0;i<length;++i) {
			
			a[i] = scan.nextInt();
		}
		int even[],odd[];
		even = new int[length/2];
		if(length%2==1) {
			
			odd = new int[length/2+1];
		}
		else {
			
			odd = new int[length/2];
		}
		for(int i = 0;i<2;++i) {
			
			for(int k = 0,j = i;j<length;j+=2) {
				
				if(j%2 == 0) {
					
					odd[k] = a[j];
					k++;
				}
				else {
					
					even[k] = a[j];
					k++;
				}
			}
		}
		//Odd Positions
		System.out.println("Odd Positions : ");
		for(int i = 0;i<odd.length;++i) {
			
			System.out.print(odd[i]+" ");
		}
		//Even Positions
		System.out.println("\nEven Positions : ");
		for(int i = 0;i<even.length;++i) {
			
			System.out.print(even[i]+" ");
		}
		scan.close();
	}
}
