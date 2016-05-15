package sorting;

public class BubbleSort {

	public static void main(String[] args) {
		int[] a = {5, 2, 3, 6, 8, 2, 1};
		printArray(a);
		a = sort(a);
		printArray(a);
	}
	
	public static int[] sort(int[] m) {
		int tmp;
		int l = m.length;
		for(int i = 0; i < l; i++) {
			for(int j = 0; j < l - 1; j++) {
				if (m[j] > m[j + 1]) {
					tmp = m[j];
					m[j] = m[j+1];
					m[j + 1] = tmp;
				}
			}
		}
		
		return m;
	}

	public static void printArray(int[] n) {
		for(int i = 0; i < n.length; i++) {
			System.out.print(n[i] + " ");
		}
		System.out.println();
	}
	
}
