package Baekjoon_Practice_for;
import java.util.Scanner;

public class practice_for_01_02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	    System.out.println("배열 갯수를 입력하세요.");
		int c = sc.nextInt();
		int arr[] = new int[c];
		
		for (int i = 0; i < c; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr[i] = a + b;
		}
		sc.close();

		for (int k : arr) {
			System.out.println(k);
		}
	}

}
