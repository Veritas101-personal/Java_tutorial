package day2;

import java.util.Scanner;

public class SwitchEx1 {

	public static void main(String[] args) {
		/* switch(변수나 식){
		 * case 값1:
		 * 		실행문1;
		 * 		break;
		 * case 값2:
		 * 		실행문2;
		 * 		break;
		 *default:
		 * 		실행문3;
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("값을 입력하세요: ");
		int num = sc.nextInt();
		
		switch (num%2) {
		case 0:
			System.out.println(num + "는 짝수");
			break;
		default:
			System.out.println(num + "는 홀수");
		}
	
	
	
	}

	

}
