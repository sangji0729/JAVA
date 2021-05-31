package may26;

import java.util.Arrays;

public class Thanos {

	public static void main(String[] args) {
		
		int[] arr01 = {2, 3, 1, 6, 5, 7, 10};
	//	int[] arr02 = new int[arr01.length / 2];
		int arr02 = (int)(arr01.length / 2 + (Math.random() * 1));
		
		for (int i = 0; i < arr02; i++) {
			int random = (int)(Math.random() * arr01.length);
	//		if(arr01[random] != 0) {
		//		arr02[i] = arr01[random];
			//	arr01[random] = 0;
			//}else {
				//i--;
			//}
			if(arr01[random] != 0) {
				arr01[random] = 0;
			}else {
				i--;
			}
		}
		System.out.println("======================");
		System.out.println(Arrays.toString(arr01));
		//System.out.println(Arrays.toString(arr02));
		
	}

}
