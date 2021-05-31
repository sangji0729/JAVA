package may27;

import java.util.Arrays;

public class MultiArray05 {

	public static void main(String[] args) {

		int[][] three = new int[3][3]; //초기값 = 0
		
		for (int i = 1; i < 10; i++) {// 1 ~ 9
			int r1 = (int)(Math.random() * 3);//index 0, 1, 2
			int r2 = (int)(Math.random() * 3);//index 0, 1, 2
			if(three[r1][r2] == 0) {//속에 들어있는값이 0 이라면, 즉 한번도 숫자를 저장하지 않았다면
				three[r1][r2] = i;
			}else {
				i--; //다시돌리기
				System.out.println(r1 + " : " + r2 + " 중복 ");
			}
		}
		for (int[] is : three) {
			System.out.println(Arrays.toString(is));
		};
	}

}
