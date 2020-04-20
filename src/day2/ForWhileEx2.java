package day2;

import java.util.Scanner;

public class ForWhileEx2 {

	public static void main(String[] args) {
		/* 구구단 7단을 출력하는 코드를 for 문을 이용하여 작성하세요.
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구구단을 외자: ");
		int h = sc.nextInt();
			if (h > 0) {
				for (int i=1 ; i<10 ; i++) {
					System.out.printf("%d X %d = %d\n", h, i, h*i);
				} 
			} else if (h <=0) {
					System.out.println("0 밑으론 없는데?");
					h = sc.nextInt();
			} else {
				System.out.println("10이후론 무리!");
				h = sc.nextInt();
			}
		}
		
		
	
	
	}


