package day11;



public class ExceptionEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new MyException(100, "예외 상황입니다.");
		} catch(MyException e) {
			System.out.println(e.getMessage());
		} catch(Exception e) {
			System.out.println("Exception입니다.");
		}
	}

}
/* 이름에 예외가 들어간 MyException이라는 클래스를 만드는 것이 아니라
 * 예외 처리에서 사용할 수 있는 MyException 클래스를 생성
 * */
class MyException extends Exception{
	private final int ERR_CODE;
	public MyException(int err_code, String msg) {
		super(msg);
		ERR_CODE = err_code;
	}
	
	public MyException() { // 기본 생성자로 지정 안하면 ERR_CODE를 -1로 지정
		ERR_CODE = -1;
	}
	
	public MyException(int err_code) { 
		ERR_CODE = err_code;
	}
	
	public MyException(String msg) { 
		super(msg);
		ERR_CODE = -1;
	}

	public int getERR_CODE() {  // 상수여서 getter만 받는것이 가능
		return ERR_CODE;
	}
	
	@Override
	public String getMessage() {
		
		return "ERR_CODE : " + ERR_CODE + ", MSG: " + super.getMessage();
	}
	
}