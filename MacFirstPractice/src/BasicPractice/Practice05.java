package BasicPractice;
import java.util.Scanner;

public class Practice05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("삼각형의 넓이를 구하는 프로그램입니다. 밑변의 길이를 입력해주세요 : ");
		int bot = sc.nextInt();
		System.out.printf("높이의 길이를 입력해주세요 : ");
		int hight = sc.nextInt();
		
		double nulb = ((double)(bot * hight) / 2);

		System.out.println("삼각형의 넓이 : " + nulb);
	}

}
