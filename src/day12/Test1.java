package day12;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문자를 입력하세요. : ");
		char ch = scan.next().charAt(0);
		System.out.print("반복할 횟수를 입력하세요 : ");
		int num = scan.nextInt();
		repeatChar(ch,num);
		System.out.println(repeatChar2(ch,num));

	}

	public static void repeatChar (char ch,int num) {
		
		for (int i = 0 ; i < num ; i++) {
			System.out.print(ch);
		}
		System.out.println();
		 
	}
	
	public static String repeatChar2 (char ch,int num) {
		StringBuffer res = new StringBuffer(num);
		for (int i = 0 ; i < num ; i++) {
			res.append(ch);
		}
		return res.toString();
		 
	}
	
}
