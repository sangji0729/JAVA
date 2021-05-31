package may24;

public class For05 {

	public static void main(String[] args) {
		//이중 for문  for문 속의 for문
		/*if(조건식1(외부)) {
		 *		조건식1이 참일때 실행할 문장
		 *		if(조건식2(내부)) {
		 *			조건식1이 참이고, 조건식2가 참일때 실행할 문장
		 *		}
		 *	}else{
		 *		if(조건식3) {
		 *			외부가 거짓이고, 내부가 참일때 실행할 문장
		 *		}else{
		 *			둘다 거짓일때 실행할 문장
		 *	}
		 *}
		 * 
		 */
		
		for(int i = 1; i <= 10; i+=2) {//유한반복 === 무한반복
			
			System.out.println(i);
		}
			//System.out.println(i); 	데이터 스코프로 인해 실행불가. j의 유효범위를 넘어섬.
		
		for (int i = 0; i < 5; i++) {//무한으로 출력하기
			//System.out.println();
			for (int j = 1; j <= 5; j++) {
				System.out.println(i * 5 + j + "번 반복했습니다.");
			}
			
		}
		
		
		
		for(int i = 0; i < 5; i++) {
			
			for(int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
		//구구단 
		A:for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				if(j % 3 == 2) {
					//break; //가장 가까운 반복문 탈출
					continue A; //가장 가까운 반복문으로 던지기
					//라벨문
					/* 중첩된 반복문에서 이름을 줄 수 있습니다.
					 * 필요에 따라서 해당 이름을 가진 반복문을 탈출하거나 제어할 수 있습니다.
					 * 
					 */
				}
				System.out.printf("%d x %d = %d\n", i, j, i*j);
				//System.out.println(i + " X " + j + " = " + (i * j));
				
			}
			System.out.println("");
		}
		
		
	}

}

