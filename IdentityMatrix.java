package ZohoSchool;

public class IdentityMatrix {

	public static void main(String[] args) {
		
		int count = 0,a[][] = {{1,0,0},{0,1,0},{0,0,1}};
		boolean fail = false;
		for(int i = 0;i<a.length;++i) {
			
			for(int j = 0;j<a[0].length;++j) {
				
				if(i == j && a[i][j] != 1) {
					
					fail = true;
					break;
				}
				else if(i != j && a[i][j] != 0){
					
					fail = true;
					break;
				}
			}
			if(fail) {
				
				break;
			}
		}
		if(fail) {
			
			System.out.println("This is not a identity matrix");
		}
		else {
			
			System.out.println("This is a identity matrix");
		}
	}
}
