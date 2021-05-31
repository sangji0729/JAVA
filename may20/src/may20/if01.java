package may20;

import java.util.Scanner;

//if문
//자바의 제어문
/* 제어문이란, 프로그램이 실행될때 특정 조건, 반복을 수행 또는 멈추게 하기 위해 필요한 문장 
 * 
 * 제어문은 다시 조건에 따라 분기되는 조건문과 특정 조건을 반복적으로 수행하는 반복문으로 구분됩니다.
 * 
 *  조건문 if, switch
 *  사용방법
 *  if(조건식) { 
 *  		조건식이 참일때 실행할 문장
 *  }
 *  
 *  ========================================
 *  
 *  if(조건식) {
 *  		조건식이 참일때 실행할 문장
 *  }else{
 *  		조건식이 거짓일때 실행할 문장
 *  }
 *  
 *  =========================================
 *  
 *  if(조건식1) {
 *  		조건식1이 참일때 실행할 문장
 *  }else if(조건식2){
 *  		조건식1이 거짓이고 조건식2가 참일때 실행할 문장
 *  }else{
 *  		위 두 조건식 모두 거짓일때 실행할 문장
 *  }
 */

public class if01 {

	public static void main(String[] args) {
		System.out.println("메인 메소드 시작");
		
		Scanner sc = new Scanner(System.in);
		boolean check;
		System.out.println("Y/N 을 눌러주세요.");
		String input = sc.next();
		if(input.equals("Y")) {
			check = true; //조건식이 참일때
		}else {
			check = false; //조건식이 거짓일때
		}
		
		check = input.equals("Y") ? true : false;
		
		if(check) {
				//조건식이 참일때 실행할 문장
			System.out.println("조건식이 참일때 실행할 문장");
		}
		
		System.out.println("메인 메소드 끝");
		
		int number = 5;
		
		if(number < 10) {
			System.out.println("넘버는 10보다 작습니다.");
		}else {
			System.out.println("넘버는 10보다 큽니다.");
		}

		number = 6;
		if(number < 5) {
			System.out.println("넘버가 5보다 작습니다.");
		} else if(number > 5) {
			System.out.println("넘버가 5보다 큽니다.1");
		} else if(number > 5) {
			System.out.println("넘버가 5보다 큽니다.2"); //같은 값이라면 첫번째 조건만 실행됨
		} else {
			System.out.println("넘버는 5입니다.");
		}
		
		//if else 문장
		//시작할땐 꼭 if 로 시작
		//조건식이 참이라서 실행하게 된다면 나머지 문장은 빠져나오게됨
		
	}

}
