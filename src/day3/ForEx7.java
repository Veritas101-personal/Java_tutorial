package day3;

import java.util.Scanner;


public class ForEx7 {

	public static void main(String[] args) {
		/* 두 정수 num1과 num2의 최대 공약수를 구하는 코드를 작성하세요
		 * 최대 공약수: 공약수 중에서 가장 큰 수
		 * 공약수: 두수의 약수 중 공통으로 있는 수
		 * 약수 : 나누어 떨어지는 수
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		int i;
		int gcd = 0;
		
		System.out.printf("첫번째 정수를 입력하세요: ");
		num1 = sc.nextInt();
		
		System.out.printf("두번째 정수를 입력하세요: ");
		num2 = sc.nextInt();
	
			for (i = 1 ; i <= num1 ; i++) {
				if (num1%i==0 && num2%i==0) {
					gcd = i;
				}
				
			}
		System.out.println(gcd);
				
	}
}
