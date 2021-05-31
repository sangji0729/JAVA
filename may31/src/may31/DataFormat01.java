package may31;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;



public class DataFormat01 {
	public static void main(String[] args) {
	
		Date date = new Date();
		System.out.println(date);
		
		Calendar cal = Calendar.getInstance(); // new 아님
		System.out.println(cal);
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH) + 1); //시작월이 0월부터 시작
		System.out.println(cal.get(Calendar.DATE ) + 1);
		
		System.out.println(cal.get(Calendar.HOUR));
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND)); //파란색 대문자 = static 멤버변수
		//요일을 뽑으려면?
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		//1 ~ 7 일요일부터 시작 : 1 일요일, 2 월요일, 3 화요일....
		
		//문제 : 저 위에 get()로 나오는(return) 데이터 타입은? int
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("======================");
		
		
		//출생년도를 입력하세요.
		//당신은 **살 입니다.
		//나이 = 2021 - 입력받은 년도
		
		//스캐너
		Scanner sc = new Scanner(System.in);
		
		//"출생 년도를 입력해주세요."
		System.out.println("출생 년도를 입력해주세요.");
		
		
		//변수에 저장하기
		int input = sc.nextInt();
		//Calendar객체 생성
		Calendar cal2 = Calendar.getInstance();
		int year = cal2.get(Calendar.YEAR);
		
		//계산하기
		int result = year - input;
		
		//출력하기
		
		System.out.println("당신의 나이는 " + result + "세 입니다.");
		//오전 오후
		System.out.println(cal.get(Calendar.AM_PM));
		//24시간
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		//이달의 마지막 날은?
		System.out.println(cal.getActualMaximum(Calendar.DATE));
		
		//이달의 몇번째 요일
		System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		
		Date date2 = cal.getTime();
		System.out.println(date2); //Mon May 31 10:08:27 KST 2021
		
		Long longTime = cal.getTimeInMillis();
		System.out.println(longTime); //1622423307247
		
		
		
		
		
		sc.close();
		
		
		
	}
}
