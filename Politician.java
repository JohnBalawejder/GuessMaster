package assignment1;

public class Politician extends Person{
	
	private String party;
	
	// Constructor
	public Politician(String date, Date born, String gender, String party, double difficulty) {
		
		super(date, born, gender, difficulty);
		this.party = party;
	}
	
	// Copy constructor
	Politician(Politician person) {
		super(person);
	}
	
	// Returns information about politician
	public String toString() {
		String message = "\nName: " + getName() +
							"\nBorn: " + getBorn() + 
							"\nGender: " + getGender() +
							"\nParty: " + party +
							"\n*************************";
		return message;
	}
	
	// Returns clone of politician 
	public Entity clone() {
		
		Politician person = new Politician(this);
		return person;
	}

	// Returns entity type, politician
	public String entityType() {
		
		String message = "This entity is a politician!";
		return message;
	}
}
