package BasicPractice;
import java.util.Scanner;

public class Practice04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.println("국어점수를 입력하세요 : ");
		int kor = sc.nextInt();
		System.out.println("영어점수를 입력하세요 : ");
		int eng = sc.nextInt();
		System.out.println("수학점수를 입력하세요 : ");
		int math = sc.nextInt();
		
		int total = (kor + eng + math);
	    double aver = (double)total / 3;
		System.out.println("이름 : " + name);
		System.out.println("합계점수 : " + total);
		System.out.println("평균점수 : " + aver);
	}

}
