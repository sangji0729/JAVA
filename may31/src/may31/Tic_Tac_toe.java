package may31;

import java.util.Arrays;
import java.util.Scanner;

public class Tic_Tac_toe {

	public static void main(String[] args) {
		
		char[][] board = new char [3][3];
		char[] playOrder = {'O', 'X', 'O', 'X', 'O', 'X', 'O', 'X', 'O'};
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		boolean isQuit = true; // 게임에 승리했다면 탈출
		boolean point = false; // 해당 자리에 입력이 되어있는지 검사하기
		
		while (isQuit) {
			
			for (char[] cs : board) {
				System.out.println(Arrays.toString(cs));
			}
			
			do {
				System.out.println("말을 놓을 위치를 입력하세요.\n-1을 입력하면 게임이 종료됩니다.");
				if(input == -1) {
					isQuit = false;
					break;
				}
			} while (point);
		}
		
		
	}

}
