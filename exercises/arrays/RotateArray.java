package arrays;

public class RotateArray {

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5, 6, 7};
		int k = 3;
		
		int n = a.length;
		if (k > n) {
			System.out.println("Pick up a lower level, below " + (n - 1));
			return;
		}
		
		printArray(a);
		
		int tmp;
		int j = 0;
		for(int i = k + 1; i < n; i++) {
			tmp = a[i];
			a[i] = a[j];
			a[j] = tmp;
			j++;
		}
		
		printArray(a);
	}
	
	public static void printArray(int[] array) {
		for(int index = 0; index < array.length; index++) {
			System.out.print(array[index] + " ");
		}
		System.out.println();
	}

}
