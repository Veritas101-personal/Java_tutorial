package day2;

import java.util.Scanner;

public class IfEx3 {

	public static void main(String[] args) {
		/* 정수형 변수 num를 선언하고, num의 값을 초기화하며
		 * num가 2의 배수이면 2의 배수라고 출력하고,
		 * 3의 배수이면 3의 배수라고 출력하고,
		 * 6의 배수이면 6의 배수라고 추력하고,
		 * 2,3,6의 배수가 가니면 2,3,6의 배수가 아닙니다라고 출력하는 코드를 작성하라
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 값을 입력하세요: ");
		int num = sc.nextInt();
	
		if (num%6==0) {
			// 이 실행문까지 왔다는 것은 num은 기본 2의 배수이다
			// 그 중에서 3의 배수이기까지 num은 6의 배수이다
			System.out.println("6의 배수입니다.");
		} else if (num%3==0) {
			System.out.println("3의 배수입니다.");
		} else if (num%2==0) {
			System.out.println("2의 배수입니다.");
		} else {
			System.out.println("2,3,6의 배수가 아닙니다.");
		}
		
		sc.close();
	
		
	}

}
