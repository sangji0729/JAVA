package sungwoo.sourcecord;

public class methodArea {

	public static void main(String[] args) {
		
		int result = adder(10, 50);
		System.out.println(result);
		System.out.println("end of program");
	}
	
	public static int adder(int n1, int n2) {
		int addresult = n1 * n2;
		return addresult;
	}

}
