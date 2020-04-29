package day9;

public class InheritanceEx2 {

	public static void main(String[] args) {
		// 상속: 부모 클래스의 멤버변수나 메소드를 자식클래스가 물려받는 것
		// 부모의 멤버 변수나 메소드의 접근제한자가 private는 자식 클래스가 사용할 수 없다.
		// 상속에서 부모클래스는 하나만 가능하다.
		
			Shape s1 = new Shape(5, 5, 10, 10); // 클래스에서 생성자가 없으면 기본 생성자가 자동 생성
			s1.print();
			s1.resize(4, 5);
			s1.move(10, 10);
			s1.print();
			Square sq1 = new Square(5, 5, 10, 10); // 요건 Square 클래스에 생성자가 없던 상태, 받을 값 설정이 없어서 오류 발생헸음
			sq1.print();
			sq1.move(0, 0);
			sq1.resize(5, 5);
			sq1.print();
			Circle c1 = new Circle(0,0,5);
			c1.print();
			c1.move(0, 5);
			c1.print();
			c1.resize(2);
			c1.print();
			Circle c2 = new Circle();
			Shape.callCount();
			Square.squareCount();
			Circle.circleCount();
		

	}

}

