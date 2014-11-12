package learning;

public class ReverseWords {
	
	public static String reverse(String S){
		String reversed = "";
		int N = S.length();
		
		for (int i = 0; i < N; i++){
			reversed += S.charAt(N - i - 1);
		}
		
		return reversed;
	}
	
	public static String reverse2(String s){
		int N = s.length();
		char[] chars = s.toCharArray();
		char tmp;
		
		for (int i = 0; i < N/2; i++){
			tmp = chars[i];
			chars[i] = chars[N-1-i];
			chars[N-1-i] = tmp;
		}
		
		return new String(chars);
	}
	
	public static String reverseWordbyWord(String S){
		String reversed = "";
		String[] listOfWords = S.split(" ");
		
		for (int i = 0; i < listOfWords.length; i++){
			
		}
		
		return reversed;
	}


	public static void main(String[] args) {
		String myString = "this is a test for me";
		
		System.out.println("Normal ----- " + myString);
		System.out.println("Reversed the expression -----" +reverse2(myString));		
		
		System.out.println("Normal ----- " + myString);
		System.out.println("Reversed the expression word by word -----" +reverse(myString));

	}

}
