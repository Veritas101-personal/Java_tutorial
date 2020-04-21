package day3;

import java.util.Scanner;

public class ForEx6 {

	public static void main(String[] args) {
		
		/* 정수 num가 소수인지아닌지 판별하는 코드를for문을 이용하여 작성하세요.
		 * 소수 : 약수가 2개인 수
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int i, isPrime;
		int cnt = 0;
		
		System.out.printf("수를 입력하세요: ");
		isPrime = sc.nextInt();
		for (i = 1 ; i <= isPrime ; i++) {
			if (isPrime%i==0) {
				cnt++;
			}
		}	if (cnt==2) {
				System.out.println("입력하신 수는 소수입니다.");
			} else {
				System.out.println("입력하신 수는 소수가 아닙니다.");
			}
		
	}
	
}
