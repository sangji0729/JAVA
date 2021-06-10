package starcraft;

public class StarCraftUnit {
	public String name;
	public String clan;
	public int strength;
	public int power;
	
	public StarCraftUnit(String name, String clan, int strength, int power) {
		this.name = name;
		this.clan = clan;
		this.strength = strength;
		this.power = power;
		
	}
	public void attack() {
		System.out.println(clan + "종족" + " " + name + "이 공격합니다");
	}
	
}
