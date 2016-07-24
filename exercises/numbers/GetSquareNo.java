package numbers;

public class GetSquareNo {

	public static void main(String[] args) {
		System.out.println(square(9));
	}
	
	public static long square(int x) {
		long low = 0;
		long high = 1 + x/2;
		long mid = 0;
		long sq = 0;
				
		while(low < high + 1) {
			mid = (low + high)/2;
			sq = mid *mid;
			
			if (sq < low) {
				low = mid;
			} else if (sq == x) {
				return mid;
			} else {
				high = mid;
			}
		}
		
		return low;
	}
}
