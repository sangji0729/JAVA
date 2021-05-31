package may21;
//2의 곱셈 나타내기
//for(int i = 1; i < 10; i++){
/*System.out.printf("2 x %d = %d/n", i, i * 2);
 * }
 * %d는 정수가 들어갈 위치
 * 
 * 
 */

public class For03 {

	public static void main(String[] args) {
		
		for(int i = 1; i < 10; i++) {
			if(i % 2 == 1) {
				continue;
			}
	/*		for(int n = 1; n < 10; n++) {
				
				System.out.println(i + " X " + n + " = " + (n * i));
				if(n == 9) {
					System.out.println("================== " + i + "단 끝 ===================");
					} */			
				//continue = 이하 실행구문은 무시하고 다시 반복문으로 돌림
				//break = 가장 가까운 조건문을 탈피합니다
			
			System.out.println("2 X " + i + " = " + (2 * i));
			//System.out.printf("2 x %d = %d/n", i, i * 2);
		}

	}

}
