package arrays;

public class RemoveElementFromArray {

	public static void main(String[] args) {
//		int[] a = {};
//		int[] a = {3};
//		int[] a = {3, 2, 2, 3};		
//		int[] a = {3, 2, 1, 3};
//		int[] a = {3, 2, 3, 1, 5};
//		int[] a = {3, 2, 3, 3, 3, 1, 5};
		int[] a = {3, 3};
//		int[] a = {4, 3};
		
		printArray(a);
		System.out.println("Length: " + removeElement(a, 3));
		printArray(a);
	}
	
	public static void printArray(int[] a) {
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
	
	public static int removeElement(int[] nums, int val) {
		int i = 0;
		int j = nums.length;
		
		if (nums.length == 0) {
			return 0;
		}
		
		if (nums.length == 1) {
			if (nums[0] == val) {
				return 0;
			} else {
				return 1;
			}
		}
		
		while(j > 0 && nums[j - 1] == val) {
			j--;
		}
		
		while(i < nums.length) {
			if (j == 0) {
				break;
			}
			
			if (i >= j) {
				break;
			}
			
			if (nums[i] == val) {
				nums[i] = nums[j - 1];	
				j--;
			}
			
			while(j > 0 && nums[j - 1] == val) {
				j--;
			}
			
			i++;
		}
		
		return j;
	}
}
