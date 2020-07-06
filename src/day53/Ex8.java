package day53;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요.");
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		System.out.println(addNum(a,b));
		
		scan.close();
	}

	public static int addNum (int a, int b) {
		
		int res = 0;
		
		if (a>b) {
			int tmp = a;
			a = b;
			b = tmp;
		} else {
			
		}
		
		for (int i = a ; i <= b ; i++) {
			res += i;
		}
		
		return res;
		
	}
	
}
