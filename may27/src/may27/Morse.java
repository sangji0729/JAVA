package may27;

import java.util.Scanner;




//문자열 형식으로 입력 받은 모스코드(dot: . dash:-)를 해독하여 영어 문장으로 출력하는 프로그램을 작성하시오.
//글자와 글자 사이는 공백 하나, 단어와 단어 사이는 공백 두개로 구분한다.
//예를 들어 다음 모스부호는 "he sleeps early"로 해석해야 한다.
//(.... .  ... .-.. . . .--. ...  . .- .-. .-.. -.--)
public class Morse {

	public static void main(String[] args) {
		String str = ".... .  ... .-.. . . .--. ...  . .- .-. .-.. -.--";
		
		//str = str.replace('A', 'B') 한단어 대체
		//str= str.replaceAll(" ","&"); //문자열 대체
		String[] strArr = str.split(" ");
		str= str.replaceAll(" ","&"); //문자열 대체

		String code = ".-;-...;-.-.;-..;.;..-.;--.;....;..;.---;-.-;.-..;--;-.;---;.--.;--.-;.-.;...;-;..-;...-;.--;-..-;-.--;--..";
		String[]codeArr = code.split(";");
		
		String alpha = "A;B;C;D;E;F;G;H;I;J;K;L;M;N;O;P;Q;R;S;T;U;V;W;X;Y;Z";
		String[] alphaArr = alpha.split(";");
		
		for(int i = 0; i < strArr.length; i++) {
			for(int j = 0; j < codeArr.length; j++) {
				if(strArr[i].equals(codeArr[j])) {
					System.out.print(alphaArr[j]);
					break;
				}
			}if(strArr[i].equals("&")) {
				System.out.println(" ");
			}
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\n입력하기 ");
		//System.out.println("띄어쓰기는 느낌표를 사용해주세요.");
		String word = sc.next();
		
		word = word.toUpperCase();
		String[] wordArr = word.split("");
		
		
		
		
		for (int i = 0; i < wordArr.length; i++) {
			for (int j = 0; j < alphaArr.length; j++) {
				if(wordArr[i].equals(alphaArr[j])) {
					System.out.print(codeArr[j]);
				}
			}sc.close();
		}
		
	}
}