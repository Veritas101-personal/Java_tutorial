package day8;

public class ConstructorEx1 {

	public static void main(String[] args) {
		Point p1 = new Point();
		p1.print();
		Point p2 = new Point(1,2);
		p2.print();
		int num1;
		int num2 = 10;
		num1 = num2;
		int num3 = num1; // 12라인에서 num1이 num2에 의해 변수 초기화, 주석 처리하면 바로 에러뜸
		int i;


	}

}
class Point{
	int x=1;
	int y=1;
	{
		//초기화 블럭
		x= 10;
		y= 10;
	}
	static {
		// 클래스 초기화 블럭
		// 클래스 변수만 초기화 가능
	}
	void print() {
		System.out.printf("(%d,%d)",x,y);
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public Point(){
		this(100,100);
	}
	// 복사 생성자
	public Point(Point p) {
		// 다른 생성자 this()를 이용할 때에는 메소드의 첫번째줄에 넣어주어야 한다.
		this(p.x, p.y);
		this.x = p.x;
		this.y = p.y;
		
	}
	
}