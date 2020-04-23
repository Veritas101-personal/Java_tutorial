package day5;

public class ClassEx2 {

	/* 변수
	 *  - 일반변수: 실제 사용하는 값을 저장하는 변수
	 *  - 참조변수: 주소를 저장하는 변수 = > 누군가와 연결
	 *  - 지역변수: 사용하는 지역에서 제약이 있는 변수 (즉 메소드나 반복문에 있는 변수들은 모두 지역변수)
	 *	- 객체변수(멤버변수) 클래스 내에선 어디든지 사용가능!
	 *	- 클래스변수(예 - static): 
	 *	- 멤버변수 : 객체를 생성해야 사용 가능
	 *	- 멤버메소드 : 클래스 변수 사용가능
	 *
	 * 클래스 변수(static): 객체 생성 없이 사용
	 * 클래스 메소드
	 * 	- 객체 생성 없이 사용 = > 클래스명.메소드명()으로 사용
	 * 	- 클래스 메소드에는 객체변수를 사용할 수 없음
	 * 
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point1.printCounts();
		// p1이란 객체 생성전이기 때문에 Point1을 추출하여 printCounts를 불러온다.
		Point1 p1 = new Point1();
		p1.currentLocation();
		p1.moveLocation(4, 5);
		p1.currentLocation();
		p1.setX1(2);
		p1.currentLocation();
		p1.setY1(7);
		p1.currentLocation();
		p1.printCounts();
		Point1 p2 = new Point1(10,10);
		p2.currentLocation();
		p2.printCounts();
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
	
	private static int count;

	
	public void currentLocation () { // 현재좌표 출력
	
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
	/* 생성자가 하나도 없으면 기본 생성자를 생략해도 클래스에 기본생성자가 자동으로 만들어진다.
	 * 생성자 오버로딩이 되어 있고 기본 생성자가 없으면, 이때는 자동으로 기본 생성자를 만들지 않아서 기본생성자를 이용한 객체를 만들 수 없다.
	 * */
	public Point1 () {
		count++;
	}
	public Point1 (int x, int y) {
		x1 = x; y1 = y;
		count++;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Point1.count = count;

	}
	public static void printCounts( ) {
		// 에러발생, 클래스 메소드에는 객체(멤버)변수를 사용할 수 없다.
		// 왜냐하면 클래스 메소드는 객체 변수가 없어도 가능하지만
		// x1이라는 객체변수는 객체를 생성해야 사용할 수 있는 변수이기 때문에 클래스 메소드에선 사용 불가
		// System.out.println(x1);
		System.out.println("지금까지 만들어진 좌표의 갯수: " + count);
	}
}
