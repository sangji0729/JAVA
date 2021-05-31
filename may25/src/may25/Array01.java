package may25;

import java.util.Arrays;

//배열 Array
/* index, length -----> String(스트링때 다시 나오니 꼭 기억)
 * 위치     길이
 * 
 * 베열은 객체다.
 * 객체는 기본적으로 속성과 메소드를 가지고 있습니다.
 * 배열만 유일하게 속성만 가지고 있습니다.
 * 
 * 배열은 동일(유사)한 타입의 데이터를 하나의 묶음 형태로 관리하기 위해 사용되는 자료구조입니다.
 * 
 * ex) int타입의 변수가 100개 정도 필요하다면 변수명만 만드는데 많은시간이 걸립니다.
 * 이를 관리하는 어려움도 있습니다.
 * 이런 어려움을 극복하고자 사용되는 것이 배열입니다.
 * 
 * 배열은 객체라고 했기 떄문에 객체의 속성과 메소드를 사용해서 배열을 관리합니다.
 * 하지만 배열은 유일하게 속성만 가지고 있습니다.
 * 
 * 속성은 배열의 길이를 나타내는 length입니다.
 * 객체의 속성과 메소드 등을 호출할때는 .(점)을 이용해서 합니다.
 */

public class Array01 {

	public static void main(String[] args) {
		
		//배열 생성식 = 변수 선언식
		//데이터타입 변수명 = 값;
		//int타입의 배열 = 내가 배열임을 선언
		//길이 = 저장할 수 있는 값
		int[] arr01 = new int[10]; //int타입의 길이가 10인 배열 선언
		double[] dArr01 = new double[5];//double타입의 길이가 5인 배열 선언
		//char타입의 길이가 15인 배열을 선언해주세요.
		char[] cArr01 = new char[15];
		
		//같은 타입, 동일 관리, 주소 호출
		//배열 생성식
		//C언어에서는 변수명뒤에 [] 입력, 자바는 변수명뒤, 데이터타입 뒤 둘다 허용. 공부할때는 자바형식인 데이터타입뒤에 쓰도록함
		int[] arr02 = new int[5]; // 길이는 생성할때 만 사용합니다.
		
		//값 대입 = index
		arr02[0] = 10; //0번째 위치에 10 저장. index값 호출, 대입 할때만 사용
		
		//1  2  3  4  5  = 길이 length
		//0  1  2  3  4  = 위치 index    길이 -1
		
		
		//호출
		System.out.println(arr02[0]);
		System.out.println(arr02[1]);
		System.out.println(arr02[2]);
		System.out.println(arr02[3]);
		System.out.println(arr02[4]);
		// System.out.println(arr02[5]); index범위를 넘어서면 오류발생
		
		//전체 다 찍어주려면?
		System.out.println(arr02); // [I@1dbd16a6 주소값
		System.out.println(Arrays.toString(arr02)); // [10, 0, 0, 0, 0]
		
		//문제 [10, 11, 12, 13, 14] 를 만들어보기
		
		arr02[0] = 10; //index는 정수, 변수도 가능
		arr02[1] = 11;
		arr02[2] = 12;
		arr02[3] = 13;
		arr02[4] = 14;
		
		//해당 배열의 길이확인 방법
		System.out.println(arr02.length);
		
		int[] arr03 = new int[arr02.length]; // arr02처럼 길이가 5로 생성됨
		
		System.out.println(Arrays.toString(arr02));
		System.out.println("==========================");
		
		//문제 for문을 사용해 [100, 101, 102, 103, 104]로 표현
		for(int i = 0; i < 5; i++) {
			arr02[i] = 100 + i;
			
		}
		System.out.println(Arrays.toString(arr02));
		//문제 [100,102,104,106,108]
		for(int i = 0; i < 5; i++) {
			arr02[i] = 100 + (i * 2);
		}
		System.out.println(Arrays.toString(arr02));
		
		System.out.println("===========================");
		
		
		//길이를 모르는 배열 맨 마지막 index에 값을 대입하고 싶다면?
		//index = 길이 -1, length
		arr01[arr01.length -1] = 1000;
		System.out.println(Arrays.toString(arr01));
		
		System.out.println("===========================");
		
		//문제 arr01에 1부터 10까지 저장하게 해주세요.
		
		for(int i = 0; i < arr01.length; i++) {
			arr01[i] = i + 1;
		}
		System.out.println(Arrays.toString(arr01));
		
		System.out.println("===========================");
		
		//문제 [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]로 표현해보기
		
		for(int i = 0; i < arr01.length; i++) {
			arr01[i] = arr01.length - i;
		}
		System.out.println(Arrays.toString(arr01));
		
		
	}

}
