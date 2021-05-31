package may28;
//숫자_숫자를 입력받으
//가로세로 해당 숫자만큼 큰 배열을 만들어 주세요.

import java.util.Arrays;
import java.util.Scanner;

public class SpiralArray01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("배열을 입력해주세요.\nex)6 6\n");
		String input = sc.nextLine();
		
		String[] inarr = input.split(" ");
		System.out.println(Arrays.toString(inarr));
		
		//배열 그리기 String to int -> Integer.parseInt(스트링값)
		int[][] arr01 = new int[Integer.parseInt(inarr[0])][Integer.parseInt(inarr[1])];
		
		int count = 1;
		for (int i = 0; i < arr01.length; i++) {
			for (int j = 0; j < arr01[i].length; j++) {
				arr01[i][j] = i == 0? j+1 : i + count + j;
				count++;
			}
		}
		for (int[] is : arr01) {
			System.out.println(Arrays.toString(is));
		}
		sc.close();
	}

}
