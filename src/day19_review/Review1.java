package day19_review;

import java.util.Scanner;

public class Review1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요. : ");
		int num = scan.nextInt();
		int storage = num;
		
		int reverseNum = 0;
		
		while (num!=0) {
			
			int tmp = num%10;
			
			num = num/10;
			
			reverseNum = reverseNum*10 + tmp;
			
		}
		
		
		System.out.println("정수를 뒤집은 값 : " + reverseNum);
		System.out.println("두 수의 합 : " + (reverseNum+storage));

	}

}
