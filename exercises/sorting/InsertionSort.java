package sorting;

import java.util.Random;

public class InsertionSort {

	public static void main(String[] args) {
		int[] unsortedArray = generateArray(4);
		System.out.print("Unsorted array: ");
//		insertionSort(unsortedArray);
		int[] sortedArray = insertionSort2(unsortedArray);
		System.out.print("Sorted array: ");
		printElements(sortedArray);
	}
	
	/**
	 * For each element:
	 * 	- find the next index where another element greater than the current
	 * 	- if it is found then save the current element and then replace all the elements except the current
	 * 	- when the replacement of all elements is finished then save the current element on the new position 
	 * 	
	 * @param data
	 * @return
	 */
	public static int[] insertionSort2(int[] data) {
		for (int i = 0; i < data.length; i++) {
			int j = i;
			while (j > 0 && data[i] < data[j - 1]) {
				j--;
			}
			int tmp = data[i];
			for(int k = i; k > j; k--) {
				data[k] = data[k - 1];
			}
			data[j] = tmp;
		}
		
		return data;
	}
	
	public static void insertionSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			insert(array, i); 
//			System.out.format("Step %d ", i);
//			printElements(array);
		}
	}
	
	public static void insert(int[] array, int currentIndex) {
		int value = array[currentIndex];
		int reverseIndex = currentIndex;
		
		for(int k = currentIndex - 1; k >= 0; k--) {
			if (array[k] > value) {
				array[k+1] = array[k];
				reverseIndex = k;
			} else {
				break;
			}
		}
		array[reverseIndex] = value;
	}
	
	public static int[] generateArray(int length) {
		int[] generatedArray = new int[length];

		Random rand = new Random();
		int counter = 0;
		int minim = 0;
//		int maxLimit = Integer.MAX_VALUE;
		int maxLimit = 20;

		do {
			int next = getRandomInteger(minim, maxLimit, rand);
			if (minim > next) {
				minim = next;
			}
			
			generatedArray[counter++] = next;
		}
		while (counter < length);
		
		return generatedArray;
	}
	
	private static int getRandomInteger(int aStart, int aEnd, Random aRandom){
		if (aStart > aEnd) {
		  throw new IllegalArgumentException("Start cannot exceed End.");
		}
		//get the range, casting to long to avoid overflow problems
		long range = (long)aEnd - (long)aStart + 1;
		// compute a fraction of the range, 0 <= frac < range
		long fraction = (long)(range * aRandom.nextDouble());
		return (int)(fraction + aStart);    
	}
	
	public static void printElements(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.format("%d ", array[i]);
		}
		
		System.out.println();
	}

}
