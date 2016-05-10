package combinations;

import java.util.ArrayList;

public class GetAllCombinationsOfAString {

	public static void main(String[] args) {
		ArrayList<String> results = combination("abcd");
		for(int i = 0; i < results.size(); i++) {
			System.out.println(results.get(i));
		}
	}
	
	public static ArrayList<String> combination(String text) {
		ArrayList<String> results = new ArrayList<String>();
		
		if (text.length() == 0) {
			return results;
		} else {
			results.add(text);
		}
		
		for (int i = 0; i < text.length(); i++) {
			char firstChar = text.charAt(i);
			results.add("" + firstChar);
			
			for(int j = i + 1; j < text.length(); j++) {
				results.add("" + firstChar + text.charAt(j));
			}
		}
		
		return results;
	}

}
