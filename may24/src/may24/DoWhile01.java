package may24;

import java.util.Scanner;

public class DoWhile01 {
//do~while문
/*do~while문은 while문 과는 다르게 무조건 한번 실행한 다음 조건문에 따라서 반복하게끔 하는 반복문 입니다.
 * while문은 조건식이 거짓이면 한번도 안돌지만, do~while문은 무조건 한번은 도는 형태를 가지고 있습니다.
 */

	public static void main(String[] args) {
		
		do {
			System.out.println("거짓이어도 실행");
			//조건식이 참일때 실행할 문장;
		} while (!true);
	
		int java, jsp, total;
		double avg;
		//char grade;
		
		Scanner sc = new Scanner(System.in);
		
		//점수 입력받기
		do {
			System.out.println("자바 점수를 입력해주세요 : ");
			java = sc.nextInt();
		}while(java < 0 || java > 100);
		
		do {
			System.out.println("jsp 점수를 입력해주세요 : ");
			jsp = sc.nextInt();
		}while(jsp < 0 || jsp > 100);
		
		total = java + jsp;
		avg =(double) total / 2;
		
		System.out.println("java 점수는 " + java + "점, jsp 점수는 " + jsp + "점, 총합은 " + total + "점, 평균점수는 " + avg + "점 입니다.");

		
		sc.close();
		/*
		 * 정수 %d --> %자릿수d --> 20을 %3d로 출력하면 -> _20
		 * 실수 %f --> %.자릿수f --> 2.000을 %.2f로 출력하면 -> 2.00
		 * 
		 */
	}

}
