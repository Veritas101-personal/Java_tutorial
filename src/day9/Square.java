package day9;

public class Square extends Shape {
	public void print() { // 만약 한군데만 바꾸려고 한다면 오버라이드 부분 전체 복사해서 변경;;; (귀찮;;)
		// 그리고 메소드나 변수가 private 상태면 값을 받을 수 없다는 걸 상기하고 get 메소드를 대신 사용.
		System.out.println("--------사각형의 정보----------");
		System.out.printf("시작점은 (%d,%d)\n",getLeft(),getUp());
		System.out.printf("가로 : %.2f\n",getWidth());
		System.out.printf("세로 : %.2f\n",getHeight());
		System.out.println("---------------------------");
		
	
	}
	public Square () {
		squareCall++;
	}
	public Square(int left, int up, double width, double height) {
		// 근데 아래의 메소드가 없으면 값이 안나온다. 왜? 걍 변수 값이 없어서!
		super(left,up,width,height); // => 요걸로 부모 클래스의 값을 받아서 사용 / 
		//자식 클래스의 생성자에서 부모 클래스의 생성자를 super()를 통해 호출 가능
		
		/* 요것도 가능
		 * setLeft(left);
		 * setUp(up);
		 * setWidth(width);
		 * setHeight(height);
		 */
		squareCall++;
	}
	
	// static 메소드(클래스 메소드)는 다향성이 적용되지 않아 오버라이딩불가! 그러나 그렇게 보이게 되는 경우가 있는데 이걸 하이딩이라고 함.
	// 정확하게 확인을 하고 싶으면 해당 메소드 위에 @Override 입력!
	public static void squareCount() {
		System.out.println("사각형 호출 횟수: " + squareCall);
	}
}
// 상속은 필수가 아니다. 그러나 코드 재사용이 가능하기 때문에 권장됨.