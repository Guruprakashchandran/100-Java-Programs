package ZohoSchool;

public class StaticKeyword {

	static {
		
		System.out.println("static");
	}
	static int s= 10;
	public static int staticKey() {
		
//		int s = 0;
		s = 0;
		s++;
//		System.out.println(s);
		StaticKeyword st = new StaticKeyword();
		st.display();
		return s;
	}
	void display() {
		
		System.out.println(s);
	}
	public static void main(String[] args) {
		
		StaticKeyword st = new StaticKeyword();
		int c = staticKey();
		staticKey();
		st.display();
		System.out.println("main");
	}
}
