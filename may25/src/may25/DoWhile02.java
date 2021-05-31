package may25;

import java.util.Scanner;

//do ~ while 문, 배열, 최종정리, 
/*
 *  능력단위명 : 화면구현
 *  능력단위요소 : UI 설계 확인하기
 */
public class DoWhile02 {

	public static void main(String[] args) {
		//사용자 입력
		Scanner sc = new Scanner(System.in);
		//변수
		int java, jsp, spring, total;
		double avg;
		char grade;
		
		//점수입력
		do {
			System.out.println("java 점수를 입력하세요 : ");
			java = sc.nextInt();
		} while (java < 0 || java > 100);
		
		do {
			System.out.println("jsp 점수를 입력하세요 : ");
			jsp = sc.nextInt();
		} while (jsp < 0 || jsp > 100);
		
		do {
			System.out.println("spring 점수를 입력하세요 : ");
			spring = sc.nextInt();
		} while (spring < 0 || spring > 100);
		
		total = java + jsp + spring;
		avg = (double)total / 3;
		
		//평균, 총점, 출력
		
		
		//등급 평균점수 100 ~ 90 점 = A, 89 ~ 80 = B, 79 ~ 70 = C, 나머지 F
		
		switch ((int)avg / 10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		default:
			grade = 'F';
			break;
		}
		
		System.out.println("java 점수는 " + java + "점, jsp 점수는 " + jsp + "점, spring 점수는 " + spring + "점입니다");
		System.out.println("총점은 " + total + "점, 평균점수는 " + avg + "점 입니다.");
		System.out.println("당신은 " + grade + "학점입니다.");
		
		
		//정리
		/* 변수
		 * 데이터타입
		 * 연산자
		 * if
		 * for
		 * while
		 * do ~ while
		 * switch
		 * 
		 * 
		 * 배열
		 * 
		 */
		
		
	/*	do {
			//먼저 실행후 조건식을 검사합니다. 조건식이 거짓이라도 한번은 실행합니다.
		} while (조건식); */
		
		sc.close();
		

	} 

}
