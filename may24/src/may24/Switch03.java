package may24;

import java.util.Scanner;

//성별코드를 입력받고 몇년도에 태어난 성별이 무엇인지 출력해보기

public class Switch03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("성별코드를 입력해주세요_");
		int year = 0, code;
		String sex;
		code = sc.nextInt();
		
		switch (code) {
		case 1:
		case 2:
			year = 1900;
			break;
			
		case 3:
		case 4:
			year = 2000;
			break;
			
		default:
			System.out.println("잘못 입력하셨습니다.");
			//break;
			System.exit(0);;//프로그램 종료
		}
		sex = code % 2 == 0 ? "여성" : "남성";
		//조건식            ?  참    :  거짓
		System.out.println("당신은 " + year + "년도에 태어난");
		System.out.println(sex + " 입니다.");
		sc.close();
		
		//if문하고 같습니다.
		//key값이 일치한 case만 실행해 나갑니다.
		//break;가 꼭있어야 합니다.
		//단점은 범위를 지정할수 없습니다.
		//값을 보여주니까 개발하기 편합니다.
		//char, String 가능합니다.
		//실수, long 불가능합니다.
	}

}
