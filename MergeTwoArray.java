package ZohoSchool;
import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoArray {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int input1[] = {2,3,4,5,6,7,10};
		int input2[] = {2,3,4,5,6,8,9};
		int input[] = new int[input1.length + input2.length];
		int k = 0;
		for(k = 0;k<input1.length;++k) {
			
			input[k] = input1[k];
		}
		for(int i = 0;i<input2.length;++i) {
			input[k+i] = input2[i];
		}
		Arrays.sort(input);
		System.out.println("Merging Two Arrays : ");
		for(int i = 0;i<input.length;++i) {
			
			if(i>0 && input[i] == input[i-1]) {
				
				continue;
			}
			System.out.print(input[i]);
		}
		scan.close();
	}
}
