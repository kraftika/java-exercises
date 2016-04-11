package bit.manipulation;

public class PowerOfTwo {

  public static void main(String[] args) {
    int d = 10;
    System.out.println(checkIf(d));
  }
  
  public static boolean checkIf(int n) {
    boolean isPowerOfTwo = (n & (n-1)) == 0;
    return isPowerOfTwo;
  }
}
