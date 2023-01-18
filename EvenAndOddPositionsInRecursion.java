package ZohoSchool;

import java.util.Scanner;

public class EvenAndOddPositionsInRecursion {

	static int oddPosition[],evenPosition[];

	public static void oddAndEven(int a[],int odd,int even,int length,int start) {
		
		if(start%2 == 0) {
			
			
			oddPosition[odd++] = a[start];
		}
		else{
			
			evenPosition[even++] = a[start];
		}
		if(start == length-1) {
		
			return;
		}
		oddAndEven(a,odd,even,length,++start);
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();
		int a[] = new int[length];
		for(int i = 0;i<length;++i) {
			
			a[i] = scan.nextInt();
		}
		evenPosition = new int[length/2];
		if(length%2==1) {
			
			oddPosition = new int[length/2+1];
		}
		else {
			
			oddPosition = new int[length/2];
		}
		oddAndEven(a,0,0,length,0);
		//Odd Positions
		System.out.println("Odd Positions : ");
		for(int i = 0;i<oddPosition.length;++i) {
					
			System.out.print(oddPosition[i]+" ");
		}
		//Even Positions
		System.out.println("\nEven Positions : ");
		for(int i = 0;i<evenPosition.length;++i) {
					
			System.out.print(evenPosition[i]+" ");
		}
		scan.close();
	}
}
