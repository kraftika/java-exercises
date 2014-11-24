package euler.problems;

public class ThreeAndFive {

	public static void main(String[] args) {
		int limit = 1000;
		long sum = 0;
		boolean foundIt = false;

		for (int i=2;i < limit; i++){
			if ((i % 3)==0){
				sum+=i;
				foundIt = true;
				System.out.print(i + " ");
			}

			if (!foundIt && (i % 5)==0){
				sum+=i;
				System.out.print(i + " ");
			}
			foundIt = false;
		}
		System.out.println("sum: " + sum);
	}

}
