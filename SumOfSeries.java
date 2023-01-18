package ZohoSchool;
import java.util.Scanner;

public class SumOfSeries {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int sum = 0;
		int total=0;
		for(int i = 0;i<input;++i) {
			
			total += sum = (sum * 10) + 1;
		}
		System.out.print(total);
		scan.close();
	}
}
