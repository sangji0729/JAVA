package may26;

import java.util.Arrays;
import java.util.Scanner;

public class Array06 {

	public static void main(String[] args) {
		
		int[] subject = new int[4];//0 java, 1 jsp, 2 spring, 3 total
		double avg;
		char grade;
		
		Scanner sc = new Scanner(System.in);
		
		String[] text = {"java", "jsp", "spring"};
		
		for (int i = 0; i < text.length; i++) {
			do {
				System.out.println(text[i] +  " 점수를 입력하세요.");
				subject[i] = sc.nextInt();
			} while (subject[i] < 0 || subject[i] > 100);
		}
		
		subject[3] = subject[0] + subject[1] + subject[2];
		
		avg = subject[3] / 3.0;
		
		System.out.println("java점수는 " + subject[0] + "입니다.");
		System.out.println("jsp점수는 " + subject[1] + "입니다.");
		System.out.println("spring점수는 " + subject[2] + "입니다.");
		System.out.println("총점수는 " + subject[3] + "입니다.");
		System.out.println("평균점수는 " + avg + "입니다.");
		switch ((int)avg/10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		
		case 8:
			grade ='B';
			break;
		
		case 7:
			grade = 'C';
			break;
			
		default:
			grade = 'F';
			break;
		}
		System.out.println("등급은 " + grade + "입니다.");

	}

}
