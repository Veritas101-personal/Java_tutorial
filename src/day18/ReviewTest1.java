package day18;

import java.util.*;

public class ReviewTest1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		System.out.println(greatestCommonMinNum(a, b));
		System.out.println(leastCommonMaxNum(a, b));

	}

	public static int greatestCommonMinNum(int a, int b) {
		
		int cnt = 0;
		
		if (a <= 0 || b <= 0)
			throw new ArithmeticException("예외 : 최대공약수는 0을 제외한 두 양의 정수가 필요합니다!");
		
		for (int i = 1 ; i < a || i < b ; i++) {
			if (a%i==0 && b%i==0) {
				cnt = i;
			} else {
				
			}
		
		} 
		
		return cnt;
		
		
	}
	
	public static int leastCommonMaxNum(int a, int b) {
		
		
		int result1 = a / greatestCommonMinNum(a, b);
		int result2 = b / greatestCommonMinNum(a, b);
		
		return result1 * result2 * greatestCommonMinNum(a, b);
		
	}
	
	
}
