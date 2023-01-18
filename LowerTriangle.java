package ZohoSchool;

public class LowerTriangle {

	public static void main(String[] args) {
		
		int a[][] = {{1,2,3,4,5},{4,5,6,9,0},{1,3,4,5,6}};
		System.out.println("-----------Lower Triangle Pattern------------\n");
		for(int i = 0;i<a.length;++i) {
			
			System.out.print("\t\t");
			for(int j = 0;j+i <=a[0].length; ++j ) {
				
				if(i <= j && a[0].length-1 >= j+i) {
					
					System.out.print(a[i][j]);
					if(a[0].length-1 == j+i) {
						
						break;
					}
				}
				else {
					
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
