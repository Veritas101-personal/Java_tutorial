package day5;

public class MethodEx1_2 {

	public static int greatCommon (int num1, int num2) {
		
		int cnt = 0;
		for (int i = 1; i <= num1; i++) {
			if (num1%i==0 && num2%i==0) {
				cnt = i;
			}
			
		}
		
		return cnt;
		
	}

	public static int minimumCommon (int num1, int num2) {
	
		int set = num1*num2/greatCommon(num1, num2);
		return set;
	}

	public static boolean isPrime(int num) {
		int cnt = 0;
		for (int i=1; i*i <= num; i++) {
			if(num % i == 0) {
				cnt++;
			}
		}
		if(cnt == 1) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		/* 두 정수의 최대 공약수를 알려주는 메소드
		 * 매개변수
		 * 리턴 타입
		 * 매소드명
		 */
		System.out.println(greatCommon(27,48));
		System.out.println(minimumCommon(25,50));
		if(isPrime(27)) {
			System.out.println("27은 소수");
		} else {
			System.out.println("27은 소수가 아님");
		}
		
	}
}