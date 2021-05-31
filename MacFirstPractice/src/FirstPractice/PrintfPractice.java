package FirstPractice;

import java.util.Scanner;

public class PrintfPractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		
		//System.out.printf("2 x %d = %d/n", num1, num2 * 2);
		System.out.printf("%d + %d", num1, num2 );
		 System.out.printf("%n자리수 지정 :%10d%n",1000);
	} 
		
}
