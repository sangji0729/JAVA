package Baekjoon_Practice_for;
import java.util.Scanner;

public class practice_for_01_03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i;
		int result = 0;
		for(i = 1; i <= n; i++) {
		     result += i;
			System.out.println(result);
		}

	}

}
