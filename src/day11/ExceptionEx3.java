package day11;


public class ExceptionEx3 {

	public static void main(String[] args) throws Exception {
		System.out.println(calc(1,'?',3));// 예외가 발생하여 프로그램 강제종료
		try {
			System.out.println(calc(1,'?',3));
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} // 이건 예외가 발생하지만, try catch 절차에 따라 예외 조건에 따라 정상적으로 프로그램 실행

	}
	/* calc 메소드는 예외처리르 하지 않고 예외만 발생시킴
	 * 예외처리는 main 메소드에서 처리예정
	 * 발생한 예외가 RuntimeException이면 메소드 옆에 발생 가능한 예외를 생략해도 되지만
	 * RuntimeException이 아닌 경우에는 메소드 옆에 발생 가능한 예외조건을 써줘야 한다.
	 * */
	public static double calc(int num1, char op, int num2) throws Exception { // throws exception이 발생 가능할 수도 있다는 말
		double res = 0.0;
		switch (op) {
		case '+': res = num1+num2; break;
		case '-': res = num1-num2; break;
		case '*': res = num1*num2; break;
		case '/': 
			if (num2 ==0) throw new ArithmeticException("0으로 나눌 수 없습니다.");
			res = (double)num1/num2; break;
		case '%': 
			if (num2 ==0) throw new ArithmeticException("0으로 나눌 수 없습니다.");
			res = num1%num2; break;
		default : throw new ArithmeticException(op+"는 산술연산자가 아닙니다.");
		}
		return res;
	}
	
}
