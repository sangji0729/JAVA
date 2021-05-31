package may21;
//반복문
/* 자바에서는 필요에 따라서 특정 문장을 반복적으로 실행해야 할 때가 있습니다.
 * 이때 사용되는 구문이 반복문 Loop문 입니다.
 * 자바에서는 세가지 형태의 반복문을 제공합니다.
 * 
 * for(forEach), while, do~while입니다.
 * 
 * for(변수 초기화, 변수 조건문, 변수 증감식){
 * 		변수 조건문이 참일때 실행할 문장;
 * }
 */

public class For01 {
	
	public static void main(String[] args) {
	//1 ~ 10까지 더하는 문제
	// + 짝수만 더 한다면?
		
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				sum += i;
			}
			
			
			
		}
			System.out.println("짝수의 총 합은 : " + sum);
		

	}

}
