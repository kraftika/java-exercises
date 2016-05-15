package bitManipulation;

import java.util.ArrayList;
import java.util.Arrays;

public class PowerOfTwo {

  public static void main(String[] args) {
    int d = 32;
    System.out.println(checkIfPowerOfTwo(d));
    System.out.println(isPowerOfTwo(d));
  }
  
  public static boolean checkIfPowerOfTwo(int n) {
	  return (n > 0) && ((n & (n-1)) == 0);
  }
  
  public static boolean isPowerOfTwo(int n) {
	  return (n > 0) && ((n & -n) == n);
  }
}
