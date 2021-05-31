package may21;
//가위 바위 보 게임을 만들겠습니다
//컴퓨터와 사람이 같이 가위/바위/보 중에 하나를 내고
//if문으로 승패 여부를 출력해주세요.

import java.util.Scanner;

public class If07 {

	public static void main(String[] args) {
		//1. 사용자의 입력 받기 = Scanner
		//데이터타입 변수명 = 값;
		
		
		
		Scanner sc = new Scanner(System.in); //객체 생성
		System.out.println("============================");
		System.out.println("1. 가위\t2. 바위\t3. 보");//tab
		System.out.println("원하시는 번호를 눌러주세요!");
		System.out.println("============================");
		
		int user = sc.nextInt();
		
		//2. 컴퓨터 숫자 저장하기
		int com = (int)(Math.random() * 3 + 1);
		
		//3. 판정하기 & 출력하기
		//당신이 이겼습니다.
		//컴퓨터가 이겼습니다.
		//비겼습니다.
		
		if(user == com) {
			
			System.out.println("당신이 낸 숫자 : " + user);
			System.out.println("컴퓨터가 낸 숫자 : " + com);
			System.out.println("비겼습니다.");
			
		}else if((user == 1 && com == 2) || (user == 2 && com == 3)||(user == 3 && com == 1)) {
			
			System.out.println("당신이 낸 숫자 : " + user);
			System.out.println("컴퓨터가 낸 숫자 : " + com);
			System.out.println("컴퓨터가 이겼습니다.");
			
		}else {
			
			System.out.println("당신이 낸 숫자 : " + user);
			System.out.println("컴퓨터가 낸 숫자 : " + com);
			System.out.println("당신이 이겼습니다.");
		}
		
	
		sc.close();
		

	}

}
