package sungwoo.practice;

class Car {
	int gasolineGauge;
	public Car(int oil) {
		gasolineGauge = oil;
	}
	
}
class HybridCar extends Car {
	int electricGauge;
	public HybridCar(int oil, int elec) {
		super(oil);
		electricGauge = elec;
	}
	
}
class HybridWaterCar extends HybridCar {
	int WaterGauge;
	public HybridWaterCar(int oil, int elec, int wat) {
		super(oil, elec);
		WaterGauge = wat;
	}
	public void showCurrentGauge() {
		System.out.println("잔여 가솔린: " + gasolineGauge);
		System.out.println("잔여 전기량: " + electricGauge);
		System.out.println("잔여 워터량: " + WaterGauge);
	}
}
public class practice14_1 {

	public static void main(String[] args) {
	    HybridWaterCar fuel = new HybridWaterCar(10, 6, 4);
	      fuel.showCurrentGauge();
	    HybridWaterCar fuel2 = new HybridWaterCar(9, 4, 6);
	    fuel2.showCurrentGauge();
	    
	}

}
