package may18;
//char 문자형
//문자 하나를 저장합니다.
/*	반드시 값으로는 문자 하나가 와야 합니다.
 * 	하나 이상일 경우에는? String에 저장합니다.
 * 	정수형 타입 0 ~ 65,535 = 2byte
 * 
 * 	문자형을 저장할 때는?
 * 	반드시 홀따옴표로
 * 
 * 정수형이기 때문에 int에 프로모션 가능합니다.
 * 반대로 int 값 또한 문자로 바뀔 수 있습니다.(cast)
 */

public class DataType3 {

	public static void main(String[] args) {
		//문자형 초기화 하기
		//데이터타입 변수명 = '값';
		
		char char1 = 'A';
		char char2 = '가';
		char char3 = '羅';
		char1 = 100;
		char2 = '\ub777'; //유니코드
		//아스키코드, 유니코드 ----utf-8 euc-kr, ms949
		
		System.out.println(char1);
		System.out.println(char2);
		System.out.println(char3);
		
		/*for(int i = 1; i < 128; i++) {
		*	System.out.print(i + " : " + (char) i + "\n");
		}*/
	
	String str = "가나다"; //문자열 = 스트링
	
	  str = "" + char1 + char2 + char3;
	
		System.out.println(str);//d띷羅
	
	int iNum = char3;
		System.out.println(iNum);
	
	int iNum2 = 0xb127;
		System.out.println(iNum2);
		System.out.println((char)iNum2);
		
		
		//////////////////논리형
		//boolean 참, 거짓

		boolean check = true;
		
		System.out.println(check);
		
		System.out.println('A' == 'a');
		
		iNum = 10;
		iNum2 = 10;
		
		System.out.println(iNum == iNum2);
		
		check = iNum == iNum2 + 1;
		System.out.println("결과는 : " + check);
		
		check = iNum != iNum2 + 1; // ! = not
		System.out.println("결과는 : " + check);
		//참 거짓 저장하는 타입
		//off on
		
		/* P타입 8개 순서대로
		 * 
		 * 정수형
		 * 		1.byte 
		 * 		2.short 
		 * 		3.int
		 * 		4.long
		 * 
		 * 실수형
		 * 		1.float
		 * 		2.double
		 * 
		 * 문자형
		 * 		1.char
		 * 
		 * 논리형
		 * 		1.boolean
		 */
		
		int code = 1;
		int result = code % 2; //모듈러 = 나머지 값
		check = result == 0;
		
		if(check) {//만약에 check가 참이라면
			System.out.println("당신은 여자");
		} else {
			System.out.println("당신은 남자");
		}
		
	}

}
