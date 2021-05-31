package may27;
//MultiArray04를 만드시고 3x3 배열을 만들어주세요
//그속을 아래처럼 만들어주세요.
//[1, 2, 3]
//[4, 5, 6]
//[7, 8, 9]


//위 배열에 정해진 숫자가 아닌 랜덤한 수가 들어간다면?

import java.util.Arrays;


public class MultiArray04 {

	public static void main(String[] args) {
		
		

		int[][] arr01 = new int[3][3];
		
	/*	for (int i = 0; i < arr01.length; i++) {
			for (int j = 0; j < arr01.length; j++) {
				arr01[i][j] = i == 0 ? j + 1 : (i * 3) + j + 1;
			}
		}
		for (int[] is : arr01) {
			System.out.println(Arrays.toString(is));
		}
		
		System.out.println("========================="); */
		
		
	
		for (int i = 0; i < arr01.length; i++) { // 외부측
			for (int j = 0; j < arr01[i].length; j++) { //내부측
				
				int random = (int)(Math.random() * 9 + 1); // 랜덤값 1~9
				
			boolean ch = true ;
		F :	for (int k = 0; k < arr01.length; k++) {//배열 바깥쪽 중복검사
				for (int k2 = 0; k2 < arr01[i].length; k2++) {//배열 안쪽 중복검사
					if(arr01[k][k2] != 0 && random == arr01[k][k2]) {
						//System.out.println("중복");
						j--;
						ch = false;
						break F;
					}
				}
			}
				if(ch) {//중복이 아닐시 들어옴
				arr01[i][j] = random;
				}
			}
		}
		
		for (int[] is : arr01) {
			System.out.println(Arrays.toString(is));
		}
		
		
	}

}
