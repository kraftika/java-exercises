package matrix;

import java.util.Random;

public class PrintInSpiralForm {
	static int n = 5;
	static int m = 5;
	
	public static void main(String[] args) {
		int[][] m = populateMatrix();
		printMatrix(m);
		printSpiralMatrix(m);
	}
	
	public static void printSpiralMatrix(int[][] a) {
		int l = n - 1;
		int c = m - 1;
		int i = 0;
		int j = 0;
		int k;
		
		while(l > i && c > j) {
			for (k = j; k <= c-j; k++)
				System.out.format("%d  ", a[i][k]);

			for (k = i + 1; k <= l-i; k++)
				System.out.format("%d  ", a[k][c-j]);
			
			for (k = c - j - 1; k >= j; k--)
				System.out.format("%d  ", a[l-i][k]);
			
			for (k = l - i - 1; k >= i + 1; k--)
				System.out.format("%d  ", a[k][j]);
			
			j++;
			i++;
		}
	}
	
	public static void printMatrix(int[][] s) {
		for(int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.format("%d  ", s[i][j]);
			}
			System.out.println();
		}
	}
	
	public static int[][] populateMatrix() {
		int[][] matrix = new int[n][m];
		for(int i = 0; i < n; i++) 
			for (int j = 0; j < m; j++) {
				matrix[i][j] = random(20);
			}
		
		return matrix;
	}

	public static int random(int n) {
		Random random = new Random();
		return 1 + random.nextInt(100) % n;
	}
}
