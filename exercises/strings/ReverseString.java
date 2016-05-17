package strings;

public class ReverseString {
	public static void main(String[] args){
		String myString = "abcd";
		System.out.println(reverse(myString));
	}
	
	public static String reverse(String s) {
		if (s.length() == 0) {
			return "";
		}
		
		if (s.length() == 1) {
			return s;
		}
		
		char tmp;
		char[] charsArray = s.toCharArray();
		
		int l = charsArray.length;
		int i = 0;
		int j = l - 1;
		int middle = (i + j)/2;
	
		while (i <= middle) {
			tmp = charsArray[i];
			charsArray[i] = charsArray[j];
			charsArray[j] = tmp;
			j--;
			i++;
		}
		
		return new String(charsArray);
	}
	
	public static String reverse1(String s) {
		if (s.length() == 1) {
			return s;
		}
		
		return reverse(s.substring(1)) + s.charAt(0);
	}
	
	
	
//	public static String reverse(String str) {
//	  if (str.length() == 1) {
//	    return str;
//	  }
//	  
//	  return reverse(str.substring(1)) + str.charAt(0);
//	}
}
