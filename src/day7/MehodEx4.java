package day7;

import java.util.Scanner;

public class MehodEx4 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int s = scan.nextInt();
		int e = scan.nextInt();
		
		int result = printMultiplTable(n,s,e);
		
		if (result == 0) {
			System.out.println("0단의 모든 값은 0입니다.");
		} else if (result == -1) {
			System.out.println("구구단의 시작 번호와 끝 번호가 바뀌었습니다.");
		}
		
		
	}
	
	/* 기능: num가 주어지면 num단을 구구단의 한 단을 출력하는 메소드
	 * 		리턴값을 이용하여 예외처리까지 신경쓰는 예제
	 * 매개변수: n단, 단의 시작, 단의 끝
	 * 리턴타입: 0 - 0단 입력 -> 입력오류
	 * 			1 -> 정상출력
	 * 			-1 - s>e -> 입력오류
	 * 
	 * 메소드명: printMultiplTable
	 */
	
	public static int printMultiplTable (int n, int s, int e) {
		if (n ==0) 
			return 0;
		if (s > e)
			return -1;
		
		
		for (int cnt = s ; cnt <= e; cnt++) {
			System.out.printf("%d * %d = %d\n", n, cnt, n*cnt);
			}
		
		return 1;
	}

}
