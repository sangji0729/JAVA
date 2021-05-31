package may27;

import java.util.Arrays;

//2차원 배열 : 배열 속에 배열이 있습니다.
public class MultiArray02 {

	public static void main(String[] args) {
		
		int[][] multiArr01 = new int [2][4];

		/* 연습문제
		 * 
		 * [1, 2, 3, 4]
		 * [5, 6, 7, 8]
		 * 
		 */
		
		for (int i = 0; i < multiArr01.length; i++) {
			for (int j = 0; j < multiArr01[i].length; j++) { //첫번째 배열속 길이 확인해야하기 때문에 [i]를 붙혀줌
				System.out.print(multiArr01[i][j] + ", ");
			}
			System.out.println(" ");
		}
		
		System.out.println("==========================1");

		System.out.println(Arrays.toString(multiArr01)); // [[I@1dbd16a6, [I@7ad041f3] 주소값 toString은 하나의 배열만 열수있음
		for (int i = 0; i < multiArr01.length; i++) {
			System.out.println(Arrays.toString(multiArr01[i])); // 다차원배열은 이런식으로 for문을 이용해 출력
		}
		
		
		System.out.println("============================2");
		
		for (int[] is : multiArr01) { // 출력시 toString을 이용해 int옆 is라는 변수명으로 출력
			System.out.println(Arrays.toString(is));
		}
		
		System.out.println("============================3");
		
		
		for (int i = 0; i < multiArr01.length; i++) {
			
			for (int j = 0; j < multiArr01[i].length; j++) {
				//multiArr01[i][j] = i == 0? (i * 5) + j + 1 : (i * 5) + j;
				multiArr01[i][j] = i == 0? j + 1 : (i * 5) + j;
				System.out.println(Arrays.toString(multiArr01[i]));
		
			}
			System.out.println("============================3");
			for (int[] is : multiArr01) {
				System.out.println(Arrays.toString(is));
			}
			
		}
		
		
		int num = 8888;
		String str = String.valueOf(num);
		System.out.println(str.charAt(0) == '8');
		
		
	}

}
