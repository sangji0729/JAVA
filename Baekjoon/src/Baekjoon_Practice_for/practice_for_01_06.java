package Baekjoon_Practice_for;
import java.util.Scanner;

public class practice_for_01_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		
		
		for(int i = 1; i <= a; i++) {
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			System.out.println("case #" + i + ": " + b + " + " + c + " = " + (b+c));
		}

	}

}
