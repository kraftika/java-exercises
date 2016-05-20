package bitManipulation;

public class OperationsOnStrings {

	public static void main(String[] args) {
		// To upper case
		toUpperCase("abC");
		// To lower case
		toLowerCase("Abc");
		// Get max and min integers
		System.out.println(maxInteger1());
		System.out.println(maxInteger2());
		System.out.println(minInteger1());
		System.out.println(minInteger2());
		// Power of 2
		
		// Multiple/Divide by power of 2
		
		// Odd number?
		System.out.println(isOddNumber(1));
		System.out.println(isOddNumber(10));
		System.out.println(isOddNumber(31));
		
		// Exchange numbers
		exchangeTwoNumbers(13, 28);
		
		// n + 1 => -~n
		// n - 1 => ~-n
		
		// Check if both have the same sign 
//			(x ^ y) >= 0;
		
		// Get max of two values
//		b & ((a-b) >> 31) | a & (~(a-b) >> 31);
		
		// Get min of two values
//		a & ((a-b) >> 31) | b & (~(a-b) >> 31);
		
//		/**
//		 *  x = a ^ b ^ x; 
//		 *
//		 *  if (x==a) 
//				x=b; 
//			
//			if (x==b) 
//				x=a;
//		 **/

	}
	
	public static void toUpperCase(String s) {
		for (int i = 0; i < s.length(); i++) {
			System.out.format("%c", s.charAt(i) & '_');
		}
		System.out.println();
	}
	
	public static void toLowerCase(String s) {
		for (int i = 0; i < s.length(); i++) {
			System.out.format("%c", s.charAt(i) | ' ');
		}
		System.out.println();
	}
	
	public static int maxInteger1() {
		return (1 << 31) - 1;
	}
	
	public static int maxInteger2() {
		return ~(1 << 31);
	}
	
	public static int minInteger1() {
		return (1 << 31);
	}

	public static int minInteger2() {
		return (1 << -1);
	}
	
	public static int multipliedBy2(int n) {
		return n << 1;
	}
	
	public static int divideBy2(int n) {
		return n >> 1;
	}

	public static int powerByPowerOf2(int n, int power) {
		return n << power;
	}
	
	public static int divideByPowerOf2(int n, int power) {
		return n >> power;
	}
	
	public static boolean isOddNumber(int n) {
		return (n & 1) == 1;
	}
	
	public static void exchangeTwoNumbers(int a, int b) {
		System.out.format("Before: a=%d, b=%d\n", a, b);
		
		a ^= b;
		b ^= a;
		a ^= b;
		
		System.out.format("After: a=%d, b=%d", a, b);
	}
}
