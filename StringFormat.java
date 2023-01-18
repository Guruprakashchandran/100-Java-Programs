package ZohoSchool;

public class StringFormat {

	public static void main(String[] args) {
		
		int a = 10;
		//Using String Format
		String s = String.format("the Value is %d", a);
		System.out.println(s);
		//Without Using String Format
		s = "the Value is "+Float.toString(a);//Integer.toString(a);
		System.out.println(s);
	}
}
