package algorithms;

import java.util.Random;

public class SelectionSort {

	public static void main(String[] args) {
		int[] myArray = generateArray(100000);
		System.out.print("Unsorted elements: ");
		printElements(myArray);
		selectionSort(myArray);
		System.out.print("Sorted elements: ");
		printElements(myArray);
	}
	
	public static int[] selectionSort(int[] unsortedArray) {
		int minimIndex = 0;
		int tmpValue = 0;
		
		for (int i = 0; i < unsortedArray.length; i++) {
			minimIndex = getIndexOfMinimElement(unsortedArray, i);
			
			tmpValue = unsortedArray[i];
			unsortedArray[i] = unsortedArray[minimIndex];
			unsortedArray[minimIndex] = tmpValue;
			
//			System.out.format("Step %d ", i + 1);
//			printElements(unsortedArray);
		}
		
		return unsortedArray;
	}
	
	public static int getIndexOfMinimElement(int[] array, int startIndex) {
		if (array.length == 0) {
			return -1;
		}
		
		int indexMinim = startIndex;
		int minimValue = array[startIndex];
		
		for(int i = startIndex; i < array.length; i++) {
			if (minimValue > array[i]) {
				indexMinim = i;
				minimValue = array[i];
			}
		}
		
		return indexMinim;
	}
	
	public static int[] generateArray(int length) {
		int[] generatedArray = new int[length];

		Random rand = new Random();
		int counter = 0;
		int minim = 0;
		int maxLimit = 2000000;

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
