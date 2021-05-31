package may26;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


//로또
//1~45 중 6개뽑기, 중복불가

public class Lotto {

	public static void main(String[] args) {
		//랜덤
		//배열에 넣어주세요. 단 중복이 발생하면 다시 뽑아주세요.
		//1게임만
		//for, if, random
		
		
		
		int[] lotto = new int[6];
		
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random() * 45 + 1);
				for (int j = 1; j < i; j++) {
					if(lotto[i] == lotto[j]) {
						i--;
						break;
					}
				}
				
				
		
		}
		
	
		System.out.println("로또 번호는");
		System.out.println(Arrays.toString(lotto));
		
		
		//컬렉션 List, Set, Map
		Set<Integer> lotto2 = new HashSet<Integer>();
		//중복을 제거해주는 Set을 이용했습니다.
		
		while(lotto2.size() < 6) { //size()는 크 = 6보다 작다면
			lotto2.add((int)(Math.random() * 45 + 1));
			//add는 set에 값을 집어넣을때 사용합니다.
		}
		System.out.println("두번쨰 로또 번호는");
		System.out.println(lotto2);

	}

}
