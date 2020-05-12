package day12;

import java.util.Scanner;

public class RegexEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		/*
		Point p = new Point();
		A a = new A();
		System.out.println(p.equals(a));
		int num = 10;
		System.out.println(p.equals(num));  // 원래는 안되는게 맞으나 num이 자동으로 Integer로 형변환되어서 가능해짐
		*/
		
		
		Point p1 = new Point(0,0);
		Point p2 = new Point(3,4);
		System.out.println(p1+"과 "+p2+"의 거리는 "+p1.distance(p2)+"입니다.");
		System.out.println(p1+"과 "+p2+"의 거리는 같은 점입니까? : " +p1.equals(p2));
		p2.setX(0);
		p2.setY(0);
		System.out.println(p1+"과 "+p2+"의 거리는 같은 점입니까? : " +p1.equals(p2));

		
	}

}
class A{}
class Point {
	
	private int x, y;
	
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public boolean equals(Object obj) { // 만약 Point 클래스를 직접 명시하면 다른 객체를 넣는 것이 블가! 
		// obj와 this가 같은 객체를 공유하고 있는 경우
		if (this == obj) return true;
		
		// 비교할 점 obj가 없는 경우, NullPointerException이 발생하는 걸 막아주는 역할
		if (obj == null) return false;
		
		// 비교할 obj가 Point 클래스가 아닌 경우
		if (getClass() != obj.getClass()) return false;
		
		//obj가 Point클래스의 객체인 경우
		Point other = (Point) obj;
		
		
		if (x != other.x) return false;
		if (y != other.y) return false;
		return true;
		
	}
	
	@Override
	public String toString() {
		
		return "Point [x=" + x + ", y=" + y + "]";
		
	}
	
	public double distance(Point other) {
		
		int distX = x - other.x;
		int distY = y - other.y;
		
		return Math.sqrt((Math.pow(distX, 2.0) + Math.pow(distY, 2.0)));
		
		
	}
	
}