package Baekjoon_Practice_if;
import java.util.Scanner;

public class practice_if_01_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 수를 입력하세요.");
		int a = sc.nextInt();
		System.out.println("두번째 수를 입력하세요.");
		int b = sc.nextInt();
		
		int result = (a - b);
		
		if(a > b) {
			System.out.println(">" + " " + "첫번째 입력값이 두번째 입력값보다 " + result + "만큼 큽니다.");
		}else if(a < b) {
			System.out.println("<" + " " + "첫번째 입력값이 두번째 입력값보다 " + result + "만큼 작습니다.");
		}else {
			System.out.println("=" + " 두 수의 값이 같습니다.");
		}
	}

}
