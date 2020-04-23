package day5;

public class MethodEx1 {

	public static void main(String[] args) {
		int res = sum(1,2);
		int num = 3;
		//char res2 = sum(1,2);
		//int num1 = 1, num2 = 2;
		//char ch = 1+2;
		//ch = num1 + num2;
		System.out.println(res);
	}
	
	/*
	 *  * 음료수 자판기 = 메소드
	 * 돈, 메뉴 = 매개변수: 메소드를 실행하기 위해 필요한 최소한의 정보
	 * 음료수 = 리턴타입: 메소드 종료 후 알려주는 자료의 정보명
	 * 
	 * 기능 : 두 정수의 합을 알려주는 메소드
	 * 매개변수 : 두 정수 => int num1, int num2
	 * 리턴타입 : 합 => 정수 => int
	 * 메소드명 : sum
	 * 
	 * 
	 */
	
	public static int sum(int num1, int num2) {
		
		// return: 메소드를 종료하고, 값을 전달하는 역할
		return num1 + num2;
	}

}
