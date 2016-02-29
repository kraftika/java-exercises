package bit.manipulation;

public class BasicOperators {
	public static void main(String[] args){
		int x = -4;
		System.out.println(Integer.toBinaryString(x>>1));
		int x1 = 4;
		System.out.println(x1>>1);
		
		int x2 = -1;
		System.out.println(Integer.toBinaryString(x2));
		int x3 = 4;
		System.out.println(Integer.toBinaryString(x2>>>1));
	}
}
