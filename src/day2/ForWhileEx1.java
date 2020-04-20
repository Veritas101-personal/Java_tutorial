package day2;

public class ForWhileEx1 {

	public static void main(String[] args) {
		/* 반복문
		 * 규칙성을 가진 작업을 반복적으로 할 때 사용
		 * 1. 규칙성 찾기
		 * 2. 반복횟수
		 * 
		 * for, while vs do while
		 * 
		 * for문 문법
		 * for(1.초기화; 2.5.8.조건식 ; 4.7.증감연산식) {
		 * 			3.6.실행문
		 * 
		 * 1. 초기화: 조건식이나 실행문에서 사용하는 변수의 값을 초기화하는 곳으로, 생략할 수 있고, 여러 변수를 통해 초기화 할 수 있다.
		 * 2. 조건식: 반복문이 실행되기 위한 조건으로 참이며 반복문을 계속 실행. 거짓이면 반복문을 종료, 생략 할 수 있으며 생략할 경우 무조건 참
		 * 3. 실행문 
		 * 4. 증감연산식: 조건식에서 사용하는 변수를 증가 또는 감소 시켜서 반복횟수를 조절, 생략 할 수 있음
		 * 	반복문에서 반복횟수는 초기화 + 조건식 + 증감연산식이 함께 관여
		 * 
		 */

		// for문 기본 예제 : Hello world 5번 출력
		
		for (int i = 1 ; i < 6 ; i++) {
			System.out.println("Hello world!");
		}
		System.out.println("----------------------");
		for (int i = 0 ; i < 5 ; i++) {
			System.out.println(i);
		}
		System.out.println("----------------------");
	}

}
