package bitManipulation;

public class PowerOfFour {

	public static void main(String[] args) {
		int x = -2147483648; 
		System.out.println(isPowerOfFour2(x));
	}
	
    public static boolean isPowerOfFour2(int num) {
    	int count = 1;
        if ((num & (num - 1)) == 0) {
        	while (num > 1) {
        		num >>= 1;
        		count += 1;
        	}
        	
        	return count % 2 == 1; 
        }
        
        return false;
    }
    
    public static boolean isPowerOfFour(int num) {
    	if (num < 0) {
        	while (num < -1) {
        		if (num % 4 != 0) {
        			return false;
        		} else {
        			num /= 4;
        		}
        	}
        	
        	return num == -1;
    	} else {
        	while (num > 1) {
        		if (num % 4 != 0) {
        			return false;
        		} else {
        			num /= 4;
        		}
        	}
        	
        	return num == 1;
    	}
    }
}
