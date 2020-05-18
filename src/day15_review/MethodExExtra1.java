package day15_review;

import java.util.Scanner;

public class MethodExExtra1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("두 정수와 연산자를 입력하세요.");
		try {
			int a = scan.nextInt();
			int b = scan.nextInt();
			char m = scan.next().charAt(0);
		
			detectEquals(a,b,m,scan);
		} catch (Exception e) {
			
		}
		
		
	}

	public static int addNum(int num1, int num2) {
		
		int result = num1 + num2;
		
		return result ;
	}
	
	
	public static int subtractNum(int num1, int num2) {
		
		int result = num1 - num2;
		
		return result ;
	}
	
	public static int multipleNum(int num1, int num2) {
	
		int result = num1 * num2;
	
		return result ;
	}

	public static double divideNum(int num1, int num2) {
	
		double result = num1 / num2;
	
		return result ;
	}

	public static int leftNum(int num1, int num2) {
	
		int result = num1 % num2;
	
	return result ;
	
	}

	public static void detectEquals(int num1, int num2, char a,Scanner scan) {
		
		switch(a) {
		
		case '+':
			System.out.printf("%d %s %d = %d\n",num1,a,num2,addNum(num1,num2));
			break;
		case '-':
			System.out.printf("%d %s %d = %d\n",num1,a,num2,subtractNum(num1,num2));
			break;
		case '*':
			System.out.printf("%d %s %d = %d\n",num1,a,num2,multipleNum(num1,num2));
			break;
		case '/':
			if (num2==0) {
				throw new ArithmeticException("숫자를 0으로 나눌 수 없습니다.");
			} else {
				System.out.printf("%d %s %d = %d\n",num1,a,num2,divideNum(num1,num2));
			break;
			}
		case '%':
			System.out.printf("%d %s %d = %d\n",num1,a,num2,leftNum(num1,num2));
			break;
		default: 
			System.out.printf("%s는 연산자가 아닙니다.\n",a);
		
			
		}
		
		
		
		
	}
	
	
}
