package hash.and.set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindDuplicates {
  public static void main(String[] args) {
    int[] array = new int[]{1,2,3,2,2,4,3,2,1};
    option2(array);
  }

  public static void option3(int[] inputArray) {
    Map<Integer, Integer> results = new HashMap<Integer, Integer>();

    for(int i = 0; i < inputArray.length; i++) {
      if (!results.containsKey(inputArray)) { 
      	results.put(inputArray[i], inputArray[i]);
      }
    }
    
    for (Integer item : results.keySet()) {
    	System.out.print(item.intValue() + " ") ;
    }
  }

  
  public static void option2(int[] inputArray) {
    Map<Integer, Integer> results = new HashMap<Integer, Integer>();

    for(int i = 0; i < inputArray.length; i++) {
      if (!results.containsKey(inputArray)) { 
      	results.put(inputArray[i], inputArray[i]);
      }
    }
    
    for (Integer item : results.keySet()) {
    	System.out.print(item.intValue() + " ") ;
    }
  }
  
  public static void option1(int[] inputArray) {
    Set<Integer> duplicates = new HashSet<Integer>();
    Map<Integer, Integer> results = new HashMap<Integer, Integer>();

    for(int i = 0; i < inputArray.length; i++) {
      if (!duplicates.add(inputArray[i])) {
        System.out.format("Pozitia %d duplicat %d \n", i + 1, inputArray[i]);
        if (!results.containsKey(inputArray)) { 
        	results.put(inputArray[i], inputArray[i]);
        }
      }
    }
    
    for (Integer item : results.keySet()) {
    	System.out.print(item.intValue() + " ") ;
    }
  }
}
