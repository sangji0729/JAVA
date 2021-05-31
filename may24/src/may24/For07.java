package may24;

import java.util.Scanner;

/*
  
 
 *
 **
 ***
 ****
 *****
 
 
 */

public class For07 {

	public static void main(String[] args) {
		
		for(int i = 5; i >= 1; i--) { // 줄
			for (int j = 0; j < i; j++) { // 별
				System.out.print("*");
			}
			System.out.println("");
		 	
		}System.out.println("======================");
		
		
		for (int i = 0; i < 5; i++) {//스페이스
			for (int j = 4; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j < (i + 1) * 2; j++) {//별
				System.out.print("*");
				
			}System.out.println("");
		}
		System.out.println("=====================");
		
		
		for (int i = 0; i < 5; i++) {
			if(i % 4 == 0) {
				for (int j = 0; j < 5; j++) {
					System.out.print("*");
					}						
				}else { 
				System.out.print("*   *");
			}
			System.out.println(" ");
		}
		System.out.println("=======================");
		
		
		
		
		
		for(int i = 0; i < 5; i ++) {//줄
			for(int j = 0; j < 5; j++) {//별
				if(j == 0 || j == 4) {
					System.out.print("*");
					
				}else if(j == 1 && i == 1) {
					System.out.print("*");
				}else if(j == 2 && i == 2){
					System.out.print("*");
				}else if(j == 3 && i == 3){
					System.out.print("*");
				}
				else {
					System.out.print("_");
				}
			}System.out.println("");
		}
		System.out.println("====================");
		
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		if(input % 2 == 0) {
			input++;
		}
		for(int i = 0; i < input; i++) {
			for (int j = 0; j < input; j++) {
				if(j == 0 || j == input - 1 || i == j) {
					System.out.print("N");
				}else {
					System.out.print("_");
				}
			}System.out.println("");
		}sc.close();
	}

}
