package ZohoSchool;

public class TransposeMatrix {

	public static void main(String[] args) {
		
		int a[][] = {{1,2},{3,4}};
		for(int i = 0;i<a.length;++i) {
			
			for(int j = a[0].length-1;j>=0;--j) {
				
				System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}
	}
}
