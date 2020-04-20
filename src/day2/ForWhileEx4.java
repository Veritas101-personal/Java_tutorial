package day2;

public class ForWhileEx4 {

	public static void main(String[] args) {
		/* num가 주어지면 주어진 num의 약수를 출력하는 코드를 for문으로 작성하세요.
		 * 약수 : 나누었을 대 나머지가 0인 수
		 * 4의 약수 : 1 2 4
		 * 1. 반복횟수
		 * 2. 규칙성 
		 * 3. 반복무 종료 후
		 * 
		 * 
		 */
		
		int i, num = 60;
		
		for (i = 1 ; i <= num ; i++) {
			if (num%i==0) {
				System.out.println(i);
			}
		}
		
	}

}
