package ZohoSchool;

public class SubtractionTwoMatrix {

	public static void subtraction(int i,int j,int a[][],int b[][],int c[][]) {
		
		c[i][j] = a[i][j] - b[i][j];
		
	}
	public static void recursion(int i,int j,int length,int a[][],int b[][],int c[][]) {
		
		j++;
		if(i < length - 1 && j == length-1){
			
			subtraction(i,j,a,b,c);
			i++;
			j = -1;
			recursion(i,j,length,a,b,c);
			
		}
		else if(j < length){
			
			subtraction(i,j,a,b,c);
			recursion(i,j,length,a,b,c);
		}
			return;
	}
	public static void main(String[] args) {
		
		int a[][] = {{1,2},{3,4}};
		int b[][] = {{6,7},{8,9}};
		int c[][] = new int[a.length][a[0].length];
		recursion(0,-1,a.length,a,b,c);
		for(int i = 0;i<a.length;++i) {
			
			for(int j = 0;j<a[0].length;++j) {
				
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}
