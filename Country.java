package assignment1;

public class Country extends Entity{

	private String capital;
	
	public Country(String date, Date born, String capital, double difficulty) {
		super(date, born, difficulty);
		this.capital = capital;
	}
	
	Country(Country country){
		
		super(country);
		this.capital = country.capital;
	}
	
	public String toString() {
		
		String n = "\nName: " + getName() +
						   "\nBorn: " + getBorn() + 
						   "\nCapital: " + capital +
						   "\n*************************";
		
		return n;
	}
	
	// Clone of object country 
	public Entity clone() {
		
		Country country = new Country(this);
		return country;
	}
		
	// Returns entity type(person, singer, politician, etc)
	public String entityType() {
		
		String type = "This entity is a country!";
		return type;
	}
}
