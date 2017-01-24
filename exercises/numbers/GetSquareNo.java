package numbers;

public class GetSquareNo {

	public static void main(String[] args) {
		System.out.println(square(13));
	}
	
	public static float square(int x) {
		float low = 0;
		float high = 1 + x/2;
		float mid = 0;
		float sq = 0;
				
		while(high - low > 0.000001) {
			mid = low + (high - low)/2;
			sq = mid * mid;
			
			if (sq < x) {
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
