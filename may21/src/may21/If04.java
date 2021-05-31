package may21;
/* 1. 랜덤한 값 두개 생성합니다.
 * 2. if문으로 크기를 비교합니다. (자리바꾸기 해보기)
 * 3. 큰 수부터 출력해주세요. 
 * 
 * 
 * 
 */
public class If04 {

	public static void main(String[] args) {
		int ran1 = (int) (Math.random() * 10 + 1);
		int ran2 = (int) (Math.random() * 10 + 1);
		
		System.out.println(ran1);
		System.out.println(ran2);
		
		if(ran1 < ran2) {
			
			int temp = 0;
			temp = ran1;
			ran1 = ran2;
			ran2 = temp;
			
			System.out.println(temp);
		}
		//System.out.println(temp); // 데이터 스코프 { }
		/* 	데이터 스코프
		 * 간단히 정의하면 선언된 변수가 어떤 범위까지 유지되는지 입니다.
		 * 유지 범위는 { } 로 표시. 괄호가 닫히면 유효범위는 소멸
		 * 
		 */
		System.out.println(ran1 + " > " + ran2);

	}

}
