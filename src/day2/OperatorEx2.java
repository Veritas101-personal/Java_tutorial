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
		System.out.println(3/0.0);
		
		// %: 나머지 연산자, A%B 를 나누었을 때 나머지
		// 주로 배수(홀짝), 약수를 구할 때 사용
	}

}
