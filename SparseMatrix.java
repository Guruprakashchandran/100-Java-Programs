package ZohoSchool;

public class SparseMatrix {

	public static void main(String[] args) {
		
		int count = 0,a[][] = {{0,0,1},{1,0,0},{0,1,0}};
		for(int i = 0;i<a.length;++i) {
			
			for(int j = 0;j<a[0].length;++j) {
				
				if(a[i][j] == 0) {
					
					count++;
				}
			}
		}
		if(count > (a.length + a[0].length)/2) {
			
			System.out.println("This is Sparse Matrix");
		}
		else {
			
			System.out.println("This is not Sparse Matrix");
		}
	}
}
