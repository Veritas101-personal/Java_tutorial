package day11;

import java.util.Scanner;

public class ExceptionTest1 {

	public static void main(String[] args) {
		/* 반복문을 통해 문자를입력받고 입력받은 문자가 1이면 1입니다라는 예외를 발생시키는 코드를 작성하세요
		 * 
		 * */
		
		Scanner scan = new Scanner(System.in);
		try {
			while(true) {
				System.out.print("문자를 입력하세요 : ");
				char i = scan.next().charAt(0);
					if (i == '1' ) {
						throw new Exception("예외가 발생했습니다. : " + i);
					
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally { // 예외 발생과 상관없이 무조건 실행되어야 하는 코드
			
		}
		
	}

	
}
