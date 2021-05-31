package may31;

import java.util.Arrays;
import java.util.Scanner;

public class Tictactoe02 {

	public static void main(String[] args) {
		char[][] arr01 = new char[3][3];
		
		char[] playOrder = {'O', 'X'};
		Scanner sc = new Scanner(System.in);
		
		
		for (int i = 0; i < 9; i++) {
			System.out.println("첫번째 플레이어 원하는 수를 입력해주세요.");
			int input = sc.nextInt();
			
			
			int indexX = input % 3;
			int indexY = input / 3;
			
			if (arr01[indexY][indexX] == '\u0000') {
				arr01[indexY][indexX] = playOrder[0];	
			} else {
				System.out.println("다시 입력");
				--i;
				continue;

			}
			System.out.println("두번째 플레이어 원하는 수를 입력해주세요.");
			int input2 = sc.nextInt();
			
			int indexX2 = input2 % 3;
			int indexY2 = input2 / 3;
			
			if (arr01[indexY2][indexX2] == '\u0000') {
				arr01[indexY2][indexX2] = playOrder[1];	
			}else {
				System.out.println("다시 입력");
				--i;
				continue ;

			}
			
			for (char[] cs : arr01) {
				System.out.println(Arrays.toString(cs));
			}
			
		}
		sc.close();
	}

}
