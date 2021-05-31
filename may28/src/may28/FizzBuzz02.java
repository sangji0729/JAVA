package may28;
//1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13...

import java.util.Arrays;

public class FizzBuzz02 {

	public static void main(String[] args) {
		
		for (int i = 1; i < 21; i++) {//20번 반복
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			}else if(i % 5 == 0) {
				System.out.println("Buzz");
			}else if(i % 3 == 0) {
				System.out.println("Fizz");
			}else {
				System.out.println(i);
			}
		}
		
		//배열로 표시할시 무슨 데이터타입으로 표현해야 할까요
		
		String[] fb = new String[20];
	
		
		for (int i = 1; i < fb.length + 1; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				fb[i - 1] = "FizzBuzz";
			}else if(i % 3 == 0) {
				fb[i - 1] = "Fizz";
			}else if(i % 5 == 0) {
				fb[i - 1] = "Buzz";
			}else {
				fb[i - 1] = String.valueOf(i);
			}
		}
		System.out.println(Arrays.toString(fb));
	}

}
