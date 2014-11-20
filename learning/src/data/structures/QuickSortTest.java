package data.structures;

import static org.junit.Assert.fail;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;

public class QuickSortTest {
	private int numbers[];
	
	final static int SIZE = 7;
	final static int MAX_NUMBER = 25;
	
	@Before
	public void setUp(){
		numbers = new int[SIZE];
		Random generator = new Random();
		for (int i = 0; i < numbers.length - 1; i++){
			numbers[i] = generator.nextInt(MAX_NUMBER);
		}
	}
	
	@Test
	public void testNull(){
		QuickSort sorter = new QuickSort();
		sorter.sort(null);
	}
	
	@Test
	public void testEmpty(){
		QuickSort sorter = new QuickSort();
		sorter.sort(new int[0]);
	}
	
	@Test
	public void testOneElementInList(){
		numbers = new int[1];
		numbers[0] = 3;
		QuickSort sorter = new QuickSort();
		sorter.sort(numbers);
	}	
	
	@Test
	public void testOrderNumbers(){
		int[] test = new int[] { 5, 5, 6, 6, 4, 4, 5, 5, 4, 4, 6, 6, 5, 5};
		QuickSort sorter = new QuickSort();
		sorter.sort(test);
		if (!validate(test)){
			fail("The numbers are not in order");
		}
		printResult(test);
	}
	
	@Test
	public void testOrderLessElements(){
		int[] test = new int[] { 4, 3, 1, 2};
		QuickSort sorter = new QuickSort();
		sorter.sort(test);
		if (!validate(test)){
			fail("The numbers are not in order");
		}
		printResult(test);
	}
	
	public void printResult(int[] numbers){
		for (int i = 0; i < numbers.length; i++){
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
	}
	
	public boolean validate(int[] numbers){
		for (int i = 0; i < numbers.length - 1; i++){
			if (numbers[i] > numbers[i+1]){
				return false;
			}	
		}
		return true;
	}
}
