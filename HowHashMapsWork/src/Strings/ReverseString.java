package Strings;

public class ReverseString {
	public static void main(String[] args){
		String myString = "America este continent";
		System.out.println(reverse(myString));
	}
	
	public static String reverse(String str) {
	  if (str.length() == 1) {
	    return str;
	  }
	  
	  return reverse(str.substring(1)) + str.charAt(0);
	}
}
