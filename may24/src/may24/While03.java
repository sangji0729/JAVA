package may24;

import java.util.Scanner;

public class While03 {
//while문을 이용하여 숫자게임을 만들어주세요.
	
	public static void main(String[] args) {
		//System.in.read(); 한글자밖에못씀
		Scanner sc = new Scanner(System.in);

		//사용자 비교
		
		//컴 두자리 숫자 뽑기
		int com = (int)(Math.random() * 99 + 1);
		int count = 0;
		//While로 비교
		boolean run = true;
		while(run) {
			System.out.println("숫자를 입력하세요.");
			int input = sc.nextInt();
			count++;
			
			if(input > com) {
				System.out.println("DOWN");
			}else if(input < com) {
				System.out.println("UP");
			}else if(input == com) {
				System.out.println("축하합니다. 입력하신 횟수는 : " + count + " 입니다.");
				System.exit(0);
				
			}
			
		}
		sc.close();
		//UP/DOWN/ 일치하면 "축하합니다" 프로그램 종료
		//몇번 시도했는지 프로그램 종료후 출력
		
	}

}
