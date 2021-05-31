package Baekjoon_Practice_if;
import java.util.Scanner;

public class practice_if_01_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("시간을 입력하세요.");
		int H = sc.nextInt();
		System.out.println("분을 입력하세요.");
		int M = sc.nextInt();
		sc.close();
		
		if(M < 45) {
			H--;
			M = 60 - (45 - M);
			if(H < 0) {
				H = 23;
			} System.out.println(H + " " + M);
		}else {
			System.out.println(H + " " + (M - 45));
		}
	}

}
