package day5;

import java.util.Scanner;

public class ExtraWork2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please write numbers to make number lines.");
		int row = scan.nextInt();
		int col = scan.nextInt();
		
		for (int i =0, cnt = 1 ; i < row; i++) {
			for (int j=0; j<col ; j++) {
				System.out.printf("%2d", cnt++);
			}
			System.out.println();
		}
	
		// 아니면 이런 방법도 있다.
		for (int i =0, cnt = 1 ; i < row; i++) {
			for (int j=0; j<col ; j++) {
				System.out.printf("%2d", col * i + j +1);
			}
			System.out.println();
		}
	}
		
	

}
