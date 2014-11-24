package euler.problems;
/*
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
What is the 10 001st prime number?
*/

public class FirstPrimeNumberOneThousand {

	public static void main(String[] args) {
		int counterOfPrimeNumbers = 10001;
		int counter = 1;
		long limitNUmbers = 60000000, number = 2;

		if (counterOfPrimeNumbers == 0){
			System.out.println("You didn't selected how many prime numbers would you like to count.");
			return;
		}
		
		while(number < limitNUmbers){
			if (isPrime(number)){
				counter++;
			}
			
			if (counter > counterOfPrimeNumbers){
				break;
			}
			
			number++;
		}
		
		System.out.println(number);
	}
	
	public static boolean isPrime(long number){
		boolean isPrime = true;
		
		for(int k = 2;k<(number/2)+1;k++){
			if (number%k == 0){
				isPrime = false;
				break;
			}
		}
		
		return isPrime;
	}

}
