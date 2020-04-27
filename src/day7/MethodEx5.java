package day7;

import java.util.Scanner;

public class MethodEx5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = scan.nextInt();
		
		//요긴 void 방식
		isPrime(num);
		
		// 아래는 boolean 방식
		if (isPrime1(num) == false) {
			System.out.println("소수아님");
		} else {
			System.out.println("소수임");
		}
		
	}

	/* 기능: 주어진 정수가 소수인지 아닌지 알려주는 매소드
	 * 매개변수: num이 1과 자기 자신을 제외하고 나뉘어 지지 않으면 정수
	 * 리턴타입: int
	 * 매소드명: isPrime
	 * 
	 */
	
	public static void isPrime(int n) {
		
		int cnt = 0; // 약수의 갯수. 만약 이게 2개를 넘어가거나 1개이면 소수 아님
		
		for (int i = 2; i <= n ; i++) {
			if (n%i==0) {
				cnt++;
			} 
		} // 여기까진 소수의 갯수를 구하는 반복문
		
		if(cnt == 2) {
			System.out.println("입력하신 수는 소수입니다.");
		}else {
			System.out.println("입력하신 수는 소수가 아닙니다.");
		}
		
	}
	
	/* 기능: 주어진 정수가 소수인지 아닌지 알려주는 매소드
	 * 매개변수: 정수 - int num
	 * 리턴타입: 소수여 아니여 = 참, 거짓 = boolean
	 * 매소드명: isPrime
	 * 
	 */

	public static boolean isPrime1(int n) {
		if (n==1) // 1을 선언한 것때문에 결과 잘못 나오는 걸 방지!
			return false;
		int cnt = 0; // 약수의 갯수. 만약 이게 2개를 넘어가거나 1개이면 소수 아님
		
		for (int i = 2; i < n ; i++) {
			if (n%i==0) {
				cnt++; // 소수를 찾으면 카운트 증가. 즉 하나라도 증가하면 바로 부정
					return false;
			}
			
			
		}
		return true;
		
		
	}
	
}
