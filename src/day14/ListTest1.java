package day14;

import java.util.*;

public class ListTest1 {
	
	public static void main(String[] args) {
		
		/*1-10 사이의 무작위 수 6개 출력받고 리스트에 넣음. 그러나 중복X 6*/
		
		ArrayList<Integer> randomList = new ArrayList<Integer>();
		
		int min = 1, max = 10;
		int limits = 6;
		int cnt = 0;
		
		while (cnt<limits) {

			int random = new Random().nextInt(max-min+1)+min;
			
			if (!(randomList.contains(random))) {
				randomList.add(random);
				cnt++;
			} else {
				
			
			}
			
		}
		System.out.println(randomList);
	}

}
