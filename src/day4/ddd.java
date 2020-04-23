package day4;

import java.util.Scanner;

public class ddd {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int s;
		int e;
		
		System.out.println("두 정수를 입력하세요");
		s = scan.nextInt();
		e = scan.nextInt();
		
		while(true) {
			if (s > 9 || s < 2) {
				System.out.println("INPUT ERROR!");
				s = scan.nextInt();
			} else if (e > 9 || e < 2) {
				System.out.println("INPUT ERROR!");
				e = scan.nextInt(); 
			} 
		for (int i = 1; i < 10 ; i++) {
			System.out.printf("%d * %d = %2d %3d * %d = %d\n",s,i,s*i,e,i,e*i);
			}
		break;
		}

		}
	}