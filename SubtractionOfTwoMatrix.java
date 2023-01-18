package ZohoSchool;

public class SubtractionOfTwoMatrix {

	public static void main(String[] args) {
		
		int a[][] = {{1,2},{3,4}};
		int b[][] = {{6,7},{8,9}};
		int c[][] = new int[a.length][a[0].length];
		for(int i = 0;i<a.length;++i) {
			
			for(int j = 0;j<a[0].length;++j) {
				
				c[i][j] = a[i][j] - b[i][j];
			}
		}
		for(int i = 0;i<a.length;++i) {
			
			for(int j = 0;j<a[0].length;++j) {
				
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}
}
