package may26;

import java.util.Arrays;

//2차원 배열 : 배열 속의 배열

public class MultiArray01 {

	public static void main(String[] args) {
		
		int[] arr01 = {10, 20, 30, 40};//길이 4, index 0 ~ 3
		
		int[][] multiArr01 = new int[4][5];
		
		//대입
		multiArr01[1][2] = 500;
		multiArr01[3][1] = 100;
		
		int number = 1;
		
		for (int i = 0; i < multiArr01.length; i++) {
			for (int j = 0; j < multiArr01[i].length; j++) {
				multiArr01[i][j] = number++;
				
			}
		}
		//출력
		for (int i = 0; i < multiArr01.length; i++) {
			for (int j = 0; j < multiArr01[i].length; j++) {
				System.out.println(i + " : " + j + " : " +  multiArr01[i][j]);
			}
		}
		
		//Array출력
		for (int i = 0; i < multiArr01.length; i++) {
			System.out.println(Arrays.toString(multiArr01[i]));
		}

		//foreach 출력
		for(int[] is : multiArr01) {
			for(int i : is) {
				System.out.println(i);
			}
		}
	}

}
