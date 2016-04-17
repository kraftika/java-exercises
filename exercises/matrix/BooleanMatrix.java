package matrix;

public class BooleanMatrix {
	
	static int n = 3;
	static int m = 3;
	static int row[] = new int[n];
	static int col[] = new int[m];
	
	public static void main(String[] args) {
		int[][] a ={
				{0,0,0},
				{0,1,1},
				{0,0,0}
				}; 
		
		System.out.println("Before ");
		print(a);
		modifyMatrix(a);
		System.out.println("After ");
		print(a);
	}
	
	public static void print(int[][] a) {
		for(int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.format("%d ", a[i][j]);
			}			
			System.out.println();
		}
	}

	public static void modifyMatrix(int[][] a) {
		for(int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (a[i][j] == 1) {
					row[i] = 1;
					col[j] = 1;
				}
			}			
		}
		
		for(int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (row[i] == 1 || col[j] == 1) {
					a[i][j] = 1;
				}
			}			
		}
	}
}
