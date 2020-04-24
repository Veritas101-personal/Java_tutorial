package day5;

import java.util.Scanner;


public class ExtraWork4 {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("Please input your test score: ");
		int num = scan.nextInt();
		
		if (num <= 100 && num >= 90) {
			System.out.println("A");
		} else if (num < 90 && num >= 80) {
			System.out.println("B");
		} else if (num < 80 && num >= 70) {
			System.out.println("C");
		} else if (num < 70 && num >= 60) {
			System.out.println("D");
		} else if (num < 60) {
			System.out.println("F");
		} else if (num > 100) {
			System.out.println("Wrong number!");
		}
		
		
		
	}
	 
}
