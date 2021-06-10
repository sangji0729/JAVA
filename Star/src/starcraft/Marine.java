package starcraft;

import java.util.Scanner;

public class Marine extends Terran{

	int steampack = 10;
	
	public Marine(String name, String clan, int strength, int power) {
		super(name, clan, strength, power);
		
		
	}
	
	public void steam() {
		Scanner sc = new Scanner(System.in);
		System.out.println("스팀팩 투여");
		System.out.println("1. 예");
		System.out.println("2. 아니오");
		int input = sc.nextInt();
		
		if(input == 1) {
			System.out.println("스팀팩을 투여합니다.");
			steampack = steampack - 10;
			strength = strength - 10;
			power = power + 10;
		}else {
			System.out.println("스팀팩 투여를 취소합니다.");
		}sc.close();
	}
	 
	
	
	public void announce() {
		System.out.println("현재 체력은 " + strength + " 스팀팩 잔여량은 " + steampack + " 전투력은 " + power);
	}

}
