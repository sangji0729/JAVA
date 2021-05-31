package may31;

import java.util.Calendar;

public class DateFormat02 {

	public static void main(String[] args) {

		//아래와 같이 출력하는 프로그램을 만들어 주세요.
		//	2021년 5월 31일 월요일 오전 10시 30분 59초입니다.
		
		Calendar cal = Calendar.getInstance();
		//객체 생성 new + 생성자()
		//System.out.println(cal);
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DATE);
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		String weekStr = "";
		switch (week) {
		case 1:
			weekStr = "일요일";
			break;
		case 2:
			weekStr = "월요일";
			break;
		case 3:
			weekStr = "화요일";
			break;
		case 4:
			weekStr = "수요일";
			break;
		case 5:
			weekStr = "목요일";
			break;
		case 6:
			weekStr = "금요일";
			break;
		case 7:
			weekStr = "토요일";
			break;
		default:
			break;
		}
		
		String amPmstr = "";
		int ampm = cal.get(Calendar.AM_PM);
		
		if(ampm == 0) {
			amPmstr = "오전";
		}else {
			amPmstr = "오후";
		}
		
		int hour = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		
		System.out.println(year + "년 " + month +"월 " + day + "일 " + weekStr + " " + amPmstr + " " + hour + "시 " + min + "분 " + sec + "초 입니다.");
		
		
		
		
		
		
	}

}
