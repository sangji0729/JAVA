package may21;

public class If03 {

	public static void main(String[] args) {
		//랜덤값 뽑기 
		
		int number = (int) (Math.random() * 5 + 1);
		System.out.println(number); // 1 ~ 5
		
		if(number == 1) {
			System.out.println("출력값은 1 입니다.");
		}else if(number == 2) {
			System.out.println("출력값은 2 입니다.");
		}else if (number == 3) {
			System.out.println("출력값은 3 입니다.");
		}else if (number == 4) {
			System.out.println("출력값은 4 입니다.");
		}else {
			System.out.println("출력값은 5입니다.");
		}
	}

}
