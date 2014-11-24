package euler.problems;

public class SmallestMultiple {

	public static void main(String[] args) {
		// The numer we are looking for
		long mnumber = 20;
		// First 20s numbers that is divided by number
		int limit = 20;
		boolean found = false;
		int[] multiples = new int[20];
		
		for (int k=0;k<limit;k++){
			multiples[k] = 0;
		}
		
		while(!found) {
			for(int k=2;k<=limit;k++){
				if (mnumber%k > 0){
					break;
				}
				else {
					multiples[k-1] = 1;
				}
			}
			
			if (mnumber > 630000000){
				System.out.println("Multiple number not found");
				break;
			}
			
			if (isValid(multiples)){
				found = true;
				System.out.println(mnumber);
			}
			else {
				multiples = cleanMultiples(multiples);
				mnumber++;	
			}
		}
	}
	
	public static int[] cleanMultiples(int[] ar) {
		for (int k=0;k<ar.length;k++){
			ar[k] = 0;
		}
		
		return ar;
	}
	
	public static boolean isValid(int[] ar) {
		boolean isValid = false; 
				
		for (int k=2;k<ar.length;k++){
			if (ar[k] == 1) {
				isValid = true;
			}
			else {
				isValid = false;
				break;
			}
		}
		
		return isValid;
	}
}
