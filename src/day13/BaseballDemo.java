package day13;

import java.util.*;

public class BaseballDemo {

	public static void main(String[] args) {
		HashSet<Integer> hs3 = new HashSet<Integer>();
		HashSet<Integer> hs4 = new HashSet<Integer>();
		hs3.add(1);
		hs3.add(3);
		hs3.add(2);
		hs4.add(1);
		hs4.add(4);
		hs4.add(3);
		Iterator<Integer> it1 = hs3.iterator();
		Iterator<Integer> it2 = hs4.iterator();
		int i = 1;
		while (it1.hasNext() && it2.hasNext()) {
			Integer num1 = it1.next();
			Integer num2 = it2.next();
			if(num1.equals(num2)) {
				System.out.println(i+"번째로 가져온 값"+num1+"은 같습니다.");
			} else {
				System.out.println(i+"번째로 가져온 값"+num1+"과 " +num2+"는 다릅니다.");

			}
		}
		

	}

}
