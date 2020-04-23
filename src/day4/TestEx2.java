package day4;

import java.util.Scanner;


public class TestEx2 {

	public static void main(String[] args) {
		/* 입력받으 문자가 +이면 두 수의 합을 출력하고 -이면 두 수의 차를, /이면 두수의 나눈 결과를, *이면 두수의 곱한 값을
		 * %면 나머지 값을 출력하는 코드를 작성하세요.
		 */

		Scanner scan = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		char a;
	


		System.out.println("두 정수와 연산문자 하나를 입력하세요");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		a = scan.next().charAt(0);
		 
		while(true) {
 			if (a=='+') {
				System.out.printf("%d %c %d = %d", num1, a, num2, num1+num2);
				break;
			} else if (a=='-') {
				System.out.printf("%d %c %d = %d", num1, a, num2, num1-num2);
				break;
			} else if (a=='/') {
				System.out.printf("%d %c %d = %d", num1, a, num2, num1/num2);
				break;
			} else if (a=='*') {
				System.out.printf("%d %c %d = %d", num1, a, num2, num1*num2);
				break;
			} else if (a=='%') {
				System.out.printf("%d %c %d = %d", num1, a, num2, num1%num2);
				break;
			} else if (a!='+' || a!='-' || a!='/' || a!='*' || a!='%' ) {
				System.out.println("연산문자가 아닙니다. 연산문자를 입력하세요!");
				a = scan.next().charAt(0);
				continue;
			} else {
			}
		
		}
		scan.close();
	}

	private static char charAt(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

}
