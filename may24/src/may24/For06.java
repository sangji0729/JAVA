package may24;

import java.util.Scanner;

//숫자 맞추기
/* 컴퓨터가 랜덤한 숫자 두자리수를 뽑습니다.
 * 사용자가 숫자를 입력하면 UP/DOWN을 출력하고
 * 일치한다면 "축하합니다"라고 출력하면서 출력종료하는 프로그램
 * 	1.for문으로 20번 실행하기
 *  2.일치하면 for문 강제종료하고 프로그램 종료
 *  
 */
public class For06 {

	public static void main(String[] args) {
		// 컴퓨터가 숫자 뽑기
		// 사용자 입력 대기
		// for문으로 20번 검사하기
		// 사용자 숫자가 적다면 UP
		// 사용자 숫자가 크다면 DOWN
		// 일치한다면 "축하합니다" 출력후 프로그램 종료
		int random = (int)(Math.random()* 99 + 1);
		Scanner sc = new Scanner(System.in);
		
		
		for(int i = 0; i < 20; i++) {
			System.out.print("숫자를 입력하세요.");
			int input = sc.nextInt();
			
			if(input == random) {
				System.out.println("축하합니다! \n프로그램을 종료합니다.");
				break;
			}else if(input < random) {
				System.out.println("UP");
				
			}else if(input > random) {
				System.out.println("DOWN");
				
			}
		}
		sc.close();
	}

}
