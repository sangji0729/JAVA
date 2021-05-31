package Baekjoon_Practice_if;
import java.util.Scanner;

public class practice_if_01_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("X의 값을 입력하세요.");
		int x = sc.nextInt();
		System.out.println("Y의 값을 입력하세요.");
		int y = sc.nextInt();
		
		if(x > 0) {
			if(y > 0) {
				System.out.println("1사분면 입니다.");
		}else {
			System.out.println("4사분면 입니다.");
		}
	}
	
	else{
		if(y > 0) {
			System.out.println("2사분면 입니다.");
		}else {
			System.out.println("3사분면 입니다.");
		}
	  }
	}
}
