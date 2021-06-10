package starcraft;

public class Protoss extends StarCraftUnit implements Action {

	int shield;
	
	public Protoss(String name, String clan, int strength, int power, int speed, int shield) {
		super(name, clan, strength, power, speed);
		this.shield = shield;
	}

	@Override
	public void attack() {
	}

	@Override
	public void Damaged() {
	}

	@Override
	public void result() {
	}
	
}

