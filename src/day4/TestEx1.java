package day4;

import java.util.Scanner;


public class TestEx1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("두 정수와 문자 하나를 입력하세요");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		char a = scan.next().charAt(0);

	
		System.out.printf("입력하신 정수들과 문자: %d, %c, %d",num1,a,num2);
		
				
			
		
		
		
	}
	
}
