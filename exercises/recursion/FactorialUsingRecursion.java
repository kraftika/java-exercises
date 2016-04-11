package recursion;

public class FactorialUsingRecursion {

	public static void main(String[] args) {
		long result = Factorial(19);
		System.out.println(result);
	}
	
	public static long Factorial(long n){
		// Stop condition
		if (n == 1){
			return n;
		}
		else {
			n = n * Factorial(n-1);
			return n;
		}
	}

}
