package day5;

import java.util.Scanner;


public class ExtraWork4_1 {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("Please input your test score: ");
		int num = scan.nextInt();
		while (true) {
			for (int i = 0 ; ; i ++) {
				if (num <= 100 && num >= 90) {
					System.out.printf("%d is A\n",num);
					System.out.println();
					System.out.print("Please input your test score: ");
					num = scan.nextInt();
				} else if (num < 90 && num >= 80) {
					System.out.printf("%d is B\n",num);
					System.out.println();
					System.out.print("Please input your test score: ");
					num = scan.nextInt();
				} else if (num < 80 && num >= 70) {
					System.out.printf("%d is C\n",num);
					System.out.println();
					System.out.print("Please input your test score: ");
					num = scan.nextInt();
				} else if (num < 70 && num >= 60) {
					System.out.printf("%d is D\n",num);
					System.out.println();
					System.out.print("Please input your test score: ");
					num = scan.nextInt();
				} else if (num < 60 && num > 0) {
					System.out.printf("%d is F\n",num);
					System.out.println();
					System.out.print("Please input your test score: ");
					num = scan.nextInt();
				} else if (num > 100) {
					System.out.printf("%d is Wrong number!\n",num);
					System.out.println();
					System.out.print("Please input your test score: ");
					num = scan.nextInt();
				}
				if (num <0) {
					System.out.printf("The total number of students who used are %d\n",i);
					System.out.println("System Terminated!");
					break;
				}
			}
		}
		
		
	}
	 
}