package ZohoSchool;

public class TwoMatrixEqual {

	public static void main(String[] args) {
		
		int a[][] = {{1,2},{3,4}};
		int b[][] = {{1,2},{3,4}};
		boolean bool = false;
		for(int i = 0;i<a.length;++i) {
			
			for(int j = 0;j<a[0].length;++j) {
				
				if(a[i][j] != b[i][j]) {
					
					bool = true;
					break;
				}
			}
			if(bool == true) {
				
				break;
			}
		}
		if(bool == true) {
			
			System.out.println("Two Matrix are Not Equal");
		}
		else {
			
			System.out.println("Two Matrix are Equal");
		}
	}
}
