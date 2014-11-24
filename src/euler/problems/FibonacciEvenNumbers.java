package euler.problems;

public class FibonacciEvenNumbers {
	
	public static void main(String[] args) {
		long maxLimit = 4000000;
		long sumEvenNo = 0;
		long minus1 = 2;
		long minus2 = 1;
		long nextfibonacciNumber = minus1;
		
		while (nextfibonacciNumber < maxLimit){
			if (nextfibonacciNumber % 2 == 0){
				sumEvenNo += nextfibonacciNumber;
				System.out.println("Even " + nextfibonacciNumber);
				System.out.println("Sum " + sumEvenNo);
			}
			nextfibonacciNumber = minus1 + minus2;
			minus2 = minus1;
			minus1 = nextfibonacciNumber;
			
			//System.out.print(minus2 + " " + nextfibonacciNumber + " ");
		}
		
		System.out.println("The sum is " + sumEvenNo);
	}
}
