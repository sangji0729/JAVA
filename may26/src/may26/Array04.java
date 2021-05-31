package may26;

import java.util.Arrays;

//배열 Array : 같은 데이터타입의 변수를 하나로 묶어서 관리
public class Array04 {
	
	public static void main(String[] args) {
	
		int[] arr01 = null; //객체 기본타입 ex) int number; number = 10; 같은 형태
		arr01 = new int[5]; //배열속에는 0이 들어가있음 [0, 0, 0, 0, 0]
					//길이 = 생성할때만 길이
		
		//[112, 0, 0, 0, 150]
		//값대입 = index = 컴퓨터는 0부터 시작
		arr01[0] = 112;
		arr01[arr01.length-1] = 150;
		
		//출력 Arrays, for, foreach
		
		System.out.println(arr01); //이름 그대로 출력하면 주소값이 출력
		System.out.println(Arrays.toString(arr01));
		//String java.util.Arrays.toString(int[] a)
		//반환타입	경로	클래스명	메소드명(파라미터)
		
		String str = Arrays.toString(arr01);
		System.out.println(str);
		
		int[] arr02 = new int[] {112, 113, 114, 115, 116};
		//length?
		//last index?
		
		int[] arr03 = {122, 123, 124, 125, 126};
		
		
		//문제 arr02번의 값을 arr01에 복사?
		for (int i = 0; i < arr01.length; i++) {
			arr01[i] = arr02[i];
		}
		System.out.println(Arrays.toString(arr01));
		System.out.println(Arrays.toString(arr02));
		
		
		String name = "홍길동"; //문자열, R타입, 객체
		//String name = new String("홍길동");
		System.out.println(name.length());
		
		String addr = "성동구 성수동1가 13-361번지";
		
		System.out.println(addr.length());
		System.out.println(name.charAt(0));
		
		char name01 = name.charAt(0);
		System.out.println(name01);
		
		char addr02 = addr.charAt(4);
		System.out.println(addr02);
	
		String apple = "apple";
		System.out.println(Character.toUpperCase(apple.charAt(3)));
		
		char[] appleArr = new char[apple.length()];
		for (int i = 0; i < appleArr.length; i++) {
			appleArr[i] = apple.charAt(i);
		}
		System.out.println(Arrays.toString(appleArr));
	
		appleArr = apple.toCharArray();
		
	
	
	
	
	
	
	}
}
