package may24;
//Switch문
/*
 * switch ~case 문
 * if와 else if의 또다른 조건문입니다.
 * 각 조건을 case값과 비교해서 결과가 true이면 조건을 빠져나갑니다.
 * switch의 조건 값의 타입은 수치형일경우는 int만 가능합니다.
 * 문자열도 조건 값으로 가능합니다.
 * 
 */

/* switch(검색변수){
 * 		case 조건:
 * 			조건이 true 일시 실행할 문장;
 * 			break;
 * 		case 조건2:
 * 			조건2가 true 일시 실행할 문장;
 * 			break;
 * 		default:
 * 			나열된 case의 조건이 모두 false일때 실행할 문장;
 * 			break;
 * }
 * 주의 : 검색변수는 int타입 이하
 * 					 long, 실수형은 사용불가합니다.
 * 
 * 
 */
public class Switch01 {

	public static void main(String[] args) {
		
		int number = 0;
		
		switch (number) {
		case 0:
			System.out.println("number는 0입니다.");
			break;

		case 5:
			System.out.println("number는 5입니다.");
			break;
		default: //위 case에 부합하지 않다면 
			System.out.println("number는 0과 5가 아닙니다.");
			break;
		}

	}

}
