package assignment1;

import java.util.Random;
import java.util.Scanner;

public class GuessMaster {
	
	private int numOfEntities;
	private Entity[] entities;
	private int tickets = 0;
	
	public GuessMaster() {
		numOfEntities = 0;
		entities = new Entity[100]; 
	}

	public void addEntity(Entity entity) {
		
		for(int i = 0; i < entities.length; i++) {
			if(entities[i] == null) {
				entities[i] = entity;
				numOfEntities++;
				return;
			}
		}
	}
	
	public void playGame(int entityId) {
		Entity entity = entities[entityId];
		playGame(entity);
	}
	
	
	public void playGame(Entity entity) {
		
		System.out.println("\n***************************");
		System.out.println(entity.welcomeMessage());
		
		System.out.printf("\nGuess %s's birthday\n", entity.getName());
		System.out.println("(mm/dd/yyyy)");
		
		Scanner scanner = new Scanner(System.in);
		

		while (true) {
			String answer = scanner.nextLine();
			answer = answer.replace("\n", "").replace("\r", "");

			if (answer.equals("quit")) {
				System.exit(0);
			}

			Date date = new Date(answer);

			if (date.precedes(entity.getBorn())) {
				System.out.println("Incorrect. Try a later date.");
			} else if (entity.getBorn().precedes(date)) {
				System.out.println("Incorrect. Try an earlier date.");
			} else {
				Random random = new Random();
				int rd = random.nextInt(50);
				rd += 50; 
//				for(int i=0; i<=50*100; i++)
//					System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n");
				System.out.println("*************Bingo!***************");
				System.out.printf("You won " + entity.getAwardedTicketNumber() + " tickets in this round.\n");
				tickets += entity.getAwardedTicketNumber();
				System.out.println("The total number of your tickets is " + tickets + ".");
				System.out.println("***************************");
				System.out.println(entity.closingMessage());
				break;
			}
		}
	}
	
	public void playGame() {
		while (true) {
			int entityId = genRandomEntityId();
			playGame(entityId);
		}
	}

	public int genRandomEntityId() {
		Random randomNumber = new Random();
		return randomNumber.nextInt(numOfEntities);
	}

	public static void main(String[] args) {
		
		System.out.println("=========================\n");
		System.out.println("     GuessMaster 2.0 \n");
		System.out.println("=========================");
		Politician trudeau = new Politician("Justin Trudeau", new Date("December", 25, 1971), "Male", "Liberal", 0.25);
		Singer dion = new Singer("Celine Dion", new Date("March", 30, 1961), "Female", "La voix du bon Dieu", new Date("November", 6, 1981), 0.5);
		Person myCreator = new Person("myCreator", new Date("September", 1, 2000), "Female", 1);
		Country usa = new Country("United States", new Date("July", 4, 1776), "Washington D.C.", 0.1);

		GuessMaster gm = new GuessMaster();
		
		gm.addEntity(trudeau);
		gm.addEntity(dion);
		gm.addEntity(myCreator);
		gm.addEntity(usa);
		
		gm.playGame();
	}
}