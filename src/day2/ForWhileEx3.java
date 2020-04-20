package day2;

public class ForWhileEx3 {

	public static void main(String[] args) {
		/* i는 1부터 5까지 1씩 증가
		 * 규칙성
		 * sum = 0
		 * i = 1, sum = 0 + 1
		 * i = 2, sum = 0 + 1 + 2
		 */
		
		int sum=0;
		
		for (int i = 1 ; i < 6 ; i++) {
		 sum = sum + i;
			System.out.println(sum);
		}
		
		
		
		

	}
}