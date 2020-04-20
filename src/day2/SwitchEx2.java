package day2;

import java.util.Scanner;


public class SwitchEx2 {

	public static void main(String[] args) {
		/* 달(월)이 주어지면 해당하는 달의 마지막일을 출력하는 코드를
		 * switch문을 이용하여 작성하세요/
		 * 31 : 1 3 5 7 8 10 12
		 * 30 : 4 6 9 11
		 * 28 : 2
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("달을 입력하세요: ");
		int month = sc.nextInt();
		
		switch (month) {
			case 1:
				System.out.println("마지막 날 날짜: 31일");
				break;
			case 2:
				System.out.println("마지막 날 날짜: 28일");
				break;
			case 3:
				System.out.println("마지막 날 날짜: 31일");
				break;
			case 4:
				System.out.println("마지막 날 날짜: 30일");
				break;
			case 5:
				System.out.println("마지막 날 날짜: 31일");
				break;
			case 6:
				System.out.println("마지막 날 날짜: 30일");
				break;
			case 7:
				System.out.println("마지막 날 날짜: 31일");
				break;
			case 8:
				System.out.println("마지막 날 날짜: 31일");
				break;
			case 9:
				System.out.println("마지막 날 날짜: 30일");
				break;
			case 10:
				System.out.println("마지막 날 날짜: 31일");
				break;
			case 11:
				System.out.println("마지막 날 날짜: 30일");
				break;
			case 12:
				System.out.println("마지막 날 날짜: 31일");
				break;
		}
		
	}

}
