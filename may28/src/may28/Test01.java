package may28;

import java.util.Scanner;

//사용자 입력 "가나다abc12@#$" --> abc12
//자바가 사용할수 있는 변수로 변경하기
//영어 대문자, 소문자, 숫자, _, &
public class Test01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("문자를 입력해주세요.");
		String input = sc.next();
		
		for (int i = 0; i < input.length(); i++) {
			if(Character.isAlphabetic(input.charAt(i))) {
				System.out.print(input.charAt(i));
			}else if(Character.isDigit(input.charAt(i))) {
				System.out.print(input.charAt(i));
			}else if(input.charAt(i) == '_' && input.charAt(i) == '&') {
				System.out.println(input.charAt(i));
			}
		}
	sc.close();
	}

}
