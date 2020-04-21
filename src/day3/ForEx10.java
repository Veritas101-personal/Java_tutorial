package day3;

public class ForEx10 {

	public static void main(String[] args) {
		/* 구구단 2단부터 9단까지 출력하는 코드를 작성하세요
		 * 7단 ㅜㄹ력 예제를 활용
		 */

		int i , j;

		// 반복문에 이름을 붙여서 구구단 전체를 출력하는 코드에서 2단만 출력하도록 수정
		System.out.println("구구단을 외자");
		Loop1: for (i = 2 ; i <= 9 ; i++) {
				for (j = 1 ; j<=9 ; j++) {
					System.out.printf("%d X %d = %d\n", i,j,i*j);
					if(j==9) {
						break Loop1;
					}
				}
		
		
		
		}
	
	
	}
}
