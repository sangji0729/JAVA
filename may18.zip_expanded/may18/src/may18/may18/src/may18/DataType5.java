package may18;

/*과일 : 사과, 배, 오렌지
 * 하루 생산량 : 5, 7, 5
 * 하루 총 생산량과 하루기준 시간당 생산되는 과일갯수 구하기
 */

public class DataType5 {

	public static void main(String[] args) {
		int apple = 5;
		int pear = 7;
		int orange = 5;
		
		int total = apple + pear + orange;
		float avg = (float) total / 24;
		
		System.out.println("총 생산 수 : " + total);
		System.out.println("시간당 생산 갯수 : " + avg);

	}

}
