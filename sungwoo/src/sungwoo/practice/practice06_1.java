package sungwoo.practice;

public class practice06_1 {

	public static void main(String[] args) {
		jungsu(7, 3);
	}
		public static void jungsu(int fst, int lst) {
			System.out.println("덧셈 결과 : " + (fst + lst));
			System.out.println("뺄셈 결과 : " + (fst - lst));
			System.out.println("곱셈 결과 : " + (fst * lst));
			System.out.println("나눗셈 결과 : " + (fst / lst) + " 나머지 : " + (fst % lst));
		}

	}


