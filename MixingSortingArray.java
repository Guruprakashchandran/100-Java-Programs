package ZohoSchool;
import java.util.Scanner;

public class MixingSortingArray {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter The Length of Array : ");
		int length = scan.nextInt();
		int input[] = new int[length];
		for(int i = 0;i<length;++i) {
			
			input[i] = scan.nextInt();
		}
		int array[] = new int[length];
		int j =0,end = input.length-1,start = 0;
		for(int i=0;i<length/2;++i) {
			
			if(start != end) {
				
				array[j++] = input[end];
				end--;
				array[j++] = input[start];
				start++;
			}
		}
		if(input.length % 2 == 1) {
			
			array[j] = input[start];
		}
		for(int i = 0;i<length;++i) {
			
			System.out.print(array[i]+" ");
		}
		scan.close();
	}
}
