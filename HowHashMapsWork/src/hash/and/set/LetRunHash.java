package hash.and.set;
import java.util.HashMap;
import java.util.Iterator;


public class LetRunHash {
  public static void main (String[] args) {
	    Country india1 = new Country("India", 1000);
//	    Country india2 = new Country("India", 3000);

	    Country japan = new Country("Japan", 10000);

	    Country france = new Country("France", 2000);
	    Country russia = new Country("Russia", 20000);
	    long creditCardNumber = 1234_5678_9012_3456L;
	    System.out.print(creditCardNumber);
	    
	    byte mask = (byte) 0xf;
	    System.out.println(mask);

	    HashMap<Country, String> countryCapitalMap = new HashMap<Country, String>();
	    countryCapitalMap.put(india1, "Delhi");
	    countryCapitalMap.put(japan, "Dehli");
	    countryCapitalMap.put(france, "Paris");
	    countryCapitalMap.put(russia, "Moscow");

	    Iterator<Country> countryCapitalIter = countryCapitalMap.keySet().iterator();//put debug point at this line
	    while (countryCapitalIter.hasNext()) {
	      Country countryObj = countryCapitalIter.next();
	      System.out.println(countryObj.hashCode());
	      String capital = countryCapitalMap.get(countryObj);
	      System.out.println(countryObj.getName() + "----" + capital);
	    }
	  }
}
