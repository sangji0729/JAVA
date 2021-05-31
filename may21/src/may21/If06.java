package may21;

//if중첩
//조건의 중첩 : 필요에 따라서 조건을 계속 중첩시키는것.
//초보자일 경우에 블럭( { } )이 빠질수도 있습니다.
/*
 * if(조건식1) {
 * 		if(조건식2){
 * 
 * 		}
 * }
 */

public class If06 {

	public static void main(String[] args) {
		
		double ran = Math.random() * 127;
		System.out.println(ran);
		
		int num = (int) ran;
		System.out.println(num);

		//int num2 = (int) (Math.random() * 150 + 1);
		
		char ch = 'A';
		ch = (char) num;
		System.out.println("뽑은 글자 : " + ch);
		//A = 65, Z = 90, a = 97, z = 122 
		
		if(ch >= 'A') { //영어 대문자, 특수문자, 소문자, 특수문자
			System.out.println("영어 대문자 A 이후");
			if(ch <= 'Z') {
				System.out.println("영어 대문자 입니다.");
			}else {
				System.out.println("영어 대문자 이후 문자입니다.");
				if(ch < 'a') {
					System.out.println("대,소문자 사이 특수문자 입니다.");
				}else {
					if(ch <= 'z') {
						System.out.println("영어 소문자 입니다.");
					}else {
						System.out.println("영어 소문자 이후 특수문자 입니다.");
					}
				}
			}
		}else {// 영어 대문자 이전 문자
			System.out.println("영어 대문자 A 이전");
			if(ch >= 48 && ch <= 57) {
				System.out.println("숫자입니다.");
			}else {
				System.out.println("숫자 이전 특수문자 입니다.");
			}
		}
		////////////////////////////////////////////////////////////////////////////////////
		//논리연산자를 사용하여 해보기
		//AND 사용
		if(ch >= 'A' && ch <= 'Z') {
			System.out.println("영어 대문자");
		}else if(ch >= 'a' && ch <= 'z') {
			System.out.println("영어 소문자");
		}else if(ch >= '0' && ch <= '9') {
			System.out.println("숫자");
		}else {
			System.out.println("특수문자");
		}
		
		
		
		//OR사용
		if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
			System.out.println("영어 대,소문자");
		}
		
		
		//더 쉬운 방법으로...API
		/* API
		 * (Application Programming Interface
		 * 애플리케이션 프로그래밍 인터페이스,
		 * 응용 프로그램 인터페이스)는 응용 프로그램에서 사용할 수 있도록
		 * 운영체제나 프로그래밍 언어가 제공하는 기능을 제어할 수 있게 만든 인터페이스
		 */
		
		System.out.println("==========================");
		if(Character.isUpperCase(ch)) { // 파라미터 매개변수 isUppperCase = 대문
			System.out.println("대문자입니다.");
		}else if(Character.isLowerCase(ch)){//isLowerCase = 소문자
			System.out.println("소문자입니다.");
		}else if(Character.isDigit(ch)) {//isDigit = 숫자
			System.out.println("숫자입니다.");
		}else {
			System.out.println("특수문자입니다.");
		}
		
		
		
		
	}

}
