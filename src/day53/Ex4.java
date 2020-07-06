package day53;

import java.util.Scanner;


public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		char a = 'n';
		
		System.out.println("문자를 입력하세요");
		for ( ; a != 'Y' && a != 'y' ; ) {
			a = scan.next().charAt(0);
		}
		
		
	}

}
