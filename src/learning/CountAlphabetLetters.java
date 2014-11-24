package learning;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountAlphabetLetters {

	public static void main(String[] args) {
		String statement = "I have to count letters";
		
		HashMap<String, Integer> countingList = new HashMap();
		int index = 0; 
		long length = statement.length();
		listLetters(countingList, "a");
		while (index < length){
			
		}
	}
	
	public static boolean checkLetter(HashMap<String, Integer> list, String s){
		boolean isInList = false;
		
		Iterator iterator = list.entrySet().iterator();
		
		while(iterator.hasNext()){
			Map.Entry<String, Integer> entry = (Map.Entry<String, Integer>)iterator.next();
		}
		
		return isInList;
	}
	
	/*
	 * List with generics
	 */
	public static void listLetters(HashMap<String, Integer> hashList, String s){
		boolean isInList = false;

		hashList.put("a", 1);
		hashList.put("e", 4);
		hashList.put("g", 6);
		hashList.put("kf", 9);
		
		Iterator iterator = hashList.entrySet().iterator();
		
		while(iterator.hasNext()){
			@SuppressWarnings("unchecked")
			Map.Entry<String, Integer> entry = (Map.Entry<String, Integer>)iterator.next();
			System.out.println(entry.getKey() + " -- "  + entry.getValue());
		}
		
		System.out.println("List only the keys");
		for(String entry: hashList.keySet()){
			System.out.println("Key: " + entry);
		}
		
		System.out.println("List only the values");
		for(Integer entry: hashList.values()){
			System.out.println("Key: " + entry);
		}
		
		System.out.println("List the keys and values - using Iterator");
		Iterator<Entry<String, Integer>> entries = hashList.entrySet().iterator();
		while(entries.hasNext()){
			Entry<String, Integer> entry = entries.next();
			System.out.println(entry.getKey() + " -- " + entry.getValue());
		}
		
		System.out.println("List the keys and values - using for");
		for (Entry<String, Integer> entry: hashList.entrySet()){
			System.out.println(entry.getKey() + " -- " + entry.getValue());
		}
	}
}
