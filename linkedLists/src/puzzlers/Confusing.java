package puzzlers;

public class Confusing {

	private Confusing(Object obj) {
		System.out.print("Object is called");
	}
	
	private Confusing(Double[] array) {
		System.out.print("Double is called");
	}
	
	public static void main(String[] args) {
		new Confusing(null);
	}

}
