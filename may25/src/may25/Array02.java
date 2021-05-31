package may25;
//배열

import java.util.Arrays;

public class Array02 {

	public static void main(String[] args) {
		//생성식 작성 방법
		//1. 생성식 = int배열, 10칸 = 초기값으로 정수는 0, 실수는 0.0, char 0, boolean 거짓(false), 객체는 null;
		int[] arr01 = new int[10];
		
		//2. 생성식 = 바로 값을 넣어주기
		int[] arr02 = new int[] {10, 11, 12, 13, 14, 15, 16, 17};
		//                        0   1   2   3   4   5   6   7
		
		//길이는? .length를 이용해야함. 그렇지 않으면 주소값이 출력됨
		System.out.println(arr02.length);
		
		//3. 생성식 = 바로 넣어주기2
		int[] arr03 = {100, 200, 300, 400, 500};
		//400이라는 값을 출력하려면?
		System.out.println(arr03[3]);
		
		//arr01 = 10칸
		//arr03 = 5
		//arr01의 홀수 칸에 arr03의 값을 순서대로 넣어주세요
		
		for(int i = 0; i < arr01.length; i++) {	
			if(i % 2 == 1) {
				arr01[i] = arr03[i / 2];
			}
		} 
			//1    0
			//3    1
			//5    2
		    //7    3
		    //9    4

		
		System.out.println(Arrays.toString(arr01));
		String[] strArr = new String[10];
		
		System.out.println("===========================");
		
		System.out.println(Arrays.toString(strArr));
		//[null, null, null, null, null, null, null, null, null, null]
		
		System.out.println("===========================");
		
		
		
		//foreach 문장
		//향상for문
		for (int i = 0; i < arr01.length; i++) {
			System.out.println(arr01[i]); //index에 i를 넣어서 반환
		}
		System.out.println("===========================");
		System.out.println("아래는 foreach문장");
		
		for (int i : arr01) {//어떤 집합을 열어서 그 요소를 반환
			System.out.println(i);
		}
		
		double[] dArr = new double[5];
		for (double d : dArr) { //오른쪽에 왼쪽값을 대입하여 그 값을 출력
			System.out.println(d);
		}

	}

}
