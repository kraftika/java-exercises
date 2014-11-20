package data.structures;

public class HowDeepIsYourStack {
	
	private static long count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountStackSpace(0);
	}
	
	public static void CountStackSpace(long a){
		System.out.println(count++);
		CountStackSpace(a);
	}
}
