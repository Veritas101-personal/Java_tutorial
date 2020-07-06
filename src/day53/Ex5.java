package day53;

import java.util.Scanner;

public class Ex5 {

	
	/*
	 *  do while 문
	 *  do{
	 *		실행문;
	 *
	 *	}while(조건문);
	 *	- 최소 1번은 실행되는 반복문
	 *	break
	 *	-반복문을 빠져나가는 역할/ switch문을 빠져 나가는 역할
	 *	-if문과 같이 쓰임
	 *	continue
	 *	- continue를 만나면 for문의 경우 증감연산식으로, while문 경우 조건식으로
	 *	
	 * 
	 * 
	 * */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int a = 1;
		
		while (a<10) {
			System.out.printf("%d X %d = %d",9,a,9*a);
			System.out.println();
			a++;
		}
		
		char n='n';
		
		System.out.println("문자를 입력하세요:");
		
		while(n !='Y' || n !='y') {
			n = scan.next().charAt(0);
			if (n=='y'|| n=='Y')
				break;
		}
	}

}
