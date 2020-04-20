package day2;

public class OperatorEx2 {

	public static void main(String[] args) {
		// 산술 연산자 예제 
		System.out.println(1/2); // 정수/정수 = 정수
		System.out.println(1.0/2); //실수/정수 = 실수
		//자료형변환을 이용하여 정수/정수를 실수/정수로 변환
		int num1 = 1, num2 = 2;
		System.out.println((double)num1/num2);
		// System.out.println(3/0); 에러발생!
		System.out.println(3/0.0); // 무한대로 표시
		
		// %: 나머지 연산자, A%B 를 나누었을 때 나머지
		// 주로 배수(홀짝), 약수를 구할 때 사용
	
		int a = 1_000_000, b = 2_000_000;
		
		long c = (long)a*b;
		System.out.println(c);
		
		char ch1 = 'A';
		char ch2 = 'A' + 1;
		System.out.println(ch2);
		char ch3 = (char)(ch1 + 1);
		System.out.println(ch3);
		
		//대입연산자 "="
		/* 오른쪽에 있는 값을 왼쪽에 저장
		 * 왼쪽엔 상수 없음
		 * 왼쪽에는 연산자 올 수 없음
		 * 비교 연산자 ==와많이 혼동(조건문)
		 */
		
		//비교 연산자: <,>,<=,>=,\, !=,
		// 비교연산자는 결과가 참 또는 거짓으로 나옴
		// 결과가 참 또는 거짓만 나오는 식 = 조건식
		
		//논리 연산자: &&, ||, !;
		//&&: ~하고, 둘다 참인 경우만 참, 나머지는 다 거짓
		//ex) A학점:성적이 90점 이상,100 이하
		// || ~ 하거나, 둘 다 거짓인 경우에만 거짓, 나머지는 다 참
		//
		//논리 연산자, 조건식 중 하나!
		
		// score가 90점이상, 100점이하 
		// score >= 90 && score <=100; (90 <== score <== 100)은 자바에선 에러발생!
		
		
	}

}
