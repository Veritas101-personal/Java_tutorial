package day2;

import java.util.Scanner;

public class IfEx2 {

	public static void main(String[] args) {
		// 변수 num를 선언하고 num의 초기값을 설정하여
		// num이 0이면 0이라고출력하고, num이 양수이면 양수로
		// num이 음수이면 음수라고출력하는 코드를 if문으로 이용하여 작성하시오

		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("num값 입력하세요: ");
		int num = sc.nextInt();
		
		if (num == 0) {
			System.out.println("num은 0");
		} else if (num>0) {
			System.out.println(("num은 양수"));
		} else {
			System.out.println("num은 음수");
			
		}
		
	}
}
