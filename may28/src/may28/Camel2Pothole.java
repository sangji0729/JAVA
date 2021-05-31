package may28;

//import 정리 ctrl + shift + o

/*codingDojang --> coding_dojang
numGoat30 --> num_goat_3_0
위 보기와 같이 CameleCase를 Pothole_case 로 바꾸는 함수를 만들어요!
 */
public class Camel2Pothole {

	public static void main(String[] args) {

		char ch1 = 'c';
		char ch2 = 'C';
		char ch3 = '1';
		
		String str = "Hello";
		
		//문자열을 캐릭터 형태로 한글자씩 잘라내기
		//String[] strArr = str.split(""); 
		//char ch4 = str.charAt(0);
		char ch5 = str.charAt(0);
		
		System.out.println(ch5);
		System.out.println(Character.isUpperCase(str.charAt(0)));
		
		
		System.out.println(Character.isUpperCase(ch1)); //Character.isUpperCase = 해당 문자가 대문자인지 확인하는 명령어
		System.out.println(Character.isLowerCase(ch1)); //Character.isLowerCase = 해당 문자가 소문자인지 확인하는 명령어
		System.out.println(Character.toUpperCase(ch1));	//Character.toUpperCase = 해당 문자를 대문자로 변환
		System.out.println(Character.toLowerCase(ch2)); //Character.toLowerCase = 해당 문자를 소문자로 변환
		
		System.out.println(Character.isUpperCase(ch3)); // 숫자단어는 거짓으로 나옴
		System.out.println(Character.isLowerCase(ch3)); // 숫자단어는 거짓으로 나옴
		System.out.println(Character.toUpperCase(ch3)); // 숫자는 적용안됨
		
		System.out.println(Character.isDigit(ch3)); //Character.isDigit = 해당 문자가 숫자인지 확인하는 명령어
		
		
		System.out.println("============================");
		
		
		
		//먼저 문자열을 for문으로 한글자씩 비교하기
		//if문으로 대문자인지 확인 만일 대문자이면 _를 붙히고 소문자로 변경하여 출력
		//만약 소문자면 그대로 출력하기
		
		//for
		     //if 대문자임?
				//언더바 + 소문자로 변경
				//그냥출력
		
		String str2 = "codingDojang";
		
		
		for (int i = 0; i < str2.length(); i++) {
			char upper = str2.charAt(i);
			
			if(Character.isUpperCase(upper)) {
				upper = Character.toLowerCase(upper);
				System.out.print("_" + upper);
				
			}else {
				System.out.print(upper);
			}
			
		}
		
	/*	System.out.println("\n===========================");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("글자를 입력하세요.");
		String input = sc.next();
		
		
		for (int i = 0; i < input.length(); i++) {
			char up = input.charAt(i);
			
			if(Character.isUpperCase(up)) {
				up = Character.toLowerCase(up);
				System.out.print("_" + up);
			}else {
				System.out.print(up);
			}
		}
		*/
		System.out.println("\n===============호출해서 사용하기=================");
		//호출 = 다른 메소드 일시키기
		//메소드 이름(파라미터);
		String str3 = camel2pothole(str2);
		System.out.println(str3);
		System.out.println(camel2pothole("codingDojang"));
		System.out.println(camel2pothole("coding"+24+"Dojang")); // 파라미터 타입이 맞아야 출력됩니다.
		System.out.println(camel2pothole("안hello50$"));
		
	}//메인 메소드 끝
	//전체공개라는 뜻의 public, static은 객체를 안만듬, String은 반환타입, 이름(파라미터)
	public static String camel2pothole(String camel) {
		String result = "";
		for (int i = 0; i < camel.length(); i++) {
			if(Character.isUpperCase(camel.charAt(i))) {
				result += "_" + Character.toLowerCase(camel.charAt(i));
			}else if(Character.isDigit(camel.charAt(i))) {//숫자일때는 여기로 들어오게 해주세요.
				result += "_" + camel.charAt(i);
			}
			else if(Character.isLowerCase(camel.charAt(i))){
				result += camel.charAt(i);
			}else {
				
			}
			
		}
		return result;//임시
		
	}
}//클래스 끝
