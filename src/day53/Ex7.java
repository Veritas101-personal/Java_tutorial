package day53;

import java.util.Scanner;


public class Ex7 {

	
	/*
	 * 배열
	 * - 동일한 자료형을 가지 데이터를 모아 놓은 것
	 * 
	 * - 배열 선언
	 * 자료형 배열명 [];
	 * 자료형 [] 배열명;
	 * 
	 * - 배열 생성
	 * 자료형 배열명 [] = new 자료형[갯수];
	 * 
	 * 	- 0번지부터 시작
	 *  - 마지막 번지: 크기 - 1
	 *  - 배열명 [번지] = 값;
	 *  변수 = 배열명[번지]; // 배열에 값을 설정
	 *  변수 = 배열명[번지]; // 배열에 있는 값을 가져옴
	 * 
	 * */
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("두 실수와 산술 연산자를 입력하세요.");
		
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		char c = scan.next().charAt(0);
		
		System.out.printf("%.2f %c %.2f = %.1f\n",a,c,b,calculator(a,b,c));

		scan.close();
		
	}

	public static double calculator(double a, double b, char c) {
		
		double i=0;
		
		switch(c) {
		
		case '+':
			i = a+b;
			
			break;
			
		case '-':
			i = a-b;
			
			break;

		case '*':
			i = a*b;
			
			break;
			
		case '/':
			i = a/b;
			
			break;
	
		case '%':
			i = a%b;
		
			break;
			
		default:
			
		}
		
		return i;
	}
	
	
}
