package day18;

import java.util.Scanner;

public class ReviewTest5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("두 정수를 입력하세요.");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		if (detectRelativelyPrime(a, b)==true) {
			System.out.println("서로소입니다.");
		} else {
			System.out.println("서로소가 아닙니다.");
		}
		
	}

	public static boolean detectRelativelyPrime(int a, int b) {
		
		int cnt = 0;
		
		for (int i = 1 ; i <= a || i<= b ; i++) {
			if (a%i==0 & b%i==0) {
				cnt = i;
			} else {
				
			}
		}
		
		if (cnt==1) {
			return true;
		} else {
			return false;
		}
		
		
	}
	
}
