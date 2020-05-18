package day15_review;

import java.util.Scanner;

public class NumberDetect {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("두 정수를 입력하세요.");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		System.out.println("최대공약수 : " + greatestCommonNum(num1,num2));
		System.out.println("최소공배수 : " + leastCommonNum(num1,num2));
		
	}
	
	static int greatestCommonNum (int a, int b) {
		
		int cnt =0;
		
		for (int i = 1 ; i < a || i < b ; i++) {
			if (a%i==0&&b%i==0) {
				cnt = i;
			} else {
				
			}
		}
		
		return cnt;
	}
	
	static int leastCommonNum (int a, int b) {
		
		int result1 = a/greatestCommonNum(a,b);
		int result2 = b/greatestCommonNum(a,b);
		
		return result1 * result2 * greatestCommonNum(a,b);
		
	}
}
