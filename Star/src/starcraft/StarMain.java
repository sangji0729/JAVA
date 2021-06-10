package starcraft;

public class StarMain {

	public static void main(String[] args) {
		
		Marine marine = new Marine("마린", "테란", 100, 50);
		
		marine.clan = "테란";
		marine.steam();
		marine.attack();
		marine.announce();
		
		
	}

}
