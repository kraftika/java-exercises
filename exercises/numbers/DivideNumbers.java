package numbers;

public class DivideNumbers {
  public static void main(String[] args) {
    int a = 2;
    int b = 5;
    String result;

    int remainder;
    int quotient;
    if (a > b) {
    	quotient = getQuotient(a, b);
    } else {
    	quotient = 0;
    }
    result = String.valueOf(quotient);

    if (a == b) {
      System.out.println("Division result: 1");
    } else {
      if (a > b) {
    	  remainder = a - quotient*b;  
      } else {
    	  remainder = a;
      }
      
      if (remainder != 0) {
    	  result += ".";
      }
      
      int stopCounter = 0;
      while (remainder > 0 && stopCounter < 10) {
        quotient = getQuotient(remainder*10, b);
        result += String.valueOf(quotient);
        remainder = remainder*10 - quotient*b;
        stopCounter++;
      }
    }

    System.out.println(result);
  }

  public static int getQuotient(int a, int b) {
    int q = 0;
    int r = a;

    if (a < b) {
      return 0;
    }

    while(r >= b){
      r -= b;
      q++;
    }

    return q;
  }
}

