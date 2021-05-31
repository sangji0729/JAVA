package may18;



//데이터 타입
/* 자바에서는 변수, 상수건 그 값을 담기 위해서는
 * 반드시 그 값의 타입에 맞는 변수를 사용해야 합니다.
 * 이를 데이터 타입이라고 합니다.
 * 
 * 데이터 타입은 크게
 * Reference 참조타입
 * Primitive 기본타입
 * 로 구분됩니다.
 * 
 * 이 중 P부터 보겠습니다.
 * 
 * 자바의 데이터 타입은 크게 2가지, P와 R이라고 대답해주시면
 * 됩니다.
 * 
 * p타입은 수치형, 문자형, 논리형
 * 각각의 타입들은 메모리 크기가 엄격히 제한됩니다.
 * 
 * 수치형
 * 		정수형
 *			byte
 *			short
 *			int(기본)
 *			long
 * 
 * 		실수형
 * 			float
 * 			double(기본)
 * 
 * 		문자형 = 한글자 EX) A, 가, 羅, $
 * 			char
 * 	
 * 		논리형 = 참/거짓 = true, false = 데이터 사이즈는 x 
 * 			boolean
 */
public class DataType1 {
	public static void main(String[] args) {
		//메소드 바디 속에서 선언된 변수 = 지역변수
		//데이터타입 변수명     = 값;
		  byte       byteNumber = 10;
		// -128 ~ 0 ~ 127
		  
		  short  shortNumber = byteNumber;
		  shortNumber = 32767;
		  
		  int intNumber = 1000000; //리터럴
		  
		  intNumber = Integer.MAX_VALUE;
		  intNumber = Integer.MIN_VALUE;
		 
		  
		  long longNum = intNumber;
		  
		 
		  longNum = Long.MAX_VALUE;
		  longNum = Long.MIN_VALUE;
		  longNum = -9223372036854775808L; //맨뒷숫자에 L을 붙혀줌으로서 컴파일이 가능함

		  
		  System.out.println(byteNumber);
		  System.out.println(shortNumber);
		  System.out.println(intNumber); //2147483647
		  System.out.println(longNum);
		  
		  // = 대입       == 같다
		  intNumber = (int) longNum;
		  //cast    casting
		  short shorNum = (short) intNumber;
		  
		  byte byteNum = (byte) shorNum;
		  
		  byteNum = (byte) 120;
		  
		  System.out.println(byteNum);
		  
		  /* 캐스팅 / 캐스트
		   * 큰 타입을 작은 타입에 대입할때 반드시 해야 하는 연산
		   * (type)을 명기해서 값을 대입시킵니다.
		   * 이때 주의할 점은
		   * 상위 비트를 대입할때 작은 타입에 맞게 잘라내기 때문에
		   * 값의 변화가 올 수 있습니다.
		   * 
		   * 
		   */
		  short shortNum2;
		  
		  shortNum2 = byteNum;
		  //프로모션
		  /*큰타입에 작은 타입이 대입되는 것
		   * 작은 타입이 큰 타입에 자동으로 들어가는 것. 
		   * 값 변화 X
		   */
		  
		  
		  intNumber =(int) longNum; // 캐스팅(데이터타입 일치화) 필요
		  intNumber = byteNum; // 자동 대입 = 프로모션
	}
}





