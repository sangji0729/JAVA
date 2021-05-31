package BasicPractice;

public class Practice01 {

	public static void main(String[] args) {
		int money = 65430;
		
		int a, b, c, d;
		
		System.out.println("money : " + money);
		a = (money/10000);
		money -= a * 10000;
		b = (money/1000);
		money -= b * 1000;
		c = (money / 100);
		money -= c * 100;
		d = (money / 10);
		money -= d * 10;
		System.out.println("만원 : " + a);
		System.out.println("천원 : " + b);
		System.out.println("백원 : " + c);
		System.out.println("십원 : " + d);
		
	}
	

}
