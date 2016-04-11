package euler;

/*
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

   Find the sum of all the primes below two million.
 */

public class SummationOfPrimes {

	public static void main(String[] args) {
		long number = 2000000; 
		
		long start = System.currentTimeMillis();
		System.out.println(getSumOfPrimeNumberUntil(number));
		long end = System.currentTimeMillis();
		System.out.println("Elapsed time: " + (end - start) + "	ms" );
	}
	
	public static long getSumOfPrimeNumberUntil(long n){
		/*
		 * 2 and 3 are prime numbers
		 */
		long sum = 5;
		
		for (int k = 5; k <= n; k++){
			if (isPrime(k)){
				sum += k;				
			}
		}
		
		return sum;
	}
	
	public static boolean isPrime(int number){
		boolean isPrime = true;
		
		for(int k=2;k <= Math.sqrt(number); k++){
			if (number % k == 0){
				isPrime  = false;
				break;
			}
		}
		
		return isPrime;
	}
}
