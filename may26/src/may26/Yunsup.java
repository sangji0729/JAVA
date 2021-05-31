package may26;


/*
 * 1차원 점들이 주워졌을때
 * 그 중 가장 거리가 짧은 것이 쌍을 출력하는 함수를 만들어주세요.
 * (단 점들의 배열은 모두 정렬되어있다고 가정한다.)
 * 예를들어 S = {1, 3, 4, 8, 13, 17, 20} 이 주어졌다면 결과값은 {3, 4} 가 될것이다.
 */
public class Yunsup {

	public static void main(String[] args) {
	
		int[] arr01 = {1, 3, 4, 8, 13, 19, 20};
		
		int count = arr01[1] - arr01[0]; // 각 거리차이를 저장할 변수
		int first = 0; int sec = 0;; //짧은 거리의 첫번째 수, 두번째 수를 저장할 변수
		
		for (int i = 0; i < arr01.length-1; i++) {
			 if(count > arr01[i + 1] - arr01 [i]) {
				 first = arr01[i];
				 sec = arr01[i + 1];
				 count = arr01[i + 1] - arr01[i];
			 }
		}
		System.out.println(first + " : " + sec);
	}

}
