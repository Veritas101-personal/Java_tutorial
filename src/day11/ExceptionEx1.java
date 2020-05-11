package day11;

public class ExceptionEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * try {
		 * 		// 예외가 발생할 수 있는 코드
		 * } catch (예외클래스1 e) {
		 * 		// 예외처리
		 * } catch (예외클래스2 e) {
		 * 		// 예외처리
		 * } catch (Exception e) {
		 * 		// 예외처리 - 'Exception'은 반드시 맨 밑에 와야한다. 
		 * 					'exception'은 모든 예외 클래스의 상위격 존재라서 이 뒤에는 예외사항이 없다고 간주됨
		 * 
		 * */
		
		try {
			System.out.println(1/0);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다."); // 해당 클래스가 조건이 되서 발동. 없으면 맨 밑의 exception이 옴
		} catch (IndexOutOfBoundsException e) {
			System.out.println("배열 관련 예외가 발생!");
		} catch (Exception e) {
			System.out.println("예외 발생!");
		}
		
		// exception이 없어도 try catch 구문이 성립이 되지만 왠만해선 넣어줄 것을 추천.
		
		try {
			int arr[] = new int[4];
			arr[4] = 10;
			
		} catch(ClassCastException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("배열 관련 예외가 발생!");
		} catch (Exception e) {
			System.out.println("예외 발생!");
		}
		// 만약 모든 예외 조건을 회피하면 트라이 캐치문 발동 X
		
	}
	

}
