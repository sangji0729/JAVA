package may31;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat03 {

	public static void main(String[] args) {
		//Date
		Date now = new Date();
		System.out.println(now); //Mon May 31 10:41:07 KST 2021
		
		//now.getMonth();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 a hh시 mm분 ss초");
		//E = 요일, a = 오전/오후
		//D = 월 구분 없이 365일
		//K = 시간 0~11 k = 1 ~ 24
		//W = 월의 몇번째 주 w = 년의 몇번째 주
		//S = 밀리세컨 s = 초
		
		System.out.println(sdf.format(now)); //2021년 05월 31일 10시 45분 31초
		
		String str = sdf.format(now).toString();
		System.out.println(str); //2021년 05월 31일 10시 47분 55초 문자형식으로 저장

		
		
	}

}
