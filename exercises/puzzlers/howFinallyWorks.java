package puzzlers;

public class howFinallyWorks {

	public static void main(String[] args) {
		try {
			System.out.println("Try");
//			System.exit(0);
			/* Return implies to run finally */ 
//			return;
		}
		catch(Exception e1) {
			System.out.println("catch");
		}
		finally {
			System.out.println("Finally");
		}
	}

}
