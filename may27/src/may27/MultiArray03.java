package may27;
//성적 입력 및 출력하는 프로그램
//학생이름, java, jsp, spring, total 입력받
//학생이름, java점수, jsp점수, spring점수, 총점, 평균, 등급 출력
//2차원배열, 스위치, for, if 
import java.util.Scanner;

public class MultiArray03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("학생 수를 입력하세요 : ");
		int input = sc.nextInt();
		
		int[][] student = new int [input][4]; //student[학생수][과목점수(java, jsp, spring, 총점]
		String[] name = new String[input]; //입력받을 학생수
		String[] subject = {"java", "jsp", "spring"};
		char[] grade = new char[input];
		double[] avg = new double[input];//학생수
		
		
		for (int i = 0; i < student.length; i++) {
			System.out.print("이름을 입력하세요 : ");
			name[i] = sc.next();// 이름저장 
			for(int j = 0; j < subject.length; j++) { 
				do {
					System.out.println(subject[j] + " 점수를 입력하세요.");
					student[i][j] = sc.nextInt();
				}while (student[i][j] < 0 || student[i][j] > 100);
			
			/* do {
				System.out.println(subject[1] + " 점수를 입력하세요.");
				student[i][j] = sc.nextInt();
			}while (student[i][j] < 0 || student[i][j] > 100);
			
			do {
				System.out.println(subject[2] + " 점수를 입력하세요.");
				student[i][j] = sc.nextInt();
			}while (student[i][j] < 0 || student[i][j] > 100); */
			
		   }
			
				
				//총점
			student[i][3] = student[i][0] + student[i][1] + student[i][2];
				//평균
			avg[i] = student[i][3] / 3.0;
			
			
			
			
				//등급
			switch ((int) avg[i] / 10) {
			case 10:
			case 9:
				grade[i] = 'A';
				break;
			case 8:
				grade[i] = 'B';
				break;
			case 7:
				grade[i] = 'C';
				break;
			default:
				grade[i] = 'F';
				break;
				
				
			}
			
		}
		for (int i = 0; i < student.length; i++) {
			System.out.printf("이름 : " +  name[i] + " 자바점수 : " + student[i][0] + " jsp점수 : " + student[i][1] + 
					" spring점수 : " + student[i][2] + " 총합 : " + student[i][3] + 
		" 평균 : " +avg[i] + " 등급 : " + grade[i] + " \n");
		}
		//전체출력
		
		
		//%s = 스트링타입, %S = 모두 대문자처리,
		//ex) %3.3s = 3.3 = 3칸 할당 3개만 표시하고 나머지는 삭제
		//%d =정수타입 ex) %4d = 4칸할당해서 찍음 60이면 __60
		//%f = 실수타입. 소숫점 아래 두자리까지 60.123이면 60.12
		
		sc.close();
		
	}

}
