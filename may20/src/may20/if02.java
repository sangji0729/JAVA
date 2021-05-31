package may20;

import java.util.Scanner;

//사용자의 숫자를 받아서 숫자가 5보다 큰지 작은지 표시하기

public class if02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("원하시는 숫자를 입력해주세요.");
		double num = sc.nextDouble();
		
		
		if(num > 5) {
			System.out.println("입력하신 숫자가 5보다 큽니다.");
		}else if(num == 5) {
			System.out.println("입력하신 숫자는 5입니다.");
		}else {
			System.out.println("입력하신 숫자가 5보다 작습니다.");
		}
	

	}

}
