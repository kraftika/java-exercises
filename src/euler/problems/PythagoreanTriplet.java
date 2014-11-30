package euler.problems;

/*
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a2 + b2 = c2
For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
 */

public class PythagoreanTriplet {

	public static void main(String[] args) {
		optimalSolution();
	}
	
	public static void optimalSolution(){
		int a = 0, b = 0, c = 0;
		boolean founded = false;
		int mLimit = 1000;
		
		long start = System.currentTimeMillis();
		for (int i = 1; i <= mLimit; i++){
			for (int j = i; j <= mLimit; j++){
				c = mLimit - i - j;
				if (i*i + j*j == c*c){
					System.out.format("The triplet is a = %d, b = %d, c = %d", i, j, c);
					founded = true;
					break;
				}
			}
			if (founded){
				break;
			}
		}
		System.out.println();
		System.out.format("Elapsed time: %d ms", System.currentTimeMillis() - start);
	}
	
	public static void bruteForce(){
		int a = 0, b = 0, c = 0;
		boolean founded = false;
		
		long start = System.currentTimeMillis();
		for (int i = 1; i <= 1000; i++){
			for (int j = 1; j <= 1000; j++){
				for (int k = 1; k<= 1000; k++){
					Triplet triplet = new Triplet(i, j, k);
					
					if (triplet.getA() > 0 
						&& triplet.getB() > 0 
						&& triplet.getC() > 0 
						&& triplet.getA() < triplet.getB() 
						&& triplet.getB() < triplet.getC() 
						&& isPythagorean(triplet) && isSum1000(triplet)){
						System.out.format("The triplet is a = %d, b = %d, c = %d", triplet.getA(), triplet.getB(), triplet.getC());
						founded = true;
						break;
					}
				}
				if (founded){
					break;
				}
			}
			if (founded){
				break;
			}
		}
		System.out.println();
		System.out.format("Elapsed time: %d ms", System.currentTimeMillis() - start);
	}
	
	public static boolean isPythagorean(Triplet t){
		return t.getC() * t.getC() == t.getA() * t.getA() + t.getB() * t.getB();
	}
	
	public static boolean isSum1000(Triplet t){
		return t.getC() + t.getA() + t.getB() == 1000;
	}
}

class Triplet {
	int a;
	int b;
	int c;
	
	public Triplet(int a, int b, int c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public int getA(){
		return a;
	}
	
	public void setA(int a){
		this.a = a;
	}

	public int getB(){
		return b;
	}
	
	public void setB(int b){
		this.b = b;
	}

	public int getC(){
		return c;
	}
	
	public void setC(int c){
		this.c = c;
	}
}
