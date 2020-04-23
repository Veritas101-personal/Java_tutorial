package day5;

import java.util.Scanner;


public class MethodEx1_1 {


	public static void greatCommon (int num1, int num2) {
		
		
		int cnt = 0;
		for (int i = 1; i <= num1; i++) {
			if (num1%i==0 && num2%i==0) {
				cnt = i;
			}
			
		}
		
		System.out.println(cnt);
		
	}
	// 팁: 하나의 메소드엔 하나의 기능만 구현하자! 즉 계산식 담당은 계산만 (문자 출력 포함하지 말고!)
	// 팁2: 값 입력과 화면 출력은 메인 메소드에서만.
	// 팁3: 정말, 정말, 정말! 한 메소드엔 하나의 작업만! 계산할거면 계산만 하라고!
	
	public static void main(String[] args) {
		/* 두 정수의 최대 공약수를 알려주는 메소드
		 * 매개변수
		 * 리턴 타입
		 * 매소드명
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("두 정수를 입력하세요.");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		scan.close();
		greatCommon(num1,num2);
		
		
		
	
	}

}
