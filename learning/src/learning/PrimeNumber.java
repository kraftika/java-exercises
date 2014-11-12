package learning;

public class PrimeNumber {

	public static void main(String[] args) {
		int n = 29;
		boolean isPrimeNumber = true;
		
		for (int i = 2; i<(n/2+1); i++){
			if (n % i == 0){
				isPrimeNumber = false;
				break;
			}
		}
		
		System.out.println("Is prime number? " + (isPrimeNumber?"Yes":"No"));
	}

}
