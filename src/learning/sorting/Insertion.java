package learning.sorting;

import java.util.Random;

public class Insertion {
	
	public static void main(String[] args){
		/*
		 * Null array
		 */
		sort(null);
		/*
		 * Empty array
		 */
		int[] empty = new int[]{};
		sort(empty);
		/*
		 * The array has one element
		 */
		int[] one = new int[]{23};
		sort(one);
		/*
		 * The array has two elements
		 */
		int[] two = new int[]{23, 13};
		sort(two);
		/*
		 * The array has two elements
		 */
		int[] sorted = new int[]{13, 15, 22};
		sort(sorted);
		/*
		 * The array has ten elements
		 */
		int[] sortArray = randomize(10, 10);
		sort(sortArray);
		/*
		 * The array has one hundred elements
		 */
		sortArray = randomize(100, 100);
		sort(sortArray);
		/*
		 * The array has ten thousand elements
		 */
		sortArray = randomize(10000, 10000);
		sort(sortArray); 
		/*
		 * The array has one million elements
		 */
		sortArray = randomize(1000000, 100);
		sort(sortArray); 
	}
	
	public static void sort(int[] a){
		printArray(a);
		long start = System.currentTimeMillis();
		printArray(sortUsingInsertion(a));
		long end = System.currentTimeMillis();
		System.out.format("Elapsed time %d ms%n", end-start);
		System.out.println("-------------");
	}
	
	public static int[] sortUsingInsertion(int[] a){
		/*
		 * e.g.0 7 0 8 4 9 1 9 2 9 
		 */
		if (a == null){
			System.out.println("The arrary is null");
			return null;
		}
		
		if (a.length == 0) {
			System.out.println("The array is empty");
			return null;
		}
		
		if (a.length == 1) {
			System.out.println("The array has only one element");
			return a;
		}
		
		int i = 0;
		while (i < a.length){
			int j = i;
			int x = a[i];
			
			while(j > 0 && (a[j-1] > x)){
				a[j] = a[j-1];
				j--;
			}

			a[j] = x;
			i++;
		}
		
		return a;
	}
	
	public static int[] randomize(int length, int higherLimit){
		int[] array = new int[length];
		int randomValue;
		Random randomizer = new Random();
		
		for(int i=0;i<length;i++){
			randomValue = randomizer.nextInt(higherLimit);
			array[i] = randomValue;
		}
		
		return array;
	}
	
	public static void printArray(int[] array){
		if (array == null){
			System.out.println("The array is null");
			return;
		}
		
		int length = array.length;
		for(int k=0;k<length;k++){
			System.out.print(array[k] + " ");
		}
		System.out.println();
	}
}
