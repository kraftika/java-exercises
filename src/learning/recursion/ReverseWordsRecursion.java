package learning.recursion;

public class ReverseWordsRecursion {
	public static void main(String[] args) {
		System.out.println(Reverse("Ana are mere!"));
	}
	
	public static String Reverse(String s){
		String result = "", subString = "";
		if (s.length() == 0){
			return s;
		}
		else {
			String partOfString = s.substring(1);
			// Call the same method but starting with the second character
			// It is on stack 
			subString = Reverse(partOfString);
			result = subString + s.substring(0,1);
			return result;
		}
	}
}
