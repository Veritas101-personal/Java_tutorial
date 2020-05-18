package day18;

import java.util.Scanner;

public class ReviewTest2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int score = 0;
		
		System.out.print("성적을 입력하세요 : ");
		
		try {
			score = scan.nextInt();
		} catch (ArithmeticException e){
			System.out.println(e.getMessage());
		} 	System.out.println(detectScore(score));
		
	
		
	}

	public static String detectScore(int score) { // 재사용성을 고려하려 한다면, sysout은 비추
		
		if (score < 0) {
			throw new ArithmeticException("예외 : 성적 범위는 0~100점 입니다!");
		}
		
		if (score <= 100 && score >= 90) {
			return "A";
		} else if (score < 90 && score >= 80) {
			return "B";
		} else if (score < 80  && score >= 70) {
			return "C";
		} else if (score < 70 && score >= 60) {
			return "D";
		} else {
			return "F";
		} 
		
		
		
		
	}
	
}
