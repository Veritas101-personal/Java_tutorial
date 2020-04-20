package day2;

public class OperatorEx4 {

	public static void main(String[] args) {
		// 비트 논리연산자:&, |. ~. ^
		
		int num1 = 12, num2 = 10;
		int num3 = num1 & num2;
		int num4 = num1 | num2;
		int num5 = num1 ^ num2;
		int num6 = ~num1;
		System.out.println("num1 & num2 = " + num3);
		System.out.println("num1 | num2 = " + num4);
		System.out.println("num1 ^ num2 = " + num5);
		System.out.println("~num1 = " + num6);
	
		// 비트시프트연산자: <<,>>
		// <<: 비트를 왼쪽으로 이동
		// >>: 비트를 오른쪽으로 이동
		// 비트 시프트 연산자는 비트를 이동시킨 후에 남은 자리를 부호비트로 채움
		
		/* 예시
		 * 10 - 00001010
		 * 10 >> 1 : 00000101 : 5
		 * 10 >> 2 : 00000010 : 2
		 * 10 >> 3 : 00000001 : 1
		 */
	
		//비트 시프트 연산자 예제
		System.out.println("10 << 1 : " + (10 << 1));
		System.out.println("10 << 2 : " + (10 << 2));
		System.out.println("10 << 3 : " + (10 << 3));
		
		System.out.println("10 >> 1 : " + (10 >> 1));
		System.out.println("10 >> 2 : " + (10 >> 2));
		System.out.println("10 >> 3 : " + (10 >> 3));
	
		/* 복합대입연산자
		 * 연산자를 줄여 사용
		 * += \= -= ...
		 */
		
		/* 조건연산자 (삼항 연산자)
		 * (조건식)?참:거짓;
		 * 변수 = (조건식)?참:거짓;
		 * 예시
		 * int num = 4;
		 * boolean isEven = num % 2 == 0 ? true : false;
		 * boolean isOdd = num % 2 == 0 ? false : true;
		 */
	
	}
	

}
