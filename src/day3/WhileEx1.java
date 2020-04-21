package day3;

import java.util.Scanner;

public class WhileEx1 {

	public static void main(String[] args) {
			/* while (조건식) { - while에선 조건식 생략 X
			 * 		실행문
			 * }
			 * 
			 * 초기화;
			 * while(조건식)
			 * 			실행문;
			 * 			증감연산식;
			 * 
			 */
		
			// while에서 무한루프 해제
			/*
			while() {
				System.out.println("Hi");
			}
			
			do while은 무조건 1번은 실행된다.
			
			do {
					실행문;
			}	while (조건식);
			
			
			
			
			
			
			*/
		Scanner scan = new Scanner(System.in);
		
			int menu = 0;
			do {
				
			
				System.out.println("1.메뉴1");
				System.out.println("2.메뉴2");
				System.out.println("3.메뉴3");
				System.out.println("4.종료");
				System.out.println("메뉴를 입력하세요.");
				menu= scan.nextInt();				
				
			} while (menu != 4);
				
		scan.close();
	}

}
