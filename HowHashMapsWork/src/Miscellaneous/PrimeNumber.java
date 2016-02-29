package Miscellaneous;

public class PrimeNumber {

	public static void main(String[] args) {
		int number = 4;
		if (isPrime(number)) {
			System.out.format("%d is prime!", number);
		} else {
			System.out.format("%d is not prime!", number);
		}
		
		for (int i = 1; i < 100; i++){
			if (isPrime(i)) {
				System.out.format("%d is prime!", i);
			} else {
				System.out.format("%d is not prime!", i);
			}
			System.out.println();
			if (isPrimeRecursive(i, 2)) {
				System.out.format("%d is prime!", i);
			} else {
				System.out.format("%d is not prime!", i);
			}
			System.out.println();
		}
	}
	
	public static boolean isPrime(int number) {
		if (number == 2 || number == 1) {
			return true;
		}
		
		for (int k = 2;k <= number/2;k++){
			if (number % k == 0) {
				return false;
			}
		}
		
		return true;
	}

	public static boolean isPrimeRecursive(int number, int k) {
		if (number == 2 || number == 1) {
			return true;
		}
		
		if (k > Math.sqrt(number)) {
			return true;
		}
		
		return (!(number % k == 0) && isPrimeRecursive(number, k+1));
	}
}
