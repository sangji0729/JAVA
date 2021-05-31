package may31;

import java.util.Date;

public class DateFormat04 {

	public static void main(String[] args) {
		//System.currentTimeMillis()
		
		long millis = System.currentTimeMillis();
		System.out.println(millis); //1622427820242
		//1970년부터 지금까지 흐른 ms시간
		//1000 * 60 * 60 * 24 
		
		//다시 Date
		Date date = new Date(127, 5, 1); //연도 월 일
		System.out.println(date); // Tue Jun 01 00:00:00 KST 2027

		//4월 29일 2030년
		Date date2 = new Date(130, 3, 29);
		System.out.println(date2); // Mon Apr 29 00:00:00 KST 2030

		System.out.println(date.getTime()); //1811775600000
		
		//이번 크리스마스까지 며칠 남았나요?
		date = new Date();
		System.out.println(date); //Mon May 31 11:36:20 KST 2021

		Date xMas = new Date(121, 11, 25);
		System.out.println(xMas); // Sat Dec 25 00:00:00 KST 2021

		long howLong = xMas.getTime() - date.getTime();
		System.out.println(howLong); // 17929295275
		
		long result = howLong / (1000 * 60 * 60 * 24);
		 
		System.out.println("올 크리스마스까지 " + result);
		//올 크리스마스까지 207

		//크리스마스 요일은?
		int day =xMas.getDay();
		System.out.println(day); //6
		
		switch (day) {
		case 0:
			System.out.println("일요일 입니다.");
			break;
		case 1:
			System.out.println("월요일 입니다.");
			break;
		case 2:
			System.out.println("화요일 입니다.");
			break;
		case 3:
			System.out.println("수요일 입니다.");
			break;
		case 4:
			System.out.println("목요일 입니다.");
			break;
		case 5:
			System.out.println("금요일 입니다.");
			break;
		case 6:
			System.out.println("토요일 입니다.");
			break;
		default:
			break;
		}
		
		long millis2 = System.currentTimeMillis();
		System.out.println("소요시간 : " + (millis2 - millis));
		
		
		
	}

}
