package assignment1;

public class Person extends Entity {

	private String gender;
	
	public Person(String date, Date born, String gender, double difficulty) {
		
		super(date, born, difficulty);
		this.gender = gender;
	}
	
	// Copy constructor.
	Person(Person person) {
		
		super(person);
	}
		
	// Returns information about person.
	public String toString() {
		
		String message = "\nName: " + getName() +
						   "\nBorn: " + getBorn() + 
						   "\nGender: " + getGender() +
						   "\n*************************";
	
			return message;
		}

	// Returns gender of person.
	public String getGender() {
		
		String Gender = gender;
		return Gender;
	}
		
		
	// Returns object clone of person.
	public Entity clone() {
		
		Person person = new Person(this);
		return person;
	}

	// Returns entity type, Person.
	public String entityType() {
		
		String message = "This entity is a person!";
		return message;
	}
}
