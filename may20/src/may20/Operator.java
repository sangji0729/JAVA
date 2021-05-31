package may20;

import java.util.Scanner;

//연산자
/* 자바의 연산자
 * 모든 프로그래밍에서는 데이터를 연산하기 위해 연산자를 사용합니다.
 * 지금 배우는 연산자는 자바 뿐만 아니라 모든 언어에서 비슷하게 사용됩니다.
 * 주의해서 보셔야 할 것은 연산자의 기능과 순서입니다.
 * 연산자의 종류가 많기 때문에 모두 외우기 보다는 자주 사용하시면서 익숙해지시는것을 추천드립니다.
 * 
 *  아래 나열되어 있는 연산자의 종류는 그 순서대로 정의한 것입니다.
 *  
 *  1. 최우선 연산자
 *  	.     점,닷 = 클래스 또는 객체 소유의 변수, 메소드등을 호출하는 연산자(중요!)
 *  	[]    배열  
 *  	()	  괄
 *  
 *  2. 단항연산자
 *  	! 논리부정
 *  	~ 비트반전
 *  	+/- 부호연산
 *  	++/-- 선행 증감 (중요)
 *  
 *  3. 산술연산자
 *  	+, -, *, /, %(모듈러 : 나눈후 나머지 값을 가져갑니다.) 
 *  
 *  4. 쉬프트 연산자
 *  	<<, >>, >>>
 *  
 *  5. 관계 연산자
 *  	<, >, <=, >=, ==, !=
 *  
 *  6. 비트연산자
 *  	&, |, ^
 *  
 *  7. 논리연산자
 *  	&&(and) , ||(or) 
 *  
 *  8. 삼항연산자
 *  	조건식 ? 조건이 참일때 값 : 조건이 거짓일때 값
 *  
 *  9. 배정대입연산자
 *  	=, /=, +=, -=, *=, .....많음
 *  
 *  10.후행증감연산자
 *  	++/-- (중요)
 *  
 *  추가 ->
 *  1. 단항, 이항, 삼항 연산자 순으로 우선순위를 가진다.
 *  2. 산술, 비교, 논리, 대입 연산자 순으로 우선순위를 가진다.
 *  3. 단항과 대입연산자를 제외한 모든 연산자의 방향은 왼쪽에서 오른쪽.
 *  4. 복잡한 연산식 에서는 괄호()를 사용해서 우선순위를 정해준다.
 *  		책68p
 *  
 */

public class Operator {

	public static void main(String[] args) {
		int num01 = 1;
		int num02 = ++num01;
		int num03 = --num01 + ++num02;
		int num04 = ++num01 - --num02;
		
		num01 = 0;
		num02 = 0;
		num03 = 0;
		num04 = 0;
		
		num02 = num01++;
		num03 = num02++ + num01;
		num04 = num03-- + num02++ + ++num01;

		System.out.println(num01);
		System.out.println(num02);
		System.out.println(num03);
		System.out.println(num04);
		
		/* ++	피연산자  : 다른 연산을 수행하기 전에 피연산자 값을 +1
		 * --	피연산자  : 다른 연산을 수행하기 전에 피연산자 값을 -1
		 * 피연산자		++  : 다른 연산을 수행한 후에 +1
		 * 피연산자		--  : 다른 연산을 수행한 후에 -1
		 */
		
		//논리부정 !
		boolean check = true;
		System.out.println(check);
		
		//check = "String".equals("string"); 문자열 비교
		check = !check;
		
		System.out.println(check);
		//참이면 거짓으로
		//거짓이면 참으로
		
		int bitNum01 = ~10;
		System.out.println(bitNum01);
		System.out.println(Integer.toBinaryString(bitNum01)); //1010
		
		
		//모듈러 : 나눈 후 나머지 값을 가져갑니다.
		//System.out.println(2 / 2);
		//System.out.println(2 % 2);
		System.out.println(10 % 5); //1
		System.out.println(11 % 5); //2
		System.out.println(12 % 5); //0
		System.out.println(13 % 5); //1
		System.out.println(14 % 5); //2
		System.out.println(15 % 5); 
		//사용자가 입력한 값 받아서 실행해보기
		
		int code = 0;
		//데이터타입 변수명 = 값;
		Scanner sc = new Scanner(System.in);
		System.out.print("성별 코드를 입력하세요. _");
		code = sc.nextInt();
		
		System.out.println("당신이 입력한 코드는 : " + code + " 입니다.");
		
		if(code % 2 == 0) {
			System.out.println("당신은 여자입니다.");
		}else {
			System.out.println("당신은 남자입니다.");
		}
		sc.close();
		System.out.println("끝");
		
		
		num01 = 0;
		num02 = 0;
		num03 = 0;
		
		++num01;
		System.out.println(num01);
		
		num02 = ++num01 + 2;
		System.out.println(num01);
		System.out.println(num02);
		
		num03 = num01-- - num02;
		System.out.println(num01);
		System.out.println(num02);
		System.out.println(num03);
		
		// + 연결연산자
		//숫자 + 숫자 = 계산    1 + 2 = 3
		//문자 + 숫자 = 연결	가 + 2 = 가2
		//숫자 + 문자 = 연결	2  + 가 = 2가
		//문자 + 문자 = 연결	가 + 나 = 가나
		//숫자 + 숫자 + 문자 = 앞은 계산 뒤는 연결	1 + 2 + 가나다 = 3가나다
		//문자 + 숫자 + 숫자 = 연결 + 연결 + 연결	가나다 + 1 + 2 = 가나다12
		//가나다 + (1 + 2) = 가나다3
		//(1 + 2) + 가나다 = 3가나다
		
		
		//10의 비트를 확인해보겠습니다. >>2도 확인해보겠습니다.
		//10 -> 1010
		System.out.println(10);
		System.out.println(Integer.toBinaryString(10)); //1010
		System.out.println(Integer.toBinaryString(10 >> 3)); //1
		System.out.println(Integer.toBinaryString(10 << 3)); //1010000
		
		System.out.println(-10);
		System.out.println(Integer.toBinaryString(-10)); //11111111111111111111111111110110
		System.out.println(Integer.toBinaryString(-10 >> 2)); //11111111111111111111111111111101
		System.out.println(Integer.toBinaryString(-10 << 3)); //11111111111111111111111110110000
		
		
		
		//관계연산자 비교연산자 = 결과값이 boolean type (true, false)
		//1 == 2 = 거짓
		boolean check02 = true;
		boolean check03 = !check02;
		
		System.out.println(1 != 2);
		System.out.println(1 > 2);
		System.out.println(1 < 2);
		System.out.println((1 < 2) == false);
		
		int num05 = 5;
		System.out.println(num05 > 1 && num05 < 10);
		// && 양쪽다 참이어야 참
		//|| 어느 한쪽만 참이면 참
		System.out.println(num05 > 1 && num05 > 10);
		System.out.println(num05 > 1 || num05 < 10);
		System.out.println(num05 > 1 != num05 < 10);
		System.out.println((check == true)   &&   (check02 == false));
		System.out.println('B' == 65 || (3 == 3.0));
		double temp = 3 + 3.0; // 가장 큰 타입에 맞춰집니다.
		
		//삼항연산자
		//조건식 ? 조건식이 참일때 : 조건식이 거짓일때;
		
		temp = 1 <= 2 ? 100 : 55;
		System.out.println(temp);
		
		if(1 > 2 ) {
			temp = 100;
		}else {
			temp = 55;
		}
		
		// 대입연산자
		// = 
		// +=
		num01 = 1;
		num01 += num01;
		System.out.println(num01); // 2
		
		num01 -= num01;
		System.out.println(num01); //0
		
		num01 =2;
		num01 *= 2;
		System.out.println(num01); //4
		
		num01 /= 2;
		System.out.println(num01); //2
		
		num01 %= 2;
		System.out.println(num01); //0
		
		//책 99p
		
	}

}
