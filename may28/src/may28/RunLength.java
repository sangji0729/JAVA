package may28;
/*문자열을 입력받아서, 같은 문자가 연속적으로 반복되는 경우에 그 반복 횟수를 표시하여 문자열을 압축하기.
입력 예시: aaabbcccccca
출력 예시: a3b2c6a1
 */

public class RunLength {

	public static void main(String[] args) {
		
		String zip = "aaabbcccccca";
		
		
		
		int num = 1;
		String str = "";
		for (int i = 0; i < zip.length() - 1; i++) {
			char checkchar = zip.charAt(i);
			if(checkchar == zip.charAt(i + 1)) {
				num++;
			}else {
				//str += checkchar + num;
				str = str + checkchar + num;
				num = 1;
			}
		}
		System.out.println(str);
		
		
		//배열 사용방법
		
		char[] zipArray = zip.toCharArray();
		String result = String.valueOf(zipArray[0]);
		int num2 = 1;
		
		for (int i = 0; i < zipArray.length - 1; i++) {
			if(zipArray[i] == zipArray[i + 1]) {
				num2++;
			}else {
				result += String.valueOf(num2);
				result += String.valueOf(zipArray[i + 1]);
				num2 = 1;
			}
			if(zipArray.length - 1 == i + 1) {
				result += num2;
			}
		}
		
		//result += num2;
		System.out.println(result);
		
		
	}

}
