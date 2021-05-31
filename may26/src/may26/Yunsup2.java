package may26;

import java.util.Arrays;

public class Yunsup2 {

	public static void main(String[] args) {
		int[] nacci = new int[20];
		nacci[0] = 0;
		nacci[1] = 1;
		
		
		
		for (int i = 2; i < nacci.length; i++) {
			nacci[i] = nacci[i -1] + nacci[i - 2];
		}
		
			System.out.println(Arrays.toString(nacci));
		
	}

}
