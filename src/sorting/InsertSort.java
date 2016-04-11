package sorting;

import java.util.Random;

public class InsertSort {

	public static void main(String[] args) {
		int[] unsortedArray = generateArray(1000000);
		System.out.print("Unsorted array: ");
//		printElements(unsortedArray);
		insertionSort(unsortedArray);
		System.out.print("Sorted array: ");
//		printElements(unsortedArray);
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
		int maxLimit = Integer.MAX_VALUE;

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
