package may26;

import java.util.Arrays;
import java.util.Scanner;

public class Array05 {

	public static void main(String[] args) {
		// 사용자 입력
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("암호화할 문자를 입력해주세요.");
		String input = sc.next();  //문자열 입력받기
		
		System.out.println("몇칸 이동할까요? 숫자를 입력하세요.");
		int number = sc.nextInt();  //숫자 입력받기
		
		input = input.toUpperCase(); //문자열을 대문자로
		
		//캐릭터 배열로 만들기
		
		char[] inputArr = input.toCharArray();
			
				
		
		//배열을 돌면서 정해진 숫자만큼 밀기 -> 출력
		
		for (int i = 0; i < inputArr.length; i++) {
			if(inputArr[i] + number > 'Z') {
				inputArr[i] = (char)(inputArr[i] + number - 26);
			}else{
				inputArr[i] = (char)(inputArr[i] + number);
			}
		}
		sc.close();
		
		System.out.println(Arrays.toString(inputArr));
		System.out.println("아래는 배열을 문자열로 변환합니다.");
		String conv = String.valueOf(inputArr); //char Array to String
		String conv2 = String.copyValueOf(inputArr);
		System.out.println(conv);
		System.out.println(conv2);

	}

}
