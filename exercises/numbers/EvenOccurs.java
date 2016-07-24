package numbers;

public class EvenOccurs {

	public static void main(String[] args) {
		int[] arr = {1, 3, 3, 1, 4};
		System.out.println(getOccurences(arr));
	}

	public static int getOccurences(int[] arr) {
		int res = 0;
		
		for (int i = 0; i < arr.length; i++) {
			res = res ^ arr[i];
		}
		
		return res;
	}
}
