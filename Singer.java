package assignment1;

public class Singer extends Person{

	private String debutAlbum;
	private Date debutAlbumReleaseDate;
	
	// Constructor
	public Singer(String date, Date born, String gender, String album, Date release, double difficulty) {
		
		super(date, born, gender, difficulty);
		debutAlbum = album;
		debutAlbumReleaseDate = release;
	}
	
	// Copy constructor
	Singer(Singer singer) {
		
		super(singer);
	}
	
	// Returns information about singer
	public String toString() {
		
		String message = "\nName: " + getName() +
						   "\nBorn: " + getBorn() + 
						   "\nGender: " + getGender() +
						   "\nDebut Album: " + debutAlbum +
						   "\nDebut Album Release Date: " + debutAlbumReleaseDate + 
					       "\n*************************";
		return message;
	}
	
	// Returns clone of singer
	public Entity clone() {
		
		Singer singer = new Singer(this);
		return singer;
	}

	// Returns entity type, singer
	public String entityType() {
		
		String message = "This entity is a singer!";
		return message;
	}
}
