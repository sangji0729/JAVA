package may24;

import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 직급을 입력하세요 : ");
		System.out.print("\t1.사장\t2.부장\t3.과장\t4.대리\t5.사원\t6.알바");
		int input = sc.nextInt();
		//7층건물
		switch (input) {
		case 1:
			System.out.print("6층");
			//break;
		case 2:
			System.out.print("5층");
			//break;
		case 3:
			System.out.print("4층");
			//break;
		case 4:
			System.out.print("3층");
			//break;
		case 5:
			System.out.print("2층");
			//break;
		
		default:
			System.out.print("1층");
			break;
		}
		sc.close();
	}

}
