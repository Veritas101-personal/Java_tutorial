package day5;

import java.util.Scanner;

public class MethodEx2 {
	
	public static double Calculate (double num1, double num2, char a) {
		
		double result = 0;
		
		while (true) {
			if (a=='+') {
				result = num1+num2;
				break;
			} else if (a=='-') {
				result = num1-num2;
			} else if (a=='*') {
				result = num1*num2;
				break;
			} else if (a=='/') {
				result = num1/num2;
				break;
			} else if (a=='%') {
				result = num1%num2;
				break;
			} else {
			
			}
		}
		return result;
	}	
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("연산할 두 정수와 연산자를 입력하세요.");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		char e = scan.next().charAt(0);	
		System.out.println(Calculate (a,b,e));
		scan.close();
	}
	

}
/* 기능: 두 정수와 산술연산자가 주어지면 산술연산 결과를 알려주는 메소드
 * 단 예외 사항은 없다고 가정 (예: 잘못된 연산자가 들어오거나, 0으로 나누는 경우)
 * 
 * */
 
 