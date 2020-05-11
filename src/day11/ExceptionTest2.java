package day11;

import java.util.Scanner;

public class ExceptionTest2 {

	public static void main(String[] args) {
		/* 정수값을 반복적으로 받는 코드에서 실수로 정수대신 문자를 입력했을 때 예외를 처리하도록 코드를 작성하세요.*/

		int a = 0;
		
		Scanner scan = new Scanner(System.in);
		try {
			
		while(true) {
			System.out.println("정수를 입력하세요.");
			a = scan.nextInt();	
		
		} 
		} catch (Exception e) {
			System.out.println("문자여");
		
		}
	}

}
