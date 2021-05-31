package may27;

import java.util.Arrays;

//1부터 10000까지 8이라는 숫자가 총 몇번 나오는가?
/* 8이 포함되어 있는 숫자의 갯수를 카운팅 하는 것이 아니라
* 8이라는 숫자를 모두 카운팅 해야한
* (예를들어 8808은 3, 8888은 4로 카운팅 해아함)
*/
public class Yunsup02 {

	public static void main(String[] args) {
		int[] arr01 = new int[10];
		
		for (int i = 0; i < arr01.length; i++) {
			arr01[i]++;
		}
		System.out.println(Arrays.toString(arr01));

	}

}
