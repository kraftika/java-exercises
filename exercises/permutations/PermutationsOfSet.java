package permutations;

import java.util.ArrayList;

public class PermutationsOfSet {

	public static String setOfStrings = "abc";
	
	public static void main(String[] args) {
		System.out.println("Permutations of a string" + setOfStrings);
		ArrayList<String> perm = getPermutations(setOfStrings);
		for (int i = 0; i < perm.size(); i++) {
			System.out.println(perm.get(i));
		}
	}

	
	public static ArrayList<String> getPermutations(String text) {
		ArrayList<String> results = new ArrayList<String>();;
		
		if (text.length() == 1) {
			results.add(text);
		}
		
		String result = "";
		
		for (int i = 0; i < text.length(); i++) {
			result = text.substring(0, i) + text.substring(i+1);
			ArrayList<String> innerPerm = getPermutations(result);
			
			for (int j = 0; j < innerPerm.size(); j++) {
				results.add(text.charAt(i) + innerPerm.get(j));	
			}
		}
		
		return results;
	}
}
