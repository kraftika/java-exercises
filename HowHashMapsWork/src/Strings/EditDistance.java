package Strings;

public class EditDistance {

  public static void main(String[] args) {
    String s1 = "abc";
    String s2 = "sabc";

    System.out.println(editDistanceOne(s1, s2));
    
    if (isEditDistanceOne(s1, s2)) {
      System.out.format("Edit distance between %s and %s is 1", s1, s2);
    } else {
      System.out.format("Edit distance between %s and %s is not 1", s1, s2);
    }
  }
  
  public static int editDistanceOne(String s1, String s2) {
    int n = s1.length();
    int m = s2.length();

    int i = 0;
    int j = 0;
    int editCount = 0;

    while (i < n && j < m) {
    	if (s1.charAt(i) != s2.charAt(j)) {
        editCount++;
                
        if (n < m) {
          j++;
        } else if (n > m) {
          i++;
        }
      } else {
        i++;
        j++;
      }    	
    }
    
  	if (i == n && j < m) {
  		editCount += s2.length() - s1.length();
  	}
  	
  	if (j == m && i < n) {
  		editCount += s1.length() - s2.length();
  	}

    return editCount;
  }

  public static boolean isEditDistanceOne(String s1, String s2) {
    int n = s1.length();
    int m = s2.length();

    if (Math.abs(n - m) > 1) {
      return false;
    }

    int i = 0;
    int j = 0;
    int editCount = 0;

    while (i < n && j < m) {
    	if (s1.charAt(i) != s2.charAt(j)) {
        editCount++;
                
        if (n < m) {
          j++;
        } else if (n > m) {
          i++;
        }
      } else {
        i++;
        j++;
      }
    }
    
    if (n < m && s1.substring(0).equals(s2.substring(0, n))) {
    	editCount++; 
    }

    return editCount == 1;
  }
}
