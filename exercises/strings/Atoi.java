package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Atoi {

	public static void main(String[] args) {
		String[] numbers = {"", "   ", "+", "-", "++1", "-1", "-0", "1", "--3", "+1",
							"0", "1a", "a1", "+a", "-a", "abc", 
							"2147483647", "2147483648", "2147483649", "214748sa3648",
							"-2147483648", "-2147483647", "-2147483649", "-2147483753", "-21474833322",
							"010", "    010", " 010 30"};
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.format("%s -> %d\n", numbers[i], stringToInteger(numbers[i]));
		}
	}
	
	public static int stringToInteger(String str) {
		boolean signed = false;
		
		str = str.trim();
		if (str.length() == 0 || 
			(str.length() == 1 && (str.charAt(0) == '-' || str.charAt(0) == '+'))) {
			return 0;
		}
		
		if (str.length() >= 1 && (str.charAt(0) == '-' || str.charAt(0) == '+')) {
			signed = str.charAt(0) == '-';
			str = str.substring(1);
		}
		
		if (str.length() == 1 && str.charAt(0) == '0') {
			return 0;
		}
		
		double result = 0;
		for (int i = 0; i < str.length(); i++) {
		    if ((int)str.charAt(i) < 48 || (int)str.charAt(i) > 57){
		        break;
		    }
			result = result*10 + (str.charAt(i) - '0');
		}
		
		if (signed && result > Integer.MAX_VALUE) {
			result = Integer.MIN_VALUE; 
		} else if (result > Integer.MAX_VALUE) {
			result = Integer.MAX_VALUE;
		} else if (signed) {
			result = -result;
		}
		
		return (int) result;
	}

}
