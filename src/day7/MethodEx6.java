package day7;

import java.util.Scanner;

public class MethodEx6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("무작위로 지정할 랜덤값의 최댓값과 최소값을 지정하세요");
		int max = scan.nextInt();
		int min = scan.nextInt();
		
		System.out.println("랜덤값: " + random(max,min));
	}

	/* 기능: 임의의 정수를 생성하여 알려주는 메소드
	 * 매개변수: r값이 1이거나 약수가 2개를 넘기면 false, 아니면 트루
	 * 리턴타입: int
	 * 메소드명: random
	 * 
	 */
	
	public static int random(int max, int min) {
		
		if (max<min) { // 만약 최댓값과 최소값을 반대로 입력했을 경우 치환
			int tmp = min;
			min = max;
			max = tmp;
		}
		int r= (int)((Math.random()*(max-min+1)+min));
		return r;
	}
}
