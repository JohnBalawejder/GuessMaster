package assignment1;

public abstract class Entity {
	private String name;
	private Date born;
	private double difficulty;
	
	public Entity(String name, Date birthDate, double difficulty) {
		this.name = name;
		this.born = new Date(birthDate); //no privacy leak
		this.difficulty = difficulty;
	}
	
	public Entity(Entity entity) {
		this.name = entity.name;
		this.born = new Date(entity.born); //no privacy leak
		this.difficulty = entity.difficulty;
	}

	public String getName() {
		return name;
	}

	public Date getBorn() {
		return new Date(born);
	}
	
	public String toString() {
		return "Name: "+name+"\n"+"Born at: "+born.toString()+"\n";
	}
	
	
	public int getAwardedTicketNumber() {
		
		return (int) (difficulty * 100);
	}
	
	public abstract String entityType();
	
	public abstract Entity clone();
	
	public String welcomeMessage() {
		
		String message = "Welcome! Let's start the game! " + entityType() + ".";
		return message;
	}
	
	public String closingMessage() {
		
		return "Congratulations! The detailed information of the entity you guess is: " + toString() + ".";
	}
}
