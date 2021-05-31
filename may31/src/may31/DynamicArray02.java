package may31;

import java.util.Arrays;

//동적가변배열
public class DynamicArray02 {

	public static void main(String[] args) {
		
		//10칸짜리 int 배열
		//내부는 비워두세요.
		
		int[][] arr01 = new int[10][];
		
		//각 집을 돌면서 랜덤으로 방을 만들어 주겠습니다.
		
		for (int i = 0; i < arr01.length; i++) {
			arr01[i] = new int[(int)(Math.random() * 5 + 1)];
			
		}
		
		
		//출력
		for (int[] is : arr01) {
			System.out.println(Arrays.toString(is));
		}
		for (int i = 0; i < arr01.length; i++) {
			for (int j = 0; j < arr01[i].length; j++) {
				System.out.println(arr01[i][j]);
			}
		}
		
		
		//컬랙션 - List - ArrayList
		
		
		
		
	}

}
