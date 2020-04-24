package day5;

import java.util.Scanner;

public class ExtraWork3_rework {

	public static void main(String[] args) {
		/* 문자를 입력받아 입력받은 문자를 출력하세요.
		 * 
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < 5 ; i++) {
			System.out.print("Input a letter: ");
			char a = scan.next().charAt(0);
			if (a == 'q') {
				System.out.println("System Terminated!");
				System.out.println();
				break;
			} else {
			System.out.println("Output: " + a);
			System.out.println();
			}
		}
	
	}

}
