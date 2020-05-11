package day11;

public class ExceptionEx2 {

	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 0;
		char op = '?';
		
		try {
			switch (op) {
			case '+': System.out.println(num1+num2); break;
			case '-': System.out.println(num1-num2); break;
			case '*': System.out.println(num1*num2); break;
			case '/': System.out.println(num1/num2); break;
			case '%': System.out.println(num1%num2); break;
			default : throw new Exception("잘못된 연산자!");
			}
		} catch(Exception e) { // e가 앞에 throw한 구문을 받아줌
			System.out.println(e.getMessage()); // throw 한 구문을 출력!
		}
		
	}

}
/* 1. 자식 -> 부모 자동형변환
 * 2. 부모 -> 자식 명시적형변환
 * 부모클래스 이름 : P
 * 자식클래스 이름 : C
 * P p = new P();
 * C c = new C();
 * P p1 = c;
 * C c2 = (C)p; // 에러발생!
 * C c3 = (C)p1;
 * 
 * 
 * */
 