package may25;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;

//char[] 대문자 A ~ Z 저장

public class Array03 {

	public static void main(String[] args) {
		
		char[] cArr01 = new char[26];
		
		for (int i = 0; i < cArr01.length; i++) {
			cArr01[i] =(char)(65 + i);
		}
		System.out.println(Arrays.toString(cArr01));
		
		System.out.println((char)(cArr01[0] + 3));
		///////////////////////////////////////////////
		System.out.println("============================"); //절취선
		char[] cat = {'X','Y','Z'};
		//             0   1   2
		//5칸 밀면 
		//3칸 밀면
		
		int plus = 5;
		
		for (int i = 0; i < cat.length; i++) {
			if(cat[i] + plus > (char)'Z') {
				System.out.println(cat[i] = (char)(cat[i] + plus - 26));
				
			}else {
				System.out.println(cat[i] = (char)(cat[i] + plus));
			}
		}
		
		System.out.println(Arrays.toString(cat));
		
		
		//스캐너로 입력받은것 배열로 넣기
		/* Scanner sc = new Scanner(System.in);
		String input = sc.next();
		char[] string2Char = input.toCharArray(); */
											//문자열을 하나하나 분해해서 char 배열로...
		
		
		//System.out.println(Arrays.toString(string2Char));
		//출력해보시면 됩니다.
		
		
		//String input2 = JOptionPane.showInputDialog("java", true);
		//System.out.println(input2);
		
	}

}
