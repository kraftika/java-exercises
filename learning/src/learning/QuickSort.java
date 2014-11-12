package learning;

public class QuickSort {
	// Array list numbers
	private int[] numbers;
	// Length of the array
	private int number;
	
	public void sort(int[] values) {
		if ((values == null) || (values.length < 1)) {
			return;
		}
		
		this.numbers = values;
		number = values.length;
		quickSort(0, this.number - 1);
	}
	
	public void quickSort(int low, int high){
		int i = low, j = high;
		// Identify the pivot element
		int pivotElement = numbers[i + (j - i)/2];
		
		while (i <= j){
			// Loop until you find a larger element on the left
			while (pivotElement > numbers[i]){
				i++;
			}
			
			// Loop until you find a smaller element on the right
			while (pivotElement < numbers[j]){
				j--;
			}
			
			if (i <= j){
				exchangeElements(i, j);
				i++;
				j--;
			}
			
			// Recursion
			if (low < j){
				quickSort(low, j);
			}
			
			if (i < high) {
				quickSort(i, high);
			}
		}
	}
	
	public void exchangeElements(int i, int j){
		int temp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = temp;
	}
}
