package BasicPractice;
import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("기본급여를 입력하세요 (기본단위 만원) : ");
		int pay = sc.nextInt();
		System.out.println("시간수당을 입력하세요 : ");
		int overpay = sc.nextInt();
		System.out.println("세금은 10% 입니다.");
		int tax = (pay / 10);
		
		int realpay = pay + overpay - tax;
		
		System.out.println("실수령액 : " + realpay + "만원");

	}

}
