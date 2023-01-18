package ZohoSchool;

public class LongKeyword {

	public static void main(String[] args) {
		
		long a = 1234567890;
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		if(Long.MAX_VALUE >= a && a >= Long.MIN_VALUE) {
			
			System.out.println(a);
		}
		else {
			
			System.out.println("variable value is outof long datatype size!!");
		}
	}
}
