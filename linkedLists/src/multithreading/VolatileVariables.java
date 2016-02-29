package multithreading;

public class VolatileVariables {

	public static class Counter {
		static int counter = 0;
		
		public synchronized void increment() {
			counter++;
		}
		
		public synchronized void decrement() {
			counter--;
		}
		
		public static synchronized int value() {
			return counter;
		}
	}
	
	static Counter c = new Counter();
	public static class IncrementCounter implements Runnable{
		
		public void run() {
			System.out.println("Increment counter started...");
			for(int i=0; i< 10; i++) {
				c.increment();
				System.out.println("Increment -> " + c.value());
			}
		}
	}
	
	public static class DecrementCounter implements Runnable {
		
		public void run() {
			System.out.println("Decrement counter started...");
			for(int i=0; i< 10; i++) {
				c.decrement();
				System.out.println("Decrement -> " + c.value());
			}
		}
	}
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new IncrementCounter(), "Increment thread");
		Thread t2 = new Thread(new DecrementCounter(), "Decrement thread");
		
		t1.start();
		t2.start();
	}
}
