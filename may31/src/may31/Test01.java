package may31;

import java.util.Arrays;
import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		
		//배열에다 결과를 저장
		//저장 : 승 비김 패    승률		
		//몇 판 하시겠습니까?		
		//반복 돌리기
		//판수만큼 배열에 승률 저장 
	
		
	
		Scanner sc = new Scanner(System.in);
		System.out.println("몇번 반복하시겠습니까?");
		int input = sc.nextInt();
		
		String[] arr = new String[input];
		
		int ucnt = 0; //유저 승수
		int ccnt = 0; //컴퓨터 승수
		int dcnt = 0; //동점수
		int total = 0; // 플레이 횟수s
		
		
		for (int i = 0; i < input; i++) {
			System.out.println("1. 가위, 2. 바위, 3. 보  중 하나를 선택해주세요.");
			int input2 = sc.nextInt();
			double random = Math.random() * 3 + 1;
			//System.out.println(random);
			int com = (int)random;
			//String[] arr = new String[input];
			
			
			
			//가장 많이 걸릴것 같은 값을 if문 위쪽에 배열해 주세요.
			if(input2 == 1 && com == 2) {
				System.out.println("컴퓨터 승");
				System.out.println("당신이 낸 숫자 : " + input2 + " 컴퓨터가 낸 숫자 : " + com);
				arr[i] = i + 1 + "회차 : " + "컴퓨터 승";
				total++;
				ccnt++;
				
			}else if(input2 == 1 && com == 3) {
				System.out.println("당신이 이겼습니다");
				System.out.println("당신이 낸 숫자 : " + input2 + " 컴퓨터가 낸 숫자 : " + com);
				arr[i] = i + 1 +"회차 :  " + "user 승";
				total++;
				ucnt++;
				
			}else if(input2 == 2 && com == 1) {
				System.out.println("당신이 이겼습니다");
				System.out.println("당신이 낸 숫자 : " + input2 + " 컴퓨터가 낸 숫자 : " + com);
				arr[i] = i + 1 + "회차 : " + "user 승";
				total++;
				ucnt++;
				
			}else if(input2 == 2 && com == 3) {
				System.out.println("컴퓨터 승");
				System.out.println("당신이 낸 숫자 : " + input2 + " 컴퓨터가 낸 숫자 : " + com);
				arr[i] = i + 1 + "회차 : " + "컴퓨터 승";
				total++;
				ccnt++;
				
			}else if(input2 == 3 && com == 1) {
				System.out.println("컴퓨터 승");
				System.out.println("당신이 낸 숫자 : " + input2 + " 컴퓨터가 낸 숫자 : " + com);
				arr[i] = i + 1 + "회차 : " + "컴퓨터 승";
				total++;
				ccnt++;
				
			}else if(input2 == 3 && com == 2) {
				System.out.println("당신이 이겼습니다.");
				System.out.println("당신이 낸 숫자 : " + input2 + " 컴퓨터가 낸 숫자 : " + com);
				arr[i] = i + 1 + "회차 : " + "user 승";
				total++;
				ucnt++;
				
			}else if(input2 == com){
				System.out.println("비겼습니다.");
				System.out.println("당신이 낸 숫자 : " + input2 + " 컴퓨터가 낸 숫자 : " + com);
				arr[i] = i + 1 + "회차 : " + "동점";
				total++;
				dcnt++;
			}else {
				System.out.println("다시 선택해주세요.");
				i--;
			}
		
		} 
		System.out.println("\n게임 끝\n");
		System.out.println("결과 : " + Arrays.toString(arr));
		System.out.println("총 게임수 : " + total + "게임, 유저 승리 횟수 : " + ucnt + "게임, 컴퓨터 승리 횟수 : " + ccnt + "게임, 동점수 : " + dcnt + "게임");
		System.out.println("유저 승률 : " + (int)((ucnt / (double)total) * 100) + "%");
		System.out.println("컴퓨터 승률 : " + (int)((ccnt / (double)total) * 100) + "%");
		// 1. 가위바위보 게임
		// 2. 사용자가 입력한 횟수만큼 반복
		// 3. 배열에 결과값 저장하기
		
		
		sc.close();
		
		
	}

}
