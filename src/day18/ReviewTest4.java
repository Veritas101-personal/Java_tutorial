package day18;

import java.util.Scanner;


public class ReviewTest4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int a = scan.nextInt();
		
		if (detectDecimal(a)==true) {
			System.out.println("소수입니다.");
		} else {
			System.out.println("소수가 아닙니다.");
		}
	}

	public static boolean detectDecimal (int a) {

		if(a==1) { // 1은 소수가 아니므로 false!
			return false;
		}
		
		for (int i = 2; i < a ; i++) { // 결국 1을 제외하면 자기 자신으로만 나누어 져야 함. 자기 자신은 범위에 넣지 않음으로 스스로를 나누는 걸 방지
			if(a%i==0) {
				return false;
			} // 여기까지 오면 자신을 나눌 수 있는 수는 없다는 뜻 (1은 모든 수가 나눌 수 있고, 자기자신은 i 범위에 없으므로)
		
		
		}
		return true; 
	}
}
