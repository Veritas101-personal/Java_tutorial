package day2;

public class ControlStatementEx1 {

	public static void main(String[] args) {
		// 조건문: ~하면/라면/이면 ...한다
		// if문 : 모든 조건문은 if문으로 표현 가능
		// 상황에 따라 switch문으로 표현하면 if문보다 간결하게 표현 가능
		
		/*if문 기본 문법
		 * if(조건식1) {
		 *		실행문1;
		 * } else if{ 조건식1이 거짓이고 조건식2가 참이면 실행문2를 실행
		 *  	실행문2;
		 *  } else { 모든 조건식이 거짓이면 실행문3 실행
		 *  	실행문3;
		 *  }
		 *  
		 *  ~하면 ...한다에서 ~은 조건식에 해당하고, ...은 실행문에 해당한다.
		 *  
		*/

		int num = 4;
		if(num % 2 == 0) {
			System.out.println(num+"는 짝수");
		} else {
			System.out.println(num+"는 홀수");
		}
		
	}

}
