package euler.problems;
/*
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * 
 * What is the largest prime factor of the number 600851475143 ?
 */
public class LargestPrimeNumber {

	public static void main(String[] args) {
		double n = 600851475143.d;
		
		for (double i = 2; i < n/2; i++){
			if (isPrime(i) && (n%i == 0)){
				System.out.println(i);
			}
		}
	}
	
	public static boolean isPrime(double number){
		for(int i=2; i<=number/2; i++){
			if (number%i == 0){
				return false;
			}
		}
		
		return true; 
	}
}
