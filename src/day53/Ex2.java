package day53;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
		int a = scan.nextInt();
		
		if (a <= 100 && a >= 95) {
			System.out.println("A+");
		} else if (a < 95 && a >= 90) {
			System.out.println("A");
		} else if (a < 90 && a >= 85) {
			System.out.println("B+");
		} else if (a < 85 && a >= 80) {
			System.out.println("B");
		} else if (a < 80 && a >= 75) {
			System.out.println("C+");
		} else if (a < 75 && a >= 70) {
			System.out.println("C");
		} else if (a < 70 && a >= 65) {
			System.out.println("D+");
		} else if (a < 65 && a >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
		
	}
	
}
