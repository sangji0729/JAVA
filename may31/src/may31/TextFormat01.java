package may31;

import java.text.MessageFormat;

public class TextFormat01 {

	public static void main(String[] args) {

		
		
		System.out.printf("%d", 3 );
		
		String name = "홍길동";
		String id = "hong5000";
		String tel = "010- 5569 - 8102";
		
		System.out.println("\n이름 : " + name + ", 아이디 : " + id + ", tel : " + tel);
		//이름 : 홍길동, 아이디 : hong5000, tel : 010- 5569 - 8102

		
		String text = "이름 : {0}, 아이디 : {1}, tel : {2}";
		
		String result = MessageFormat.format(text, name, id, tel);
		System.out.println(result);
		//이름 : 홍길동, 아이디 : hong5000, tel : 010- 5569 - 8102
		
		String[] arr = {"홍길동", "hong5000", "010-0123-0123"};
		result = MessageFormat.format(text, arr);
		System.out.println(result);
		//이름 : 홍길동, 아이디 : hong5000, tel : 010-0123-0123

		//책 538p
		
		
		
		
		
		
		
	}

}
