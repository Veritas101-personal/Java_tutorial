package day9;

public class Shape {
	private int left; // 시작점의 x 좌표
	private int up; // 시작점의 y 좌표
	private double width; // 가로의 길이
	private double height; // 세로의 길이
	public static int callCount = 0;
	protected static int squareCall = 0;
	protected static int circleCall = 0;
	public void print() {
		System.out.println("--------도형의 정보-----------");
		System.out.printf("시작점은 (%d,%d)\n",left,up);
		System.out.printf("가로 : %.2f\n",width);
		System.out.printf("세로 : %.2f\n",height);
		System.out.println("---------------------------");
		
		
	}
	public Shape() {
		callCount++;
	} // <= 자식 클래스의 생성자에서는 부모 클래스의 생성자를 사용하지 않으면 자동으로 super()라는 부모의 기본생성자 호출
 	public Shape(int left, int up, double width, double height) {
		this.left = left;
		this.up = up;
		this.width = width;
		this.height = height;
		
		callCount++;
	}
	
	public void move(int left, int up) {
		this.left = left;
		this.up = up;
	}
	public void resize(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	
	public static void callCount() {
		System.out.println("지금까지 도형 호출한 횟수: " + callCount);
	
	}
	
	
	
	
	public int getLeft() {
		return left;
	}
	public void setLeft(int left) {
		this.left = left;
	}
	public int getUp() {
		return up;
	}
	public void setUp(int up) {
		this.up = up;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
		
	
}

