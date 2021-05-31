package may21;

import java.util.Scanner;
//지금까지 우리가 배운것
/* 	4일
 * 	자바 설치 Oracle JDK, OpenJDK
 * 	JDK = 자바 개발 도구, 자바를 개발하기 위한 도구 집합.JRE포함
 * 	JRE = 자바 실행 환경, 자바를 실행만 합니다. JVM포함
 *  JVM = java virtual machine
 *  
 *  변수 = 프로그램 실행 중 값이 변해야 하는 것을 담아둡니다.
 *  상수 = final int INT_NUMBER = 100; 변하지 않습니다.
 *  
 *  표기법 
 *  
 *  	자바에서 사용가능한 문자는? = 대,소문자, 숫자, $, _  
 *  
 *  
 *  	파스칼표기법 = 첫글자 대문자. 클래스에 사용. 두단어 결합시 뒤에오는 단어 첫글자는 대문자. ex) HelloKorea
 *  
 *  	카멜표기법 =  첫글자 소문자. 메소드, 변수에 사용. 두 단어 결합시 뒤에 오는 단어 첫글자 대문자. ex) helloKorea
 *  
 *  	스네이크표기법 = 상수에 사용. 모두 대문자. 단어사이는 언더바( _ ) ex) HELLO_KOREA
 *  	
 *  
 *  데이터 타입 = 크게 두가지가 있음. (기본타입 P, 참조타입 R)
 *  	기본타입 8개
 * 			숫자, 정수 = byte(8bit) , short(2byte) , int(기본형)(4byte) , long(8byte)
 *  		숫자, 실수 = float(4byte) , double(기본형)(8byte)
 *  		문자 = char(2byte)			문자열 = String
 *  		논리 = boolean(off/on) (1byte)
 *  
 *  	참조타입 = 기본타입을 제외한 모든 타입. 지금도 만들어지고 있습니다.
 *  
 *  데이터 타입 변환
 *  	작은 타입이 큰 타입에 들어갈 때 = 프로모션
 *  	큰 타입이 작은 타입에 들어갈 때 = (cast) 캐스팅
 *  			캐스팅의 문제 = 값이 변경될 수 있음.
 *  
 *  					왼쪽	=    (왼쪽타입)오른쪽
 *  					<----------------------------
 *  
 *  			
 *  데이터 스코프 = 오늘 할 것.
 *  	
 *  	if(조건식) {//조건식은 참/거짓
 *  			조건식이 참일때 실행할 명령문;
 *  	}else{
 *  			조건식이 거짓일때 실행할 명령문;
 *  	}
 *  
 *  
 *  	if(조건식1) {
 *  			조건식1이 참일떄 실행할 명령문;
 *  	}else if(조건식2) {
 *  			조건식1이 거짓이고 조건식2가 참일때 실행할 명령문;
 *  	}else {
 * 				위 조건식이 모두 거짓일때 실행할 명령문;
 * 		}
 *  
 *  	else if 는 중첩 가능. 갯수 제한이 없음.
 *  	마지막 else는 생략 가능.
 *  
 *  
 */

public class holsu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		
		int input = sc.nextInt();
		
		
		if(input % 2 == 0) {
			System.out.println("짝수입니다.");
		}else {
			System.out.println("홀수입니다.");
		}
		sc.close();

	}

}
