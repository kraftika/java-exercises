package permutations;

public class PermutationsOfSet {

	public static String setOfStrings = "abc";
	
	public static void main(String[] args) {
		System.out.println("Permutations of a string" + setOfStrings);
		permutate(setOfStrings);
	}

	public static void permutate(String s) {
		int sLength = s.length();
		int i = 0;
		String permString = "", before = "", after = "";
		
		while(i < sLength) {
			before = "";
			after = "";
			
			if (i > 0) {
				before = s.substring(0, i);
			}
			
			if (i == sLength - 1) {
				after = "" + s.charAt(i);
			} else {
				after = s.substring(i + 1, sLength - i);;
			}
						
			permString = s.charAt(i) + before + after;
			System.out.println(permString);
			i++;
		}
	}
}
