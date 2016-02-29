package hash.and.set;

public class Country {
	  private String name;
	  private int population;

	  public Country(String name, int population){
	    super();
	    this.name = name;
	    this.population = population;
	  }

	  public String getName() {
	    return name;
	  }

	  public int getPopulation() {
	    return population;
	  }

	  public void setName(String name) {
	    this.name = name;
	  }

	  public void setPopulation(int population) {
	    this.population = population;
	  }

	  @Override
	  public int hashCode() {
	    if (this.name.length() % 2 == 0) {
	      return 31;
	    } else {
	      return 95;
	    }
	  }

	  @Override
	  public boolean equals(Object obj) {
	    Country other = (Country) obj;
	    if (name.equalsIgnoreCase((other.name))) {
	      return true;
	    }
	    return false;
	  }
}
