package day18;

import java.util.*;

public class ReviewTest7 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요. : ");
		int a = scan.nextInt();
		
		int num = 0;
		int result = 0;
		
		while(a!=0) {
			
			result = result*10 + a%10;
			a /= 10;
			
		}
		System.out.println("결과 : " + result);
	}

}
