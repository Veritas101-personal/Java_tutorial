package day18;

import java.util.*;

public class ReviewTest6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수의 갯수를 입력하세요.");
		
		int a = scan.nextInt();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		System.out.println("입력하신 갯수만큼 정수를 입력하세요.");
		for (int i = 0 ; i < a ; ) {
			int b = scan.nextInt();
			if(list.contains(b)) {
				
			} else {
				 list.add(b);
				 i++;
			}
		
			
		}
		
		
		
		for (int j = a-1 ; j >=0 ; j--) {
			System.out.print(list.get(j) + " ");
		}
		
		
	}
}
