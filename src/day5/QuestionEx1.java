package day5;

import java.util.Scanner;

public class QuestionEx1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("입력할 알파벳과 숫자를 입력하세요.");
		char cha = scan.next().charAt(0);
		int num = scan.nextInt();
		
	
		char tmp;
		
		for (int i=1;i<=num;i++) {
			for (int j=1;j<=i;j++) {
				 tmp = (char)(cha+j-1);
				System.out.print(tmp);
				
			}
		
		System.out.println();
		}
			
	}
		

	

}
