
public class NumberOfCoins {

	public static void main(String[] args) {
		int s = 11;
		int[] coins = {1, 3, 5}; 
		getOptimalNoOfCoins(s, coins);
	}
	
	public static void getOptimalNoOfCoins(int s, int[] c) {
		int[] min = new int[10];
		
		for (int i = 0; i < min.length; i++) {
			min[i] = Integer.MAX_VALUE;
		}
		
		for(int i = 1; i <= s; i++) {
			for(int j = 0; j < c.length; j++) {
				if (c[j] <= i && min[i - c[j]] < min[i]) {
					min[i] = min[i -c[j]] + 1;
				}
			}
		}
		
		for (int i = 0; i < min.length; i++) {
			System.out.println(min[i]);
		}
	}
}
