package day9;

public class Circle extends Shape {
	private double centerX, centerY;
	
	public void print() {
		System.out.println("----------원의 정보-----------");
		System.out.printf("중심점은 (%.1f,%.1f)\n",centerX,centerY);
		System.out.printf("반지름 : %.2f\n",getRadius());
		System.out.println("---------------------------");
		

	}
	public Circle() {
		circleCall++;
	}
		
	public Circle(int left, int up, double radius) {
		super(left, up, radius*2, radius*2);
		centerX = left + radius;
		centerY = up - radius;
		/*
		setLeft(left);
		setUp(up);
		setWidth(radius*2);
		setHeight(radius*2);
		*/
		
		circleCall++;
	}
	public void move(int left, int up) {
		super.move(left, up);
		centerX = left + getRadius();
		centerY = up - getRadius();
		
	}
	public void resize(double radius) {
		resize(2*radius, 2*radius);
		centerX = getLeft() + radius; 
		// 앞의 left는 오버라이딩으로 인해 부모의 값을 직접 받는게 가능. 그러나 이번엔 오버로딩이기 때문에 같은 방법이 불가!
		centerY = getUp() - radius;
	}
	public double getRadius() { // 반지름 값을 받는 메소드가 없어서;;;
		return getWidth() / 2;
	}
	
	public static void circleCount() {
		System.out.println("원형 호출 횟수: " + circleCall);
	}
	
}
