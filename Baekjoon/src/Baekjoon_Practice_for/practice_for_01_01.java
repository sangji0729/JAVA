package Baekjoon_Practice_for;
import java.util.Scanner;

public class practice_for_01_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i;
		System.out.println("구구단을 원하시는 값을 입력해주세요.");
		int n = sc.nextInt();
		
		for (i = 1; i < 10; i ++) {
			System.out.println(n + " X " + i + " = " + (n * i));
		}
			

	}

}
