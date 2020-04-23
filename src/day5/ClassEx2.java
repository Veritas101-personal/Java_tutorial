package day5;

public class ClassEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point1 p1 = new Point1();
		p1.currentLocation(1, 1);
		p1.moveLocation(4, 4);
		
	}

}
/* 클래스명 : Point1
 * 멤버변수 : x좌표, y좌표 (외부접근 불가하도록
 * 기능(메소드)
 * - 현재 좌표를 출력하는 기능
 * - x,y 좌표가 주어지면 해당 좌표로 이동하는 기능
 * - x의 값이 주어지면 x1의 값을 수정하는 기능
 * - y의 값이 주어지면 y1의 값을 수정하는 기능
 * - x1의 값을 가져오는 기능
 * - y1의 값을 가져오는 기능
 * 생성자
 * - 기본생성자
 * - x,y좌표가 주어졌을 때 객체를 생성하는 생성자
 */

class Point1 {
	
	private int x1;
	private int y1;
	
	public void currentLocation (int x, int y) { // 현재좌표 출력
	
		/* 기능: 현재 내 좌표
		 * 매개변수: 없음  / 아니, 내가 있는 곳을 누가 알려줘야 알수 있나?
		 * 리턴타입: 없음  / 매개변수도 없는데 어떻게 함?
		 * 메소드명: currentLocation () { 
		 */
		
		System.out.printf("(%d,%d)\n", x1,y1);
		
	
	}
	
	public void moveLocation (int x, int y) {
		
		/* 기능: 이동 할 좌표 받기
		 * 매개변수: 내가 가야할 x,y 좌표 => int x, y;
		 * 리턴타입: 없음  / 이미 어떻게 값을 출력할 지 알고 있는데 굳이?
		 * 메소드명: moveLocation () { 
		 */
		
		x1 = x;
		y1 = y;
		
		System.out.printf("(%d,%d)\n", x1,y1);
		
	}
	
	/* getter와 setter
	 * getter는 멤버변수가 private인 경우 직접 멤버변수의 값을 가져올 수 없기 때문에 그 멤버의 값에 접근 가능한 메소드
	 * setter는 멤버변수가 private인 경우 직접 멤버변수의 값을 설정할 수 없기 때문에 그 벰버의 값을 설정 가능한 메소드
	 */
	
	public int getX1() { // x1을 가져오는 메소드
		return x1;
	}

	public void setX1(int x1) { // x1을 설정해 주는 메소드
		this.x1 = x1;
	}

	public int getY1() { // y1을 가져오는 메소드
		return y1;
	}

	public void setY1(int y1) { // y1을 설정해 주는 메소드
		this.y1 = y1;
	}

	public int modifyY (int y ) {
		
		
		return yFix;
	}
	
	public int returnX1 (int x) {
		
		
		return goX;
	}
	
	public int returnY1 (int y) {
		
		return goY;
	}
}
