package may27;

import java.util.Arrays;

//단어자르기
public class MultiArray06 {

	public static void main(String[] args) {
		String str = "안녕하세요. 저는 홍길동 입니다.";
		System.out.println(str);
		
		String[] strArr = str.split(""); //자를 문자
		System.err.println(Arrays.toString(strArr));
		
		//비교
		// == != = P타입
		
		String str1 = "Hi";
		String str2 = "hi";
		
		if(str1.equals(str2)) {// 문자열 비교시 == 사용하지 않고 .equals 사용하기
			System.out.println("같아요");
		}else {
			System.out.println("달라요");
		}
		
		str2 = "---";//O
		System.out.println(str2.equals("---"));
		
		str1 = "...";//S
		System.out.println(str1.equals("..."));
	}

}
